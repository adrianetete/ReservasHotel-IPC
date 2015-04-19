/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import view.listaReservas.ListaReservasVista;

/**
 *
 * @author garciparedes
 */
public class ListaReservas {
    
    private JFrame currentState;

    public ListaReservas() {
               
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                    currentState = new ListaReservasVista();
                    currentState.setLocationRelativeTo(null);
                    currentState.setVisible(true);
                
            } 
        });
    }

    public void cancelar() {
        currentState.setVisible(false);
        Start.getStateMachineHome().mostrar();

    }
    public void show(){         
        
        currentState.setVisible(true);
    }
}
