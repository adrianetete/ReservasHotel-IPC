/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

import enums.TipoEstancia;
import enums.TipoHabitacion;
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
        reserva.setTipoEstancia(
                TipoEstancia.values()[vista.getJComboBoxEstancia()]
        );
        System.out.println(reserva.getTipoEstanciaString());
    }
    
    public void setTipoHabitacion(){
        reserva.setTipoHabitacion(
                TipoHabitacion.values()[vista.getJComboBoxEstancia()+1]
        );
    }
    
    public void enviar(){
        
    }
    
    public void cancelar(){
        vista.setVisible(false);
        vista.dispose();
    }
   
}
