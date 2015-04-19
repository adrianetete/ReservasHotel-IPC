package view.nuevaReserva;

/**
 * Clase <code>VistaReservaInterface</code> que sirve de interfaz para
 * las vistas.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
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
