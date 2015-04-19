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
public abstract class AbstractControllerReservar {
    private Reserva reserva;
    private VistaReservaInterface vistaInterface;

    //private VistaReservaInterface vista;
    
    public AbstractControllerReservar(VistaReservaInterface vista, Reserva reserva){
        this.vistaInterface = vista;
        this.reserva = reserva;      
    }
    
    public Reserva getReservaActual(){
        return reserva;
    }

    public void setFechaEntrada(){
        try {
            reserva.getPeriodo().setInicio(
                    new DatePicker((JFrame) vistaInterface).setPickedDate()
            );

            vistaInterface.setJlabelFechaEntradaString(
                    reserva.getPeriodo().getFechaEntradaString()
            );
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog((JFrame) vistaInterface,
            e.getMessage(),
            "Error en la fecha",
            JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void setFechaSalida(){
        try{
            reserva.getPeriodo().setFin(
                    new DatePicker((JFrame) vistaInterface).setPickedDate()
            );
            
            
            vistaInterface.setJlabelFechaSalidaString(
                    reserva.getPeriodo().getFechaSalidaString()
            );
            
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog((JFrame) vistaInterface,
            e.getMessage(),
            "Error en la fecha",
            JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void setTipoEstancia(){
        
        try{
            reserva.setTipoEstancia(
                    TipoEstancia.values()[vistaInterface.getJComboBoxEstancia()-1]
            );
        } catch(ArrayIndexOutOfBoundsException e){
            reserva.setTipoEstancia(null);
        }
    }
    
    public void setTipoHabitacion(){
        try {
            reserva.setTipoHabitacion(
                TipoHabitacion.values()[vistaInterface.getJComboBoxHabitacion()-1]
            );
        } catch(ArrayIndexOutOfBoundsException e){
            reserva.setTipoHabitacion(null);
        }
        
    }
    
    public abstract void buscar();
    
    public void cancelar(){
        Start.getStateMachineCrearReservas().cancelar();
    };

}
