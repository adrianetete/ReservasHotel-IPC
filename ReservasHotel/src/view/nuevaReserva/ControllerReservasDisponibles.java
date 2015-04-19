/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

import main.Start;
import model.Reserva;

/**
 *
 * @author garciparedes
 */
class ControllerReservasDisponibles  extends AbstractControllerReservar{

    private ReservasDisponiblesVista vista;
    
    ControllerReservasDisponibles(ReservasDisponiblesVista vista, Reserva reserva) {
        super(vista, reserva);
        
        this.vista = vista;
    }
    
    @Override
    public void buscar(){
        vista.setJTableModel(Start.getHotel().buscarReservasDisponibles(getReservaBusqueda()));
    }

    public void reservar() {
        if (vista.getJTableSelectedRow() >= 0){
            Reserva reservaFinal = Start.getHotel().buscarReservasDisponibles(getReservaBusqueda()).get(
                            vista.getJTableSelectedRow());
            reservaFinal.fijarPeriodo(getReservaBusqueda());
            Start.completarReserva(reservaFinal);
        }
    }

}
