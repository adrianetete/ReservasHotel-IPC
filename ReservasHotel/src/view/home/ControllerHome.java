/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.home;

import main.Start;
import view.home.HomeVista;

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
        Start.hacerReserva();
    }

    public void verReservas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
