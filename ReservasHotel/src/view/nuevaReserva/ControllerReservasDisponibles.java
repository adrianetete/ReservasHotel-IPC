package view.nuevaReserva;

/**
 * Clase <code>ControllerReservasDisponibles</code> que hereda de la clase
 * abstracta <code>ControllerReservar</code> y sirve de controlador a la vista
 * <code>ReservasDisponiblesVista</code>
 * 
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import javax.swing.JOptionPane;
import main.Start;
import model.Reserva;

public class ControllerReservasDisponibles  extends AbstractControllerReservar{

    private ReservasDisponiblesVista vista;
    
    /**
     * Constructor de la clase <code>ControllerReservasDisponibles</code>
     * @param vista
     * @param reserva 
     */
    public ControllerReservasDisponibles(ReservasDisponiblesVista vista, Reserva reserva) {
        super(vista, reserva);
        
        this.vista = vista;
    }
    
    @Override
    public void buscar(){
        vista.setJTableModel(Start.getHotel().buscarReservasDisponibles(getReservaBusqueda()));
    }

    /**
     * Accion del boton reservar.
     */
    public void reservar() {
        
        if (vista.getJTableSelectedRow() >= 0){
            
            int dialogResult = JOptionPane.showConfirmDialog (null
                    , "¿Está seguro de que desea hacer la reserva?"
                    ,"Atencion",
                    JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION){
                Reserva reservaFinal = Start.getHotel().buscarReservasDisponibles(getReservaBusqueda()).get(
                                vista.getJTableSelectedRow());
                reservaFinal.fijarPeriodo(getReservaBusqueda());
                Start.completarReserva(reservaFinal);
            }
        }
    }

}
