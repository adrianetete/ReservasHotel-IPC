package view.iniciarsesion;

/**
 * Clase <code>ControllerIniciarSesion</code> que sirve de controlador 
 * para la vista <code>IniciarSesionVista</code>.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
import main.Start;
import model.Usuario;

public class ControllerIniciarSesion {
    
    private IniciarSesionVista vista;

    /**
     * Constructor de la clase <code>ControllerIniciarSesion</code>.
     * @param vista vista a controlar
     */
    public ControllerIniciarSesion(IniciarSesionVista vista) {
        this.vista = vista;
    }

    /**
     * Inicia la sesion, si son correctos los datos proporcionados por
     * el usuario y pasa al estado <code>Home</code> actualizando los datos.
     */
    public void iniciarSesion() {
        String username = vista.getJTextFieldUsername();
        String password = vista.getJTextFieldPassword();
        
        ArrayList<Usuario> listaUsuarios = Start.getListaUsuarios();
        Usuario usuario;
        
        for (int i = 0 ; i < listaUsuarios.size(); i++){
            
            usuario = listaUsuarios.get(i);
            
            if (usuario.getUsername().equals(username) 
                    && usuario.getPassw().equals(password)){
                Start.setUsuario(usuario);
                Start.getStateMachineIniciarSesion().close();
                Start.getStateMachineHome().update();
            }
        }
    }

    /**
     * Cierra la vista.
     */
    public void cancel() {
        Start.getStateMachineIniciarSesion().close();
    }

    /**
     * Muetra un dialog con las contraseñas por defecto de los usuarios.
     */
    public void forgotPassWord() {
        JOptionPane.showMessageDialog(vista,
            "La contraseña por defecto es: " +  Usuario.DEFAULT_PASSWORD,
            "Olvidé mi contraseña",
            JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Muestra un dialog con los usuarios creados.
     */
    public void help() {
        JOptionPane.showMessageDialog(vista,
            "Los nombres de usuario disponibles son los siguientes: \n"
                + Usuario.getUsernamesString(Start.getListaUsuarios()),
            "Ayuda",
            JOptionPane.PLAIN_MESSAGE);
    }
}
