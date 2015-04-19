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
public class ControllerNuevaReserva extends AbstractControllerReservar {
    //private NuevaReserva vista;
    
    public ControllerNuevaReserva(NuevaReserva vista){
        super(vista, new Reserva());
    }
    
    @Override
    public void buscar(){
        Start.getStateMachineCrearReservas().buscarReservasDisponibles(getReservaActual());
    }
   
}
