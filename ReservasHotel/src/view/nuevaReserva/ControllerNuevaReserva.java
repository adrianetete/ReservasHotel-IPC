/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

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
public class ControllerNuevaReserva extends AbstractControllerReservar {
    
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