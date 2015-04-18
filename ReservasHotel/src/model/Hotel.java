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
    private String direccion;
    private String telefono;
    private String email;
    
    ArrayList<Reserva> listaReservasDisponibles;
    
    public Hotel(int nReservas, String nombre
            ,String direccion, String telefono, String email){
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.listaReservasDisponibles = new ArrayList<Reserva>();
        
        for(int i = 0; i< nReservas; i++){
            listaReservasDisponibles.add(Reserva.randReserva());
        }
        
        
    }
    
    public ArrayList<Reserva> getListaReservas(){
        return listaReservasDisponibles;
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
