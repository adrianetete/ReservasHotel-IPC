package main;

/**
 * Clase <code>CrearReserva</code> que representa el estado del Frame
 * encargado de getionar las reservas del hotel.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import model.Reserva;
import view.nuevaReserva.ReservasDisponiblesVista;
import view.nuevaReserva.NuevaReserva;

public class CrearReserva {
    
    private NuevaReserva nuevaReservaState;
    private ReservasDisponiblesVista reservasDisponiblesVistaState; 

    /**
     * Constructor de la clase <code>CrearReserva</code> que crea un nuevo
     * hilo con la ventana.
     */
    public CrearReserva() {
        
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                nuevaReservaState = new view.nuevaReserva.NuevaReserva(); 
                nuevaReservaState.setLocationRelativeTo(null);
                nuevaReservaState.setVisible(true);
            } 
        });
    }
    
    /**
     * Abre una nueva ventana con una iterfaz que muestra las reservas
     * actuales del usuario y le permite crear nuevas.
     * 
     * @param reserva 
     */
    public void buscarReservasDisponibles(final Reserva reserva){
        nuevaReservaState.setVisible(false);
        
        if (reservasDisponiblesVistaState == null){
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        reservasDisponiblesVistaState = new ReservasDisponiblesVista(reserva);
                        reservasDisponiblesVistaState.setLocationRelativeTo(null);
                        reservasDisponiblesVistaState.setVisible(true);

                } 
            });
        }

    }
    
    /**
     * Oculta la ventana.
     */
    public void close() {
        nuevaReservaState.setVisible(false);
    }
    
    /**
     * Muestra la ventana.
     */
    public void show(){          
        nuevaReservaState.setVisible(true);
    }

    /**
     * Oculta ambas ventanas y vuelve al estado <code>Home</code>.
     */
    public void cancelar() {
        if (nuevaReservaState != null){
            nuevaReservaState.setVisible(false);
        }
        
        if (reservasDisponiblesVistaState != null){
            reservasDisponiblesVistaState.setVisible(false);
        }
        Start.getStateMachineHome().mostrar();
    }
    
}
