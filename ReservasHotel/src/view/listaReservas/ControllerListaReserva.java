package view.listaReservas;

/**
 * Clase <code>ControllerListaReserva</code> que sirve de controlador para la vista
 * <code>ListaReservasVista</code>.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import javax.swing.JOptionPane;
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
            
            int dialogResult = JOptionPane.showConfirmDialog (null
                    , "¿Está seguro de que desea eliminar la reserva?"
                    ,"Atencion",
                    JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION){
                Start.getHotel().getListaReservas().add(
                        Start.getUsuario().getListaReservas().remove(vista.getJTableSelectedRow())
                );
            }
            
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
