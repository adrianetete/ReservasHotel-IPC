package main;

/**
 * Clase <code>Start</code> principal que contiene el main
 * que ejecuta el programa.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Hotel;
import model.Reserva;
import model.Usuario;

public class Start {
    
    /* Cada uno de los estados de la maquina de estados */
    private static Home homeState;
    private static IniciarSesion iniciarSesionState;
    private static ListaReservas listaReservasState;
    private static CrearReserva crearReservaState;

    /* Lista de usuarios del hotel usado como ejemplo */
    private static ArrayList<Usuario> listaUsuarios;

    /* Usuarios ejemplo y sus atributos */
    private static Usuario usuario;
    private static final String LOGIN_USUARIO1 = "garciparedes";
    private static final String NOMBRE_USUARIO1 = "Sergio";
    private static final String APELLIDOS_USUARIO1 = "Garcia Prado";
    
    private static final String LOGIN_USUARIO2 = "adrianete";
    private static final String NOMBRE_USUARIO2 = "Adrian";
    private static final String APELLIDOS_USUARIO2 = "Calvo Rojo";
    
    /* Hotel ejemplo y sus atributos */
    private static Hotel hotel;
    private static final int HAB_HOTEL_CONF_1 = 3;
    private static final int HAB_HOTEL_CONF_2 = 200;
    private static final String NOMBRE_HOTEL = "Hotel UVA";
    private static final String HORARIO_HOTEL = "10am - 10pm";
    private static final String TLF_HOTEL = "978-329-545";
    private static final String EMAIL_HOTEL = "hotel@uva.es";
    private static final String DIRECCION_HOTEL = "C: Sin Nombre Nº 34";
    private static final String POBLACION_HOTEL = "Valladolid";
    private static final String PAIS_HOTEL = "España";
    
    
    /**
     * Main del programa. 
     * Es el que inicia todo lo demás.
     * Según se pase un valor entre 1 y 3 se entra en una de las simulaciones
     * que están explicadas en los metodos congiguracion-i
     * @param args 
     */
    public static void main(String[] args) {
        
        /* Look & Feel de programa establecido como el del sistema */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | 
                ClassNotFoundException | 
                InstantiationException | 
                IllegalAccessException e) {
        }
        
        if(args.length == 1){
            
            switch(Integer.parseInt(args[0])){

                case 1: configuracion1(); break;
                case 2: configuracion2(); break;
                case 3: configuracion3(); break;
                default: configuracion4(); break;
            }
            
        }else{
            
            configuracion4();
        }
        
        /* Inicio de la aplicación en sus estado incial */
        homeState = new Home();
    }
    
    /**
     * Configuracion que simula que el hotel no tiene ninguna habitación
     * disponible; se crean inicialmente tres reservas aleatorias y se asignan
     * al usuario.
     */
    private static void configuracion1(){
        
        /* Hotel con 3 habitaciones disponibles */
        hotel = new Hotel(
                HAB_HOTEL_CONF_1,
                NOMBRE_HOTEL,
                HORARIO_HOTEL,
                TLF_HOTEL,
                EMAIL_HOTEL,
                DIRECCION_HOTEL,
                POBLACION_HOTEL,
                PAIS_HOTEL
        );
              
        listaUsuarios = new ArrayList<Usuario>();
        
        /* Usuario de ejemplo */
        Usuario garciparedes = new Usuario(
                LOGIN_USUARIO1, 
                NOMBRE_USUARIO1, 
                APELLIDOS_USUARIO1);
        
        /* Se añaden 3 reservas al usuario anterior */
        for (int i = 0; i < 3; i++){
            garciparedes.addReserva(hotel.getListaReservas().remove(0));
        }
        
        /* Se añade a la lista el usuario */
        listaUsuarios.add(garciparedes);
    }
    
     /**
     * Configuracion que simula que el hotel tiene 200 habitaciones;
     * se crean inicialmente dos usuarios con 10 reservas para
     * uno y 5 para el otro.
     */
    private static void configuracion2(){
        
        /* Hotel con 200 habitaciones disponibles */
        hotel = new Hotel(
                HAB_HOTEL_CONF_2,
                NOMBRE_HOTEL,
                HORARIO_HOTEL,
                TLF_HOTEL,
                EMAIL_HOTEL,
                DIRECCION_HOTEL,
                POBLACION_HOTEL,
                PAIS_HOTEL
        );
              
        listaUsuarios = new ArrayList<Usuario>();
        
        /* Usuario de ejemplo */
        Usuario adrianete = new Usuario(
                LOGIN_USUARIO2, 
                NOMBRE_USUARIO2, 
                APELLIDOS_USUARIO2);
        
        /* Usuario de ejemplo */
        Usuario garciparedes = new Usuario(
                LOGIN_USUARIO1, 
                NOMBRE_USUARIO1, 
                APELLIDOS_USUARIO1);
        
        /* Se añaden 10 reservas al usuario 1 */
        for (int i = 0; i < 10; i++){
            adrianete.addReserva(hotel.getListaReservas().remove(0));
        }
        
        /* Se añaden 5 reservas al usuario 2 */
        for (int i = 0; i < 5; i++){
            garciparedes.addReserva(hotel.getListaReservas().remove(0));
        }
        
        /* Se añaden a la lista los usuarios */
        listaUsuarios.add(adrianete);
        listaUsuarios.add(garciparedes);
    }
    
    /**
     * Configuracion que simula que el hotel tiene 3 habitaciones disponibles
     * y con un usuario creado; este usuario se encuentra con
     * la sesion iniciada.
     */
    private static void configuracion3(){
        
        /* Hotel con 3 habitaciones disponibles */
        hotel = new Hotel(
                HAB_HOTEL_CONF_1,
                NOMBRE_HOTEL,
                HORARIO_HOTEL,
                TLF_HOTEL,
                EMAIL_HOTEL,
                DIRECCION_HOTEL,
                POBLACION_HOTEL,
                PAIS_HOTEL
        );
              
        listaUsuarios = new ArrayList<Usuario>();
        
        /* Usuario de ejemplo */
        Usuario garciparedes = new Usuario(
                LOGIN_USUARIO1, 
                NOMBRE_USUARIO1, 
                APELLIDOS_USUARIO1);
        
        /* Se añade a la lista el usuario */
        listaUsuarios.add(garciparedes);
        
        usuario = garciparedes;
    }
    
    /**
     * Configuración por defecto en la que se crea un hotel con 200 habitaciones
     * y dos usuarios. No se hace ninguna reserva ni se inicia sesion.
     */
    private static void configuracion4(){
        
        /* Hotel con 200 habitaciones disponibles */
        hotel = new Hotel(
                HAB_HOTEL_CONF_2,
                NOMBRE_HOTEL,
                HORARIO_HOTEL,
                TLF_HOTEL,
                EMAIL_HOTEL,
                DIRECCION_HOTEL,
                POBLACION_HOTEL,
                PAIS_HOTEL
        );
              
        listaUsuarios = new ArrayList<Usuario>();
        
        /* Usuario de ejemplo */
        Usuario adrianete = new Usuario(
                LOGIN_USUARIO2, 
                NOMBRE_USUARIO2, 
                APELLIDOS_USUARIO2);
        
        /* Usuario de ejemplo */
        Usuario garciparedes = new Usuario(
                LOGIN_USUARIO1, 
                NOMBRE_USUARIO1, 
                APELLIDOS_USUARIO1);
        
        /* Se añaden a la lista los usuarios */
        listaUsuarios.add(garciparedes);
        listaUsuarios.add(adrianete);
    }
    
    /**
     * Getter del estado Home
     * 
     * @return objeto que representa el estado <code>Home</code>
     */
    public static Home getStateMachineHome() {
        return homeState; 
    }
    
    /**
     * Getter del estado IniciarSesion
     * 
     * @return objeto que representa el estado <code>IniciarSesion</code>
     */
    public static IniciarSesion getStateMachineIniciarSesion() {
        return iniciarSesionState; 
    }
   
    /**
     * Getter del estado ListaReservas
     * 
     * @return objeto que representa el estado <code>ListaReservas</code>
     */
    public static ListaReservas getStateMachineListaReservas() {
        return listaReservasState; 
    }

    /**
     * Getter del estado CrearReserva
     * 
     * @return objeto que representa el estado <code>CrearReserva</code>
     */
    public static CrearReserva getStateMachineCrearReservas() {
        return crearReservaState; 
    }

    /**
     * Comprueba si hay una sesión iniciada
     * 
     * @return true si existe un objeto de la clase <code<Usuario</code>
     */
    public static boolean isLoged(){
        return usuario != null;
    }

    /**
     * Oculta la ventana <code>Home</code> y abre la de <code>CrearReserva</code>
     */
    public static void crearReserva() {
        
        homeState.ocultar();
        crearReservaState = new CrearReserva();
    }

    /**
     * Abre el estado de <code>IniciarSesion</code> si no hay nadie con 
     * la sesión iniciada, en caso contrario, borra la sesion actual.
     */
    public static void iniciarSesion() {
        if (!isLoged()){ 
            iniciarSesionState = new IniciarSesion();    
        } else {
            usuario = null;
            homeState.update();
        }
    }
    
    /** 
     * Cierra la ventana de <code>IniciarSesion</code>
     */
    public static void loginSucceed() { 
        
        iniciarSesionState.close();
    }
    
    /**
     * Si no hay ninguna sesión iniciada, abre la ventana de 
     * <code>IniciarSesion</code> y en caso de que ya este iniciada, cambia
     * al estado de <code>ListaReservas</code>
     */
    public static void listaReservas(){
        
        if (!isLoged()){
            iniciarSesion();
        } else {
            homeState.ocultar();
            listaReservasState = new ListaReservas();
        }
        
    }

    /**
     * Devuelve un ArrayList con la lista de los usuarios
     * 
     * @return lista de usuarios
     */
    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public static void setUsuario(Usuario usuarioNuevo){
        usuario = usuarioNuevo;
    }
    
    public static Usuario getUsuario(){
        return usuario;
    }
    
    public static Hotel getHotel(){
        return hotel;
    }

    /**
     * Una vez que se crea una reserva en la aplicación se le asigna a un
     * usuario de la lista de usuarios y se elimina del hotel.
     * 
     * @param reserva 
     */
    public static void completarReserva(Reserva reserva) {
        getUsuario().addReserva(reserva);
        getHotel().removeReserva(reserva);
        crearReservaState.cancelar();
    }
}
