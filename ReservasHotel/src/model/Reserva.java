package model;

/**
 * Clase <code>Reserva</code> que marca la reserva del hotel, contiene
 * el numero de plazas, un periodo concreto y los tipos tanto de estancia
 * (tipo de pension elegida) y de habitacion. Las reservas contienen un
 * soo tipo de habitación y un solo tipo de estancia. Para reservar dos
 * habitaciones, hay que hacer dos reservas distintas.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import enums.TipoEstancia;
import enums.TipoHabitacion;
import java.util.Random;

public class Reserva {
    
    private Periodo periodo;

    private TipoEstancia tipoEstancia;
    private TipoHabitacion tipoHabitacion;
    private int plazas;
    
    /**
     * Constructor de la clase <code>Reserva</code> que establece el periodo
     * pasado por parametro.
     * @param periodo
     * @param tipoEstancia
     * @param tipoHabitacion
     * @param plazas 
     */
    public Reserva(Periodo periodo, TipoEstancia tipoEstancia,
            TipoHabitacion tipoHabitacion, int plazas) {
        
        this.periodo = periodo;
        this.tipoEstancia = tipoEstancia;
        this.tipoHabitacion = tipoHabitacion;
        this.plazas = plazas;
    }
    
    /**
     * Constructor de la clase <code>Reserva</code> que crea un nuevo periodo.
     */
    public Reserva(){
        
        this.periodo = new Periodo();
    }
    
    /**
     * Crea una reserva en el hotel con valores aleatorios de los Enum
     * <code>TipoEstancia</code> y <code>TipoHabitacion</code>.
     * @return 
     */
    public static Reserva randReserva(){
        
        Random rand = new Random();

        int ranEstancia = rand.nextInt(TipoEstancia.values().length);
        int ranHabitacion = rand.nextInt(TipoHabitacion.values().length);
        int ranPlazas;
        
        TipoHabitacion tipoHabitacion = TipoHabitacion.values()[ranHabitacion];

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

    public Object[] toArray(){
        
        Object[] objectArray = {getFechaEntradaString()
                , getFechaSalidaString()
                , getTipoEstanciaString()
                , getTipoHabitacionString()
                , getPlazas()
        };
        return objectArray;
    }
    
    /**
     * Getter del periodo.
     * @return 
     */
    public Periodo getPeriodo(){
        return periodo;
    }
    
    /**
     * Getter del tipo de estancia.
     * @return 
     */
    public TipoEstancia getTipoEstancia(){
        return tipoEstancia;
    }
    
    /**
     * Getter del tipo de habitacion.
     * @return 
     */
    public TipoHabitacion getTipoHabitacion(){
        return tipoHabitacion;
    }
    
    /**
     * Setter del tipo de estancia.
     * @param value 
     */
    public void setTipoEstancia (TipoEstancia value){
        this.tipoEstancia = value;
    }
    
    /**
     * Establece un tipo de habitación para la reserva.
     * @param value
     * @throws IllegalArgumentException 
     */
    public void setTipoHabitacion (TipoHabitacion value) throws IllegalArgumentException{
        
        if (getPlazas() == 2 && value == TipoHabitacion.INDIVIDUAL){
            
            throw new IllegalArgumentException("Las habitaciones individuales son para una plaza.");
            
        } else if (getPlazas() == 1 && value == TipoHabitacion.DOBLE){
            
            throw new IllegalArgumentException("Las habitaciones dobles son para dos plazas.");
            
        } else if (getPlazas() == 2 && value == TipoHabitacion.DOBLE_DE_USO_INDIVIDUAL){
            
            throw new IllegalArgumentException("Las habitaciones dobles de uso individual solo son para una plaza.");
        }
        
        this.tipoHabitacion = value;
    }
    
    /**
     * String con la fecha de entrada.
     * @return 
     */
    public String getFechaEntradaString(){
        
        return getPeriodo().getFechaEntradaString();
    }
    
    /** 
     * String con la fecha de salida.
     * @return 
     */
    public String getFechaSalidaString(){
        
        return getPeriodo().getFechaSalidaString();
    }
    
    /**
     * String con e tipo de estancia.
     * @return 
     */
    public String getTipoEstanciaString(){
        
        return getTipoEstancia().toString();
    }
    
    /**
     * String con el tipo de habitacion.
     * @return 
     */
    public String getTipoHabitacionString(){
        
        return getTipoHabitacion().toString();
    }

    /**
     * Establece como periodo, el periodo de una reserva pasada por
     * parametro.
     * @param reserva 
     */
    public void fijarPeriodo(Reserva reserva){
        
        setPeriodo(reserva.getPeriodo());
    }
    
    public void setPeriodo(Periodo periodo){
        this.periodo = periodo;
    }
    
    /**
     * Comprueba si la reserva pasada por parametro es igual que esta.
     * @param reserva
     * @return 
     */
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

    /**
     * Devuelve el tipo de la estancia.
     * @return 
     */
    public int getTipoEstanciaOrdinal() {
        
        try{
            
            return getTipoEstancia().ordinal();
            
        } catch(NullPointerException e){
            
            return -1;
        }
    }

    /**
     * Devuelve el tipo de la habitacion.
     * @return 
     */
    public int getTipoHabitacionOrdinal() {
        try{
            return getTipoHabitacion().ordinal();
        } catch(NullPointerException e){
            return -1;
        }    
    }

    /**
     * Getter del atributo plazas.
     * @return 
     */
    public int getPlazas() {
        return plazas;
    }
    
    /**
     * Establece el numero de plazas.
     * @param value
     * @throws IllegalArgumentException 
     */
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

    /**
     * Devuelve true si caben mas personas en la habitacion.
     * @param plazas
     * @return 
     */
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
