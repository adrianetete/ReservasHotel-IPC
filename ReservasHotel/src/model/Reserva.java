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
        super();
        
        this.periodo = periodo;
        this.tipoEstancia = tipoEstancia;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public Reserva(){
        super();
        
        this.periodo = new Periodo();
    }

    public Object[] toArray(){
        Object[] objectArray = {getFechaEntradaString()
                , getFechaSalidaString()
                , getTipoEstanciaString()
                , getTipoHabitacionString()
        };
        return objectArray;
    }
    
    public Periodo getPeriodo(){
        return periodo;
    }
    
    public TipoEstancia getTipoEstancia(){
        return tipoEstancia;
    }
    
    public TipoHabitacion getTipoHabitacion(){
        return tipoHabitacion;
    }
    
    public void setTipoEstancia (TipoEstancia value){
        this.tipoEstancia = value;
    }
    
    public void setTipoHabitacion (TipoHabitacion value){
        this.tipoHabitacion = value;
    }
    public String getFechaEntradaString(){
        return getPeriodo().getFechaEntradaString();
    }
    
    public String getFechaSalidaString(){
        return getPeriodo().getFechaSalidaString();
    }
    
    public String getTipoEstanciaString(){
        return getTipoHabitacion().toString();
    }
    
    public String getTipoHabitacionString(){
        return getTipoHabitacion().toString();

    }
    
    
    
}
