/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author garciparedes
 */
public class Hotel {
    
    private String nombre;
    private String horario;
    private String telefono;
    private String email;
    private String direccion;
    private String poblacion;
    private String pais;
    
    ArrayList<Reserva> listaReservasDisponibles;
    
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
    
    public String getDisponibilidad(){
        return String.valueOf(getListaReservas().size()) + " habitaciones libres.";
        
    }
    
    public ArrayList<Reserva> getListaReservas(){
        return listaReservasDisponibles;
    }
    
    public void addReserva(Reserva reserva){
        getListaReservas().add(reserva);
    }
    
    public void removeReserva(Reserva reserva){
        getListaReservas().remove(reserva);
    }
    
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
