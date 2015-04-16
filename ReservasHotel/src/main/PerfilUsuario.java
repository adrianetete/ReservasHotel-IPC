/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import view.perfilusuario.PerfilUsuarioVista;

/**
 *
 * @author garciparedes
 */
public class PerfilUsuario {
    
    
    private JFrame currentState;

    public PerfilUsuario() {
               
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new PerfilUsuarioVista(); 
                currentState.setVisible(true);
            } 
        });
    }
}
