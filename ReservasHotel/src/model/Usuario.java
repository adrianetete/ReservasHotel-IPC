/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adri
 */
public class Usuario {
    
    public static final String DEFAULT_PASSWORD = "default";

    private String nombre;
    private String apellidos;
    
    private String username;
    private String passw;
    
    private ArrayList<Reserva> listaReservas;

    public Usuario(String username, String nombre, String apellidos) {
        this.username = username;
        this.passw = DEFAULT_PASSWORD;

        this.nombre = nombre;
        this.apellidos = apellidos;
        
        this.listaReservas = new ArrayList<Reserva>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
  
    public String getUsername() {
        return username;
    }
    
    public String getPassw() {
        return passw;
    }
    
    public ArrayList<Reserva> getListaReservas(){
        return listaReservas;
    }
    
    public int getNumReservas(){
        return getListaReservas().size();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
    
    public void addReserva(Reserva reserva){
        reserva.setDisponible(false);
        getListaReservas().add(reserva);
    }
    
    public static String getUsernamesString(ArrayList<Usuario> listaUsuarios){
        StringBuilder result = new StringBuilder();
        
        for (int i = 0 ; i < listaUsuarios.size(); i++){
            result.append(listaUsuarios.get(i).getUsername());
            result.append(System.getProperty("line.separator"));

        }
        return result.toString();
    }

}
