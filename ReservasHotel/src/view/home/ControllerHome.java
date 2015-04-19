package view.home;

/**
 * Clase <code>ControllerHome</code> que sirve de controlador para la vista
 * <code>HomeVista</code>.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import main.Start;

public class ControllerHome {
    
    private HomeVista vista;

    /**
     * Constructor de la clase <code>ControllerHome</code>
     * @param vista vista a controlar
     */
    public ControllerHome(HomeVista vista) {
        this.vista = vista;
    }
    
    /**
     * Cierra el programa.
     */
    public void salir(){
        
        System.exit(0);
    }

    /**
     * Pasa al estado de CrearReserva.
     */
    public void hacerReserva() {
        
        Start.crearReserva();
    }

    /**
     * Pasa al estado de ListaReservas.
     */
    public void verReservas() {
        Start.listaReservas();
    }

    /**
     * Pasa al estado de IniciarSesion.
     */
    public void iniciarSesion() {
        Start.iniciarSesion();
    }
    
}
