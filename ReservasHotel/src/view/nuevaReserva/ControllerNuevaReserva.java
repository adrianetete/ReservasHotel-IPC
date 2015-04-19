/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

import enums.TipoEstancia;
import enums.TipoHabitacion;
import main.Start;
import model.Reserva;
import view.utils.DatePicker;

/**
 *
 * @author garciparedes
 */
public class ControllerNuevaReserva {
    private NuevaReserva vista;
    private Reserva reserva;
    
    public ControllerNuevaReserva(NuevaReserva vista){
        this.vista = vista;
        this.reserva = new Reserva();
    }
    
    public void setFechaEntrada(){
        reserva.getPeriodo().setInicio(
                new DatePicker(vista).setPickedDate()
        );
        
        vista.setJlabelFechaEntradaString(
                reserva.getPeriodo().getFechaEntradaString()
        );

    }
    
    public void setFechaSalida(){
        reserva.getPeriodo().setFin(
                new DatePicker(vista).setPickedDate()
        );
        
        vista.setJlabelFechaSalidaString(
                reserva.getPeriodo().getFechaSalidaString()
        );
    }
    
    public void setTipoEstancia(){
        /** 
         * Esta comprobacion se hace aqui
         * por que no tiene que ver con el
         * modeo sino con que se sale del array 
         * antes de que interactue con el.
         */
       
        try{
            reserva.setTipoEstancia(
                    TipoEstancia.values()[vista.getJComboBoxEstancia()-1]
            );
        } catch(ArrayIndexOutOfBoundsException e){
            reserva.setTipoEstancia(null);
        }
    }
    
    public void setTipoHabitacion(){
        try {
            reserva.setTipoHabitacion(
                TipoHabitacion.values()[vista.getJComboBoxHabitacion()-1]
        );
        } catch(ArrayIndexOutOfBoundsException e){
            reserva.setTipoHabitacion(null);
        }
        
    }
    
    public void buscar(){
        Start.crearReservaState.buscarReservasDisponibles(reserva);
    }
    
    public void cancelar(){
        vista.setVisible(false);
        vista.dispose();
    }
   
}
