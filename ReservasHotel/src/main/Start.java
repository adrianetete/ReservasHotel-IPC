package main;

import enums.TipoEstancia;
import enums.TipoHabitacion;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Calendar;
>>>>>>> 2766946347340c34ff949e42dabdec7d1aa054e8
import java.util.GregorianCalendar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
    
    public static void main(String[] args) {
        
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
        
        garciparedes.addReserva(new Reserva((GregorianCalendar) GregorianCalendar.getInstance()
                , (GregorianCalendar) GregorianCalendar.getInstance()
                , TipoEstancia.SA
                , TipoHabitacion.DOBLEDEUSOINDIVIDUAL)
        );
        
        garciparedes.addReserva(new Reserva((GregorianCalendar) GregorianCalendar.getInstance()
                , (GregorianCalendar) GregorianCalendar.getInstance()
                , TipoEstancia.PC
                , TipoHabitacion.SUPERIOR)
        );
        
        garciparedes.addReserva(new Reserva((GregorianCalendar) GregorianCalendar.getInstance()
                , (GregorianCalendar) GregorianCalendar.getInstance()
                , TipoEstancia.AD
                , TipoHabitacion.SUITE)
        );
        
        garciparedes.addReserva(new Reserva((GregorianCalendar) GregorianCalendar.getInstance()
                , (GregorianCalendar) GregorianCalendar.getInstance()
                , TipoEstancia.MP
                , TipoHabitacion.INDIVIDUAL)
        );
        
        garciparedes.addReserva(new Reserva((GregorianCalendar) GregorianCalendar.getInstance()
                , (GregorianCalendar) GregorianCalendar.getInstance()
                , TipoEstancia.MP
                , TipoHabitacion.INDIVIDUAL)
        );
        
<<<<<<< HEAD
        
=======
>>>>>>> 2766946347340c34ff949e42dabdec7d1aa054e8
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
<<<<<<< HEAD
=======
        
        
>>>>>>> 2766946347340c34ff949e42dabdec7d1aa054e8
        
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
}
