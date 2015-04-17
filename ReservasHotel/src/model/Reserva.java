/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.TipoEstancia;
import enums.TipoHabitacion;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author adri
 */
public class Reserva {
    
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    private TipoEstancia tipoEstancia;
    private TipoHabitacion tipoHabitacion;
    

    public Reserva(GregorianCalendar fechaEntrada,
            GregorianCalendar fechaSalida, TipoEstancia tipoEstancia,
            TipoHabitacion tipoHabitacion) {
        
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoEstancia = tipoEstancia;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public Object[] toArray(){
        Object[] objectArray = {getFechaEntradaString()
                , getFechaSalidaString()
                , getTipoEstanciaString()
                , getTipoHabitacionString()
        };
        return objectArray;
    }
        
    public String getFechaEntradaString(){
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy");
        String time = timeFormat.format(fechaEntrada.getTime());
        return time;
    }
    
    public String getFechaSalidaString(){
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy");
        String time = timeFormat.format(fechaSalida.getTime());
        return time;
    }
    
    public String getTipoEstanciaString(){
        return tipoEstancia.toString();
    }
    
    public String getTipoHabitacionString(){
        return tipoHabitacion.toString();

    }
    
    
    
}
