/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import view.nuevaReserva.ReservasDisponiblesVista;
import view.nuevaReserva.NuevaReserva;

/**
 *
 * @author garciparedes
 */
public class CrearReserva {
    
    //private JFrame currentState;
    
    private NuevaReserva nuevaReservaState;
    private ReservasDisponiblesVista reservasDisponiblesVistaState; 

    public CrearReserva() {
        
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                nuevaReservaState = new view.nuevaReserva.NuevaReserva(); 
                nuevaReservaState.setVisible(true);
            } 
        });
    }
    
    public void buscarReservasDisponibles(){
        nuevaReservaState.setVisible(false);
        
        if (reservasDisponiblesVistaState == null){
            System.out.println("Hola");
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        reservasDisponiblesVistaState = new ReservasDisponiblesVista();
                        reservasDisponiblesVistaState.setVisible(true);

                } 
            });
        }

    }
    
    public void close() {
        
        nuevaReservaState.setVisible(false);
    }
    public void show(){         
        
        nuevaReservaState.setVisible(true);
    }
    
}
