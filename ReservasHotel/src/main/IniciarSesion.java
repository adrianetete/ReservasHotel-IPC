package main;

/**
 * Clase <code>IniciarSesion</code> que representa el estado del Frame
 * encargado de iniciar sesion en hotel con nombre y contraseña.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import javax.swing.JFrame;

public class IniciarSesion {

    private JFrame currentState;

    /**
     * Constructor de la clase <code>IniciarSesion</code> que crea un nuevo
     * hilo con la ventana.
     */
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

    /**
     * Oculta la ventana.
     */
    public void close() {
        
        currentState.setVisible(false);
    }
    
    /**
     * Muestra la ventana.
     */
    public void show(){         
        
        currentState.setVisible(true);
    }
    
}
