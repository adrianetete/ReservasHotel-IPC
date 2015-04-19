package view.listaReservas;

/**
 * Clase <code>ControllerListaReserva</code> que sirve de controlador para la vista
 * <code>ListaReservasVista</code>.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import main.Start;

public class ControllerListaReserva {

    private ListaReservasVista vista;

    /**
     * Constructor de la clase <code>ControllerListaReserva</code>.
     * @param vista instancia de la vista a controlar
     */
    public ControllerListaReserva(ListaReservasVista vista) {     
        this.vista = vista;
    }
    
    /**
     * Controla la accion del boton que borra la reserva.
     */
    public void eliminarReserva(){
        if (vista.getJTableSelectedRow() >= 0){
            Start.getHotel().getListaReservas().add(
                    Start.getUsuario().getListaReservas().remove(vista.getJTableSelectedRow())
            );
            
            vista.setJTableModel(Start.getUsuario().getListaReservas());
        }
    }

    /**
     * Manda cerrar la ventana.
     */
    void cancelar() {
        Start.getStateMachineListaReservas().cancelar();
    }
    
}
