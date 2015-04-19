package view.nuevaReserva;

/**
 * Clase <code>ControllerNuevaReserva</code> que hereda de la clase
 * abstracta <code>ControllerReservar</code> y sirve de controlador a la vista
 * <code>NuevaReserva</code>
 * 
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import javax.swing.JOptionPane;
import main.Start;
import model.Reserva;

public class ControllerNuevaReserva extends AbstractControllerReservar {
    
    /**
     * Constructor de la clase <code>ControllerNuevaReserva</code>
     * @param vista 
     */
    public ControllerNuevaReserva(NuevaReserva vista){
        super(vista, new Reserva());
    }
    
    @Override
    public void buscar(){
        if (getReservaBusqueda().getPeriodo().fijado()){
            Start.getStateMachineCrearReservas().buscarReservasDisponibles(getReservaBusqueda());
        } else {
             JOptionPane.showMessageDialog(null,
                "Introduce un periodo de Estancia",
                "Error en la fecha",
                JOptionPane.PLAIN_MESSAGE);
        
        }
        
    }
}