/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.iniciarsesion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import main.Start;
import model.Usuario;

/**
 *
 * @author adri
 */
public class ControllerIniciarSesion {
    
    private IniciarSesionVista vista;

    ControllerIniciarSesion(IniciarSesionVista vista) {
        this.vista = vista;
    }

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

    public void cancel() {
        Start.getStateMachineIniciarSesion().close();
    }

    public void forgotPassWord() {
        JOptionPane.showMessageDialog(vista,
            "La contraseña por defecto es: " +  Usuario.DEFAULT_PASSWORD,
            "Olvidé mi contraseña",
            JOptionPane.PLAIN_MESSAGE);
    }

    public void help() {
        JOptionPane.showMessageDialog(vista,
            "Los nombres de usuario disponibles son los siguientes: \n"
                + Usuario.getUsernamesString(Start.getListaUsuarios()),
            "Ayuda",
            JOptionPane.PLAIN_MESSAGE);
    }
    
}
