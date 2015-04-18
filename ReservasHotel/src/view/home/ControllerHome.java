/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.home;

import main.Start;
import view.home.HomeVista;
import view.nuevaReserva.DatePicker;

/**
 *
 * @author adri
 */
public class ControllerHome {
    
    private HomeVista vista;

    public ControllerHome(HomeVista vista) {
        this.vista = vista;
    }
    
    public void salir(){
        System.exit(0);
    }

    public void hacerReserva() {
<<<<<<< HEAD
        
        Start.crearReserva();
=======
        DatePicker datePicker = new DatePicker(vista);
>>>>>>> 2766946347340c34ff949e42dabdec7d1aa054e8
    }

    public void verReservas() {
        Start.listaReservas();
    }

    void iniciarSesion() {
        Start.iniciarSesion();
    }
    
}
