/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

/**
 *
 * @author garciparedes
 */
public interface VistaReservaInterface {
    
    public void setJlabelFechaEntradaString(String value);
    
    public void setJlabelFechaSalidaString(String value);

    public int getJComboBoxEstancia();
    
    public int getJComboBoxHabitacion();

    public int getJComboBoxPlazas();

    public void setJComboBoxHabitacionIndex(int i);

    public void setJComboBoxPlazasIndex(int plazas);
}
