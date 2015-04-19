package model;

/**
 * Clase <code>Periodo</code> que marca un periodo entre dos fechas
 * concretas
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;

public class Periodo {
    
    private static final String FAIL_INICIO = "La fecha de inicio debe ser anterior a la de fin.";
    private static final String FAIL_FIN = "La fecha de fin debe ser posterior a la de inicio.";
    private static final String NULL_DATE = "--/--/--";
    private static final SimpleDateFormat DEFAUL_TIME_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

    private GregorianCalendar inicio;
    private GregorianCalendar fin;
    
    /**
     * Constructor de la clase <code>Periodo</code>.
     */    
    public Periodo(){
        super();
    }
    
    /**
     * Constructor de la clase <code>Periodo</code>.
     * 
     * @param inicio fecha de inicio del periodo
     * @param fin fecha fin del periodo
     */
    public Periodo(GregorianCalendar inicio, GregorianCalendar fin){
        super();
        
        this.inicio = inicio;
        this.fin = fin;
    }
    
    /**
     * Crea dos instancias de <code>GregorianCalendar</code>. A la primera 
     * se le asigna una fecha aleatoria y a la segunda se la suma una
     * longitud de tiempo aleatorio. Lo que conseguimos es un periodo aleatorio.
     * 
     * @return periodo generado
     */
    public static Periodo randomPeriodo(){
        
        GregorianCalendar inicio = (GregorianCalendar) GregorianCalendar.getInstance();
        GregorianCalendar fin = (GregorianCalendar) GregorianCalendar.getInstance();
        
        Random rand = new Random();
        
        int randInicio = rand.nextInt(90);
        int randLongitud = rand.nextInt(45);
        
        inicio.add(GregorianCalendar.DAY_OF_MONTH, randInicio);
        fin.add(GregorianCalendar.DAY_OF_MONTH, (randInicio+randLongitud));
        
        return new Periodo(inicio, fin);
        
    }
    
    public GregorianCalendar getInicio(){
        return inicio;
    }
    
    public GregorianCalendar getFin(){
        return fin;
    }
    
    /**
     * Establece una fecha como inicio del periodo.
     * @param inicio
     * @throws IllegalArgumentException 
     */
    public void setInicio(GregorianCalendar inicio) throws IllegalArgumentException {
        if​( getFin() != null && getFin().before(inicio)) 
            throw​​ new​ IllegalArgumentException(FAIL_INICIO);
    
        this.inicio = inicio;
    }
    
    /**
     * Establece una fecha como fin del periodo.
     * @param fin
     * @throws IllegalArgumentException 
     */
    public void setFin(GregorianCalendar fin)throws IllegalArgumentException {
        if​( getInicio() != null && getInicio().after(fin)) 
            throw​​ new​ IllegalArgumentException(FAIL_FIN);
        this.fin = fin;
    }
    
    /**
     * Indica si el periodo pasado por parametro se ecuentra dentro
     * de este periodo.
     * 
     * @param periodo
     * @return 
     */
    public boolean disponible(Periodo periodo) {
        boolean disponible = true;
        
        if(getInicio().after(periodo.getInicio()) 
                || getFin().before(periodo.getFin())
                ){
            disponible = false;
        }
        return disponible;
    }

    /**
     * Devuelve la fecha de entrada como String.
     * @return 
     */
    public String getFechaEntradaString(){
        
        String time;
        
        try{
            
            time = DEFAUL_TIME_FORMAT.format(inicio.getTime());
            
        } catch(NullPointerException e){
            
            time = NULL_DATE;
        }
        return time;
    }    
    /**
     * Devuelve la fecha de salida como String.
     * @return 
     */
    public String getFechaSalidaString(){
        
        String time;
        
        try{
            
            time = DEFAUL_TIME_FORMAT.format(fin.getTime());
            
        } catch(NullPointerException e){
            
            time = NULL_DATE;
        }
        return time;
    }

    public boolean fijado() {
        
        return !((getInicio() == null) || (getFin() == null));
    }
}
