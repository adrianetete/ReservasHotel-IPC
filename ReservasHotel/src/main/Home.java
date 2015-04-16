/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;

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
                currentState = new view.Home();
                currentState.setVisible(true);
            } 
        });
    }
 
    
}
