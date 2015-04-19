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
    private Reserva reservaBusqueda;
    private VistaReservaInterface vistaInterface;

    //private VistaReservaInterface vista;
    
    public AbstractControllerReservar(VistaReservaInterface vista, Reserva reserva){
        this.vistaInterface = vista;
        this.reservaBusqueda = reserva;      
    }
    
    public Reserva getReservaBusqueda(){
        return reservaBusqueda;
    }

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
    
    public void setTipoEstancia(){
        
        try{
            reservaBusqueda.setTipoEstancia(
                    TipoEstancia.values()[vistaInterface.getJComboBoxEstancia()-1]
            );
        } catch(ArrayIndexOutOfBoundsException e){
            reservaBusqueda.setTipoEstancia(null);
        }
    }
    
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
    
    void setPlazas() {
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
    
    public abstract void buscar();
    
    public void cancelar(){
        Start.getStateMachineCrearReservas().cancelar();
    };

}
