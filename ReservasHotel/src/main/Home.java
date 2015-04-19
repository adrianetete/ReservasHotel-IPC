package main;

/**
 * Clase <code>Home</code> que representa el estado del Frame principal
 * donde el usuario puede acceder a los demas:
 * <li><code>CrearReserva</code></li>
 * <li><code>IniciarSesion</code></li>
 * <li><code>ListaReservas</code></li>
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import javax.swing.JFrame;
import view.home.HomeVista;

public class Home {

    private JFrame currentState;
    
    /**
     * Constructor de la clase <code>Home</code> que crea un nuevo
     * hilo con la ventana.
     */
    public Home() {
        
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new view.home.HomeVista();
                currentState.setLocationRelativeTo(null);
                currentState.setVisible(true);
            } 
        });
    }
    
    /**
     * Getter que devuelve la ventana.
     * 
     * @return ventana del tipo <code>JFrame</code>
     */
    public JFrame getCurrentFrame(){
        return currentState;
    }

    /**
     * Refresca la ventana.
     */
    public void update() {
        ((HomeVista) currentState).update();
    }

    /**
     * Muestra la ventana.
     */
    public void mostrar() {
        currentState.setVisible(true);
        ((HomeVista) currentState).update();

    }

    /**
     * Oculta la ventana.
     */
    public void ocultar() {
        currentState.setVisible(false);
    }
}
