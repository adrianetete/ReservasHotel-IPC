/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adri
 */
public class Usuario {
    
    private static final String DEFAULT_PASSWORD = "default";
    
    private String nombre;
    private String apellidos;
    
    private String username;
    private String passw;

    public Usuario(String username, String nombre, String apellidos) {
        this.username = username;
        this.passw = DEFAULT_PASSWORD;

        this.nombre = nombre;
        this.apellidos = apellidos;
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
    
    
}
