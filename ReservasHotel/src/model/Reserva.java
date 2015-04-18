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
import java.util.Random;

/**
 *
 * @author adri
 */
public class Reserva {
    
    private Periodo periodo;

    private TipoEstancia tipoEstancia;
    private TipoHabitacion tipoHabitacion;
    
    public static Reserva randReserva(){
        
        Random rand = new Random();

        int ranEstancia = rand.nextInt(TipoEstancia.values().length);
        int ranHabitacion = rand.nextInt(TipoHabitacion.values().length);

        return new Reserva(Periodo.randomPeriodo()
                ,TipoEstancia.values()[ranEstancia]
                , TipoHabitacion.values()[ranHabitacion]
        );
    }

    public Reserva(Periodo periodo, TipoEstancia tipoEstancia,
            TipoHabitacion tipoHabitacion) {
        
        this.periodo = periodo;
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
        return periodo.getFechaEntradaString();
    }
    
    public String getFechaSalidaString(){
        return periodo.getFechaSalidaString();
    }
    
    public String getTipoEstanciaString(){
        return tipoEstancia.toString();
    }
    
    public String getTipoHabitacionString(){
        return tipoHabitacion.toString();

    }
    
    
    
}
