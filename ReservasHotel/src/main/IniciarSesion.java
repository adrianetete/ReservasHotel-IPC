/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JFrame;
import model.Usuario;

/**
 *
 * @author adri
 */
public class IniciarSesion {

    private JFrame currentState;

    public IniciarSesion() {
               
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new view.iniciarsesion.IniciarSesionVista(); 
                currentState.setLocationRelativeTo(null);
                currentState.setVisible(true);
            } 
        });
    }

    public void close() {
        currentState.setVisible(false);
    }
    public void show(){         
        
        currentState.setVisible(true);
    }
        
        
    
    
}
