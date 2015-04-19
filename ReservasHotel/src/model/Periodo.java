/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author garciparedes
 */
public class Periodo {
    
    private static final String FAIL_INICIO = "La fecha de inicio debe ser anterior a la de fin.";
    private static final String FAIL_FIN = "La fecha de fin debe ser posterior a la de inicio.";

    private GregorianCalendar inicio;
    private GregorianCalendar fin;
    
    
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
    
    public Periodo(GregorianCalendar inicio, GregorianCalendar fin){
        super();
        
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public Periodo(){
        super();
    }

    public GregorianCalendar getInicio(){
        return inicio;
    }
    
    public GregorianCalendar getFin(){
        return fin;
    }
    
    public void setInicio(GregorianCalendar inicio) throws IllegalArgumentException {
        if​( getFin() != null && getFin().before(inicio)) 
            throw​​ new​ IllegalArgumentException(FAIL_INICIO);
    
        this.inicio = inicio;
    }
    
    public void setFin(GregorianCalendar fin)throws IllegalArgumentException {
        if​( getInicio() != null && getInicio().after(fin)) 
            throw​​ new​ IllegalArgumentException(FAIL_FIN);
        this.fin = fin;
    }
    
    public boolean disponible(Periodo periodo) {
        boolean disponible = true;
        
        if(getInicio().after(periodo.getInicio()) 
                || getFin().before(periodo.getFin())
                ){
            disponible = false;
        }
        
        return disponible;
                
                
    }

    public String getFechaEntradaString(){
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy");
        String time = timeFormat.format(inicio.getTime());
        return time;
    }    
    
    public String getFechaSalidaString(){
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy");
        String time = timeFormat.format(fin.getTime());
        return time;
    }
}
