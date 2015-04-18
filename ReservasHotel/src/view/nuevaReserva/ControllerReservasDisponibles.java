/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

import model.Reserva;

/**
 *
 * @author garciparedes
 */
class ControllerReservasDisponibles {

    private ReservasDisponiblesVista vista;
    private Reserva reserva;
    
    ControllerReservasDisponibles(ReservasDisponiblesVista vista, Reserva reserva) {
        this.vista = vista;
        this.reserva = reserva;
    }
    
}
