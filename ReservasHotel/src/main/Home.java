/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import view.home.HomeVista;

/**
 *
 * @author adri
 */
public class Home {

    private JFrame currentState;
    
    public Home() {
        
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new view.home.HomeVista();
                currentState.setVisible(true);
            } 
        });
    }

    public void update() {
        ((HomeVista) currentState).update();
    }

    public void mostrar() {
        currentState.setVisible(true);
        ((HomeVista) currentState).update();

    }

    public void ocultar() {
        currentState.setVisible(false);
    }
}
