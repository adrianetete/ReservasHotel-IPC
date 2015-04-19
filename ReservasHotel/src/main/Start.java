package main;

import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Hotel;
import model.Reserva;
import model.Usuario;

/**
 *
 * @author adri
 */
public class Start {
    
    private static Home homeState;
    private static IniciarSesion iniciarSesionState;
    private static ListaReservas listaReservasState;
    private static CrearReserva crearReservaState;

    
    private static ArrayList<Usuario> listaUsuarios;

    private static Usuario usuario;
    
    private static Hotel hotel;
    
    public static void main(String[] args) {
        
        hotel = new Hotel(200,"Hotel UVA", "10am - 10pm"
                ,"978-329-545" ,"hotel@uva.es"
                ,"C: Sin Nombre Nº 34", "Valladolid"
                ,"España"
        );
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
        listaUsuarios = new ArrayList<Usuario>();
        Usuario garciparedes = new Usuario("garciparedes", "Sergio", "Garcia Prado");
        
        for (int i = 0; i < 10; i++){
            garciparedes.addReserva(hotel.getListaReservas().remove(0));
        }
        
        
        listaUsuarios.add(garciparedes);
        listaUsuarios.add(new Usuario("adrianete", "Adrian", "Calvo Rojo"));
        listaUsuarios.add(new Usuario("menganito", "Perico", "de los Palotes"));

        usuario = garciparedes;
        homeState = new Home();
    }
    
    public static Home getStateMachineHome() {
        return homeState; 
    }
    
    public static IniciarSesion getStateMachineIniciarSesion() {
        return iniciarSesionState; 
    }
   
    public static ListaReservas getStateMachineListaReservas() {
        return listaReservasState; 
    }

    public static CrearReserva getStateMachineCrearReservas() {
        return crearReservaState; 
    }

    
    public static boolean isLoged(){
        return usuario != null;
    }

    public static void crearReserva() {
        
        homeState.ocultar();
        crearReservaState = new CrearReserva();
    }

    public static void iniciarSesion() {
        if (!isLoged()){ 
            iniciarSesionState = new IniciarSesion();    
        } else {
            usuario = null;
            homeState.update();
        }
    }
    
    public static void loginSucceed() { 
        
        iniciarSesionState.close();
    }
    
    public static void listaReservas(){
        
        if (!isLoged()){
            iniciarSesion();
        } else {
            homeState.ocultar();
            listaReservasState = new ListaReservas();
        }
        
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public static void setUsuario(Usuario usuarioNuevo){
        usuario = usuarioNuevo;
    }
    
    public static Usuario getUsuario(){
        return usuario;
    }
    
    public static Hotel getHotel(){
        return hotel;
    }

    public static void completarReserva(Reserva reserva) {
        getUsuario().addReserva(reserva);
        getHotel().getListaReservas().remove(reserva);
        crearReservaState.cancelar();
    }
}
