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
    private boolean disponible;
    
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
        this.disponible = true;
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
        return getTipoEstancia().toString();
    }
    
    public String getTipoHabitacionString(){
        return getTipoHabitacion().toString();
    }

    public boolean coincide(Reserva reserva) {
        boolean coincide = false;
        
        if (getTipoEstancia().coincide(reserva.getTipoEstancia())
                && getTipoHabitacion().coincide(reserva.getTipoHabitacion())
                && getPeriodo().disponible(reserva.getPeriodo())
                && isDisponible()
                ){
            coincide = true;
        }
        
        return coincide;
    }

    private boolean isDisponible() {
        return disponible;
    }

    void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }  

    public int getTipoEstanciaOrdinal() {
        try{
            return getTipoEstancia().ordinal();
        } catch(NullPointerException e){
            return -1;
        }
    }

    public int getTipoHabitacionOrdinal() {
        try{
            return getTipoHabitacion().ordinal();
        } catch(NullPointerException e){
            return -1;
        }    
    }
}
