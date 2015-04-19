package main;

/**
 * Clase <code>ListaReservas</code> que representa el estado del Frame
 * encargado de ver las reservas hechas por el usuario.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import javax.swing.JFrame;
import view.listaReservas.ListaReservasVista;

public class ListaReservas {
    
    private JFrame currentState;

    /**
     * Constructor de la clase <code>ListaReservas</code> que crea un nuevo
     * hilo con la ventana.
     */
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

    /**
     * Oculta la ventana y vuelve a <code>Home</code>.
     */
    public void cancelar() {
        
        currentState.setVisible(false);
        Start.getStateMachineHome().mostrar();

    }
    
    /**
     * Muestra la ventana.
     */
    public void show(){         
        
        currentState.setVisible(true);
    }
}
