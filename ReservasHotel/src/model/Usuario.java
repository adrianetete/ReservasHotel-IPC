package model;

/**
 * Clase <code>Usuario</code> con todos los atributos propios de cada
 * usuario y su lista de reservas.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import java.util.ArrayList;

public class Usuario {
    
    public static final String DEFAULT_PASSWORD = "default";

    private String nombre;
    private String apellidos;
    
    private String username;
    private String passw;
    
    private ArrayList<Reserva> listaReservas;

    /**
     * Constructor de la clase <code>Usuario</code>
     * @param username
     * @param nombre
     * @param apellidos 
     */
    public Usuario(String username, String nombre, String apellidos) {
        
        this.username = username;
        this.passw = DEFAULT_PASSWORD;

        this.nombre = nombre;
        this.apellidos = apellidos;
        
        this.listaReservas = new ArrayList<Reserva>();
    }
    
    /**
     * Getter del nombre.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Getter del apellido.
     * @return 
     */
    public String getApellidos() {
        return apellidos;
    }
  
    /**
     * Getter del nombre de login
     * @return 
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Getter de la contraseña
     * @return 
     */
    public String getPassw() {
        return passw;
    }
    
    /**
     * Getter de la lista de reservas.
     * @return 
     */
    public ArrayList<Reserva> getListaReservas(){
        return listaReservas;
    }
    
    /**
     * Getter del numero de reservas.
     * @return 
     */
    public int getNumReservas(){
        return getListaReservas().size();
    }
    
    /**
     * Setter del nombre.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Setter de los apellidos.
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    /**
     * Setter del nombre de login.
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Setter de la contraseña.
     * @param passw 
     */
    public void setPassw(String passw) {
        this.passw = passw;
    }
    
    /**
     * Añade una reserva.
     * @param reserva 
     */
    public void addReserva(Reserva reserva){
        getListaReservas().add(reserva);
    }
    
    /**
     * Borra una reserva.
     * @param i 
     */
    public void removeReserva(int i){
        getListaReservas().remove(i);
    }
    
    /**
     * Devuelve los nombres de login de todos los usuarios como lista.
     * @param listaUsuarios
     * @return 
     */
    public static String getUsernamesString(ArrayList<Usuario> listaUsuarios){
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0 ; i < listaUsuarios.size(); i++){
            
            result.append(listaUsuarios.get(i).getUsername());
            result.append(System.getProperty("line.separator"));

        }
        return result.toString();
    }

}
