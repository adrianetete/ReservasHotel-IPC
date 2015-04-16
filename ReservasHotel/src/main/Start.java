package main;

import java.util.ArrayList;
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
        listaUsuarios.add(new Usuario("garciparedes", "Sergio", "Garcia Prado"));
        listaUsuarios.add(new Usuario("adrianete", "Adrian", "Calvo Rojo"));
        listaUsuarios.add(new Usuario("perico", "Perico", "de los Palotes"));

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

    public static void hacerReserva() {
        
    }

    public static void iniciarSesion() {
        if (!isLoged()){ 
            iniciarSesionState = new IniciarSesion();    
        }
    }
    
    public static void loginSucceed() { 
        
        iniciarSesionState.close();
    }
    
    public static void listaReservas(){
        if (!isLoged()){
            iniciarSesion();
        }
        
        if (listaReservasState == null){
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
}
