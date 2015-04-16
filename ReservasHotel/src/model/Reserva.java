/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.TipoEstancia;
import enums.TipoHabitacion;
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
    
    
}
