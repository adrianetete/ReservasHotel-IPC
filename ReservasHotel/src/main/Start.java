package main;

import enums.TipoEstancia;
import enums.TipoHabitacion;
import java.util.ArrayList;
import java.util.GregorianCalendar;
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
    
    public static Home homeState;
    public static IniciarSesion iniciarSesionState;
    public static ListaReservas listaReservasState;
    public static CrearReserva crearReservaState;
    public static PerfilUsuario perfilUsuarioState;

    //private static ArrayList<Reserva> reservas;
    
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
        listaUsuarios.add(new Usuario("perico", "Perico", "de los Palotes"));

        usuario = garciparedes;
        homeState = new Home();
    }
    
    public static Home getStateMachineHome() {
        return homeState; 
    }
    
    
    public static IniciarSesion getStateMachineIniciarSesion() {
        return iniciarSesionState; 
    }
    
    
    public static PerfilUsuario getStateMachinePerfilUsuario() {
        return perfilUsuarioState; 
    }
    
    public static boolean isLoged(){
        return usuario != null;
    }

    public static void crearReserva() {
        
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
}
