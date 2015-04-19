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
    private int plazas;
    
    public static Reserva randReserva(){
        
        Random rand = new Random();

        int ranEstancia = rand.nextInt(TipoEstancia.values().length);
        int ranHabitacion = rand.nextInt(TipoHabitacion.values().length);
        TipoHabitacion tipoHabitacion = TipoHabitacion.values()[ranHabitacion];
        
        int ranPlazas;

        switch(tipoHabitacion){
            case INDIVIDUAL : 
                ranPlazas = 1;
                break;
                
            case DOBLE_DE_USO_INDIVIDUAL:
                ranPlazas = 1;
                break;
                
            case DOBLE: ranPlazas = 2;
                break;
            
            default:
                ranPlazas = rand.nextInt(2)+1;
                break;

        }
        
        return new Reserva(Periodo.randomPeriodo()
                ,TipoEstancia.values()[ranEstancia]
                ,TipoHabitacion.values()[ranHabitacion]
                ,ranPlazas
        );
    }

    public Reserva(Periodo periodo, TipoEstancia tipoEstancia,
            TipoHabitacion tipoHabitacion, int plazas) {
        super();
        
        this.periodo = periodo;
        this.tipoEstancia = tipoEstancia;
        this.tipoHabitacion = tipoHabitacion;
        this.plazas = plazas;
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
                , getPlazas()
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
    
    public void setTipoHabitacion (TipoHabitacion value) throws IllegalArgumentException{
        if (getPlazas() == 2 && value == TipoHabitacion.INDIVIDUAL){
            throw new IllegalArgumentException("Las habitaciones individuales son para una plaza.");
        } else if (getPlazas() == 1 && value == TipoHabitacion.DOBLE){
            throw new IllegalArgumentException("Las habitaciones doblesson para dos plazas.");
        } else if (getPlazas() == 2 && value == TipoHabitacion.DOBLE_DE_USO_INDIVIDUAL){
            throw new IllegalArgumentException("Las habitaciones dobles de uso individual solo son para una plaza.");
        }
        
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

    
    public void fijarPeriodo(Reserva reserva){
        setPeriodo(reserva.getPeriodo());
    }
    
    public void setPeriodo(Periodo periodo){
        this.periodo = periodo;
    }
    
    
    public boolean coincide(Reserva reserva) {
        boolean coincide = false;
        
        if (getTipoEstancia().coincide(reserva.getTipoEstancia())
                && getTipoHabitacion().coincide(reserva.getTipoHabitacion())
                && getPeriodo().disponible(reserva.getPeriodo())
                && caben(reserva.getPlazas())
                ){
            coincide = true;
        }
        
        return coincide;
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

    public int getPlazas() {
        return plazas;
    }
    
    public void setPlazas(int value) throws IllegalArgumentException{
        if (getTipoHabitacion() == TipoHabitacion.INDIVIDUAL && value == 2){
            throw new IllegalArgumentException("Las habitaciones individuales son para una plaza.");
        } else if(getTipoHabitacion() == TipoHabitacion.DOBLE && value == 1) {
            throw new IllegalArgumentException("Las habitaciones dobles son para dos plazas.");
        } else if(getTipoHabitacion() == TipoHabitacion.DOBLE_DE_USO_INDIVIDUAL && value == 2) {
            throw new IllegalArgumentException("Las habitaciones dobles de uso individual solo son para una plaza.");

        }
        this.plazas = value;
    }

    private boolean caben(int plazas) {
        if (plazas == 0){ 
            return true;
        } else{
            return (getPlazas() == plazas);
        }
    }

    public Object[] toArraySinFechas() {
        Object[] objectArray = {getTipoEstanciaString()
                , getTipoHabitacionString()
                , getPlazas()
        };
        return objectArray;
    }
}
