package model;

/**
 * Clase <code>Hotel</code> que contiene todos los atributos propios del
 * hotel y una lista con cada una de las reservas disponibles.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import java.util.ArrayList;

public class Hotel {
    
    /* Atributos del hotel */
    private final String nombre;
    private final String horario;
    private final String telefono;
    private final String email;
    private final String direccion;
    private final String poblacion;
    private final String pais;
    
    ArrayList<Reserva> listaReservasDisponibles;
    
    /**
     * Constructor de la clase <code>Hotel</code>
     * 
     * @param nReservas reservas a las que puede dar servicio
     * @param nombre nombre del hotel
     * @param horario horario de apertura
     * @param telefono telefono de contacto
     * @param email email de contacto
     * @param direccion direccion donde se localiza
     * @param poblacion poblacion donde se localiza
     * @param pais pais donde se localiza
     */
    public Hotel(int nReservas, String nombre
            ,String horario, String telefono, String email
            ,String direccion, String poblacion, String pais
    ){
        
        this.nombre = nombre;
        this.horario = horario;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.pais = pais;
        this.listaReservasDisponibles = new ArrayList<Reserva>();
        
        for(int i = 0; i< nReservas; i++){
            
            listaReservasDisponibles.add(Reserva.randReserva());
        }
    }
   
    public String getNombre(){
        return nombre;
    }
    
    public String getHorario(){
        return horario;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getPoblacion(){
        return poblacion;
    }
    
    public String getPais(){
        return pais;
    }
    
    /**
     * Devuelve un String que indica las habitaciones libres.
     * 
     * @return cadena de texto
     */
    public String getDisponibilidad(){
        return String.valueOf(getListaReservas().size()) + " habitaciones libres.";
    }
    
    public ArrayList<Reserva> getListaReservas(){
        return listaReservasDisponibles;
    }
    
    /**
     * Añade un objeto de la clase <code>Reserva</code> a la lista de reservas.
     * @param reserva 
     */
    public void addReserva(Reserva reserva){
        getListaReservas().add(reserva);
    }
    
        /**
     * Borra un objeto de la clase <code>Reserva</code> de la lista de reservas.
     * @param reserva 
     */
    public void removeReserva(Reserva reserva){
        getListaReservas().remove(reserva);
    }
    
    /**
     * Dadas unas condiciones de reserva, busca si hay alguna habitación
     * que coincida con los términos de busqueda.
     * 
     * @param reserva ocondiciones de reserva
     * @return lista con las reservas que coinciden con la busqueda
     */
    public ArrayList<Reserva> buscarReservasDisponibles(Reserva reserva){
        
        ArrayList<Reserva> busqueda = new ArrayList<Reserva>();
        
        for (int i = 0; i < listaReservasDisponibles.size(); i++){
            
            if (listaReservasDisponibles.get(i).coincide(reserva)){
                
                busqueda.add(listaReservasDisponibles.get(i));
            }
        }
        
        return busqueda;
    }
}
