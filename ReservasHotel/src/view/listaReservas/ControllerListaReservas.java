/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.listaReservas;

import main.Start;

/**
 *
 * @author garciparedes
 */
public class ControllerListaReservas {

    private ListaReservasVista vista;

    public ControllerListaReservas(ListaReservasVista vista) {     
        this.vista = vista;
    }
    
    public void eliminarReserva(){
        if (vista.getJTableSelectedRow() >= 0){
            Start.getUsuario().getListaReservas().remove(vista.getJTableSelectedRow());
            vista.setJTableModel(Start.getUsuario().getListaReservas());
        }
    }

    void cancelar() {
        //Start.
        Start.listaReservasState.cancelar();
        

    }
    
}
