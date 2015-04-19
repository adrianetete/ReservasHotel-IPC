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
class ControllerReservasDisponibles  extends AbstractControllerReservar{

    private ReservasDisponiblesVista vista;
    
    ControllerReservasDisponibles(ReservasDisponiblesVista vista, Reserva reserva) {
        super(vista, reserva);
        
        this.vista = vista;
    }
    
    @Override
    public void buscar(){
        vista.setJTableDate(Start.getHotel().buscarReservasDisponibles(getReservaActual()));
    }
    
}
