/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;

/**
 *
 * @author garciparedes
 */
public class CrearReserva {
    
    private JFrame currentState;

    public CrearReserva() {
        
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new view.nuevaReserva.NuevaReserva(); 
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
