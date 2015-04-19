package view.nuevaReserva;

/**
 * Clase abstracta <code>AbstractControllerReservar</code>. que sirve de interfaz
 * para el controlador <code>ControllerNuevaReserva</code>.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import enums.TipoEstancia;
import enums.TipoHabitacion;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.Start;
import model.Reserva;
import view.utils.DatePicker;

/**
 *
 * @author garciparedes
 */
public abstract class AbstractControllerReservar {
    
    private Reserva reservaBusqueda;
    private VistaReservaInterface vistaInterface;
    
    /**
     * Conctructor de la clase <code>AbstractControllerReservar</code>.
     * @param vista
     * @param reserva 
     */
    public AbstractControllerReservar(VistaReservaInterface vista, Reserva reserva){
        this.vistaInterface = vista;
        this.reservaBusqueda = reserva;      
    }
    
    /**
     * Devuelve la reserva.
     * @return 
     */
    public Reserva getReservaBusqueda(){
        return reservaBusqueda;
    }

    /**
     * Establece la fecha de entrada indicada en el calendario por el usuario.
     */
    public void setFechaEntrada(){
        
        try {
            reservaBusqueda.getPeriodo().setInicio(
                    new DatePicker().setPickedDate()
            );

            vistaInterface.setJlabelFechaEntradaString(
                    reservaBusqueda.getPeriodo().getFechaEntradaString()
            );
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog((JFrame) vistaInterface,
                e.getMessage(),
                "Error en la fecha",
                JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    /**
     * Establece la fecha de salida indicada en el calendario por el usuario.
     */
    public void setFechaSalida(){
        
        try{
            reservaBusqueda.getPeriodo().setFin(
                    new DatePicker().setPickedDate()
            );
            
            
            vistaInterface.setJlabelFechaSalidaString(
                    reservaBusqueda.getPeriodo().getFechaSalidaString()
            );
            
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog((JFrame) vistaInterface,
                e.getMessage(),
                "Error en la fecha",
                JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    /**
     * Establece el tipo de estancia.
     */
    public void setTipoEstancia(){
        
        try{
            reservaBusqueda.setTipoEstancia(
                    TipoEstancia.values()[vistaInterface.getJComboBoxEstancia()-1]
            );
        } catch(ArrayIndexOutOfBoundsException e){
            reservaBusqueda.setTipoEstancia(null);
        }
    }
    
    /**
     * Establece el tipo de habitacion.
     */
    public void setTipoHabitacion(){
        
        try {
            reservaBusqueda.setTipoHabitacion(
                TipoHabitacion.values()[vistaInterface.getJComboBoxHabitacion()-1]
            );
        } catch(ArrayIndexOutOfBoundsException e){
            reservaBusqueda.setTipoHabitacion(null);
            
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog((JFrame) vistaInterface,
                e.getMessage(),
                "Error en el tipo de Habitacion",
                JOptionPane.PLAIN_MESSAGE);
        }
        vistaInterface.setJComboBoxHabitacionIndex(reservaBusqueda.getTipoHabitacionOrdinal()+1);
    }
    
    /**
     * Establece las plazas de la habitación.
     */
    public void setPlazas() {
        
        try{
            reservaBusqueda.setPlazas(
                    vistaInterface.getJComboBoxPlazas()
            );

        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog((JFrame) vistaInterface,
                e.getMessage(),
                "Error en el Nº plazas",
                JOptionPane.PLAIN_MESSAGE);
        }
        vistaInterface.setJComboBoxPlazasIndex(reservaBusqueda.getPlazas());

    }
    
    /**
     * Accion del boton buscar, sobreescrito en cada tipo de ventana.
     */
    public abstract void buscar();
    
    /**
     * Cierra la ventana.
     */
    public void cancelar(){
        
        Start.getStateMachineCrearReservas().cancelar();
    };

}
