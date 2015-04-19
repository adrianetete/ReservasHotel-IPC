/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.utils;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Reserva;

/**
 *
 * @author garciparedes
 */
public class TableModelDisponibles extends AbstractTableModel {
    
    
    private static final String TIPO_ALOJAMIENTO = "Tipo de Alojamiento"; 
    private static final String TIPO_HABITACION = "Tipo de Habitación"; 
    private static final String NUM_PLAZAS = "Nº Plazas"; 

    private static final String[] columnNames = {
        TIPO_ALOJAMIENTO
        ,TIPO_HABITACION
        ,NUM_PLAZAS
    };
    
    private Object[][] data;
    
    public TableModelDisponibles(ArrayList<Reserva> listaReservas){
        super();
        data = new Object[listaReservas.size()][4];
        for(int i = 0; i < listaReservas.size(); i++){
            data[i] = listaReservas.get(i).toArraySinFechas();
        }
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
