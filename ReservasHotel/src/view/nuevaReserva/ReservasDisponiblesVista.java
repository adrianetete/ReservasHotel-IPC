package view.nuevaReserva;

/**
 * Clase <code>ReservasDisponiblesVista</code> muestra la vista donde el 
 * usuario ve las reservas disponibles y selecciona una.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import enums.TipoEstancia;
import enums.TipoHabitacion;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import main.Start;
import model.Reserva;
import view.utils.TableModelDisponibles;

public class ReservasDisponiblesVista extends javax.swing.JFrame 
    implements VistaReservaInterface {

    private final ControllerReservasDisponibles controller;
    
    /**
     * Constructor de la clase <code>ReservasDisponiblesVista</code>.
     * @param reserva 
     */
    public ReservasDisponiblesVista(Reserva reserva) {
        initComponents();
        
        controller = new ControllerReservasDisponibles(this, reserva);
        
        ImageIcon icon = new ImageIcon("res/calendar.png");
        btn_fechaEntrada.setBorder(BorderFactory.createEmptyBorder());

        btn_fechaEntrada.setIcon(icon);
        
        btn_fechaSalida.setBorder(BorderFactory.createEmptyBorder());

        btn_fechaSalida.setIcon(icon);
        
        for(TipoEstancia i : TipoEstancia.values()){
            jComboBoxEstancia.addItem(i);
        }
        for(TipoHabitacion j : TipoHabitacion.values()){
            jComboBoxHabitacion.addItem(j);
        }
        
        jComboBoxPlazas.addItem(1);
        jComboBoxPlazas.addItem(2);

        
        setJTableModel(Start.getHotel().buscarReservasDisponibles(reserva));
        jTableAlojamientoDisponible.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        setJlabelFechaEntradaString(reserva.getFechaEntradaString());
        setJlabelFechaSalidaString(reserva.getFechaSalidaString());
       
        
        setJComboBoxHabitacionIndex(reserva.getTipoHabitacionOrdinal()+1);
        setJComboBoxEstanciaIndex(reserva.getTipoEstanciaOrdinal()+1);
        setJComboBoxPlazasIndex(reserva.getPlazas());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_fechaEntrada = new javax.swing.JLabel();
        jLabelFechaEntrada = new javax.swing.JLabel();
        btn_fechaEntrada = new javax.swing.JButton();
        lbl_fechaSalida = new javax.swing.JLabel();
        jLabelFechaSalida = new javax.swing.JLabel();
        btn_fechaSalida = new javax.swing.JButton();
        lbl_habitacion = new javax.swing.JLabel();
        jComboBoxHabitacion = new javax.swing.JComboBox();
        lbl_estancia = new javax.swing.JLabel();
        jComboBoxEstancia = new javax.swing.JComboBox();
        btn_buscar_reserva = new javax.swing.JButton();
        jComboBoxPlazas = new javax.swing.JComboBox();
        lbl_plazas = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlojamientoDisponible = new javax.swing.JTable();
        jButtonReservar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Reserva"));

        lbl_fechaEntrada.setText("Fecha de entrada:");

        jLabelFechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaEntrada.setText("--/--/--");

        btn_fechaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechaEntradaActionPerformed(evt);
            }
        });

        lbl_fechaSalida.setText("Fecha de salida:");

        jLabelFechaSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaSalida.setText("--/--/--");

        btn_fechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechaSalidaActionPerformed(evt);
            }
        });

        lbl_habitacion.setText("Tipo de habitación:");

        jComboBoxHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera" }));
        jComboBoxHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHabitacionActionPerformed(evt);
            }
        });

        lbl_estancia.setText("Tipo de estancia:");

        jComboBoxEstancia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera" }));
        jComboBoxEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstanciaActionPerformed(evt);
            }
        });

        btn_buscar_reserva.setText("Buscar");
        btn_buscar_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_reservaActionPerformed(evt);
            }
        });

        jComboBoxPlazas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera" }));
        jComboBoxPlazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlazasActionPerformed(evt);
            }
        });

        lbl_plazas.setText("Nº de plazas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_buscar_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPlazas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_fechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxHabitacion, 0, 204, Short.MAX_VALUE)
                    .addComponent(jComboBoxEstancia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_estancia)
                            .addComponent(lbl_fechaEntrada)
                            .addComponent(lbl_fechaSalida)
                            .addComponent(lbl_habitacion)
                            .addComponent(lbl_plazas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_fechaEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fechaEntrada))
                .addGap(18, 18, 18)
                .addComponent(lbl_fechaSalida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fechaSalida))
                .addGap(18, 18, 18)
                .addComponent(lbl_plazas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_habitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_estancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar_reserva))
        );

        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alojamiento Disponible"));

        jTableAlojamientoDisponible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableAlojamientoDisponible);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jButtonReservar.setText("Reservar");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btn_cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReservar)
                        .addGap(43, 43, 43)
                        .addComponent(btn_cancel)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fechaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechaEntradaActionPerformed
        controller.setFechaEntrada();
    }//GEN-LAST:event_btn_fechaEntradaActionPerformed

    private void btn_fechaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechaSalidaActionPerformed
        controller.setFechaSalida();
    }//GEN-LAST:event_btn_fechaSalidaActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        controller.cancelar();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        controller.reservar();
    }//GEN-LAST:event_jButtonReservarActionPerformed

    private void jComboBoxEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstanciaActionPerformed
        controller.setTipoEstancia();
    }//GEN-LAST:event_jComboBoxEstanciaActionPerformed

    private void btn_buscar_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reservaActionPerformed
        controller.buscar();
    }//GEN-LAST:event_btn_buscar_reservaActionPerformed

    private void jComboBoxHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHabitacionActionPerformed
        controller.setTipoHabitacion();
    }//GEN-LAST:event_jComboBoxHabitacionActionPerformed

    private void jComboBoxPlazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlazasActionPerformed
        controller.setPlazas();
    }//GEN-LAST:event_jComboBoxPlazasActionPerformed

    public void setJTableModel(ArrayList<Reserva> listaReservas){
        jTableAlojamientoDisponible.setModel(
                new TableModelDisponibles(listaReservas)
        );
    }
    public void setJlabelFechaEntradaString(String value){
        jLabelFechaEntrada.setText(value);
    }
    
    public void setJlabelFechaSalidaString(String value){
        jLabelFechaSalida.setText(value);
    }
    
    public void setJComboBoxEstanciaIndex(int index){
        jComboBoxEstancia.setSelectedIndex(index);
    }
    
    public void setJComboBoxHabitacionIndex(int index){
            jComboBoxHabitacion.setSelectedIndex(index);
    }
    
    public void setJComboBoxPlazasIndex(int index){
            jComboBoxPlazas.setSelectedIndex(index);
    }
    
    public int getJComboBoxEstancia(){
        return jComboBoxEstancia.getSelectedIndex();
    }
    
    public int getJComboBoxHabitacion(){
        return jComboBoxHabitacion.getSelectedIndex();
    }
    
    public int getJTableSelectedRow(){
        return jTableAlojamientoDisponible.getSelectedRow();
    }
    
    
    @Override
    public int getJComboBoxPlazas() {
        return jComboBoxPlazas.getSelectedIndex();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_reserva;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_fechaEntrada;
    private javax.swing.JButton btn_fechaSalida;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JComboBox jComboBoxEstancia;
    private javax.swing.JComboBox jComboBoxHabitacion;
    private javax.swing.JComboBox jComboBoxPlazas;
    private javax.swing.JLabel jLabelFechaEntrada;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAlojamientoDisponible;
    private javax.swing.JLabel lbl_estancia;
    private javax.swing.JLabel lbl_fechaEntrada;
    private javax.swing.JLabel lbl_fechaSalida;
    private javax.swing.JLabel lbl_habitacion;
    private javax.swing.JLabel lbl_plazas;
    // End of variables declaration//GEN-END:variables
}
