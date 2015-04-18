/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.listaReservas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Reserva;

/**
 *
 * @author garciparedes
 */
public class TableModel extends AbstractTableModel {
    
    private static final String FECHA_ENTRADA = "Fecha de Entrada";
    private static final String FECHA_SALIDA = "Fecha de Salida"; 
    private static final String TIPO_ALOJAMIENTO = "Tipo de Alojamiento"; 
    private static final String TIPO_HABITACION = "Tipo de Habitación"; 

    private static final String[] columnNames = {
        FECHA_ENTRADA
        ,FECHA_SALIDA
        ,TIPO_ALOJAMIENTO
        ,TIPO_HABITACION
    };
    
    private Object[][] data;
    
    public TableModel(ArrayList<Reserva> listaReservas){
        super();
        data = new Object[listaReservas.size()][4];
        for(int i = 0; i < listaReservas.size(); i++){
            data[i] = listaReservas.get(i).toArray();
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
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2) {
            return false;
        } else {
            return true;
        }
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
