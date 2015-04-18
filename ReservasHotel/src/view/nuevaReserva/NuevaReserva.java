/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

import enums.TipoEstancia;
import enums.TipoHabitacion;
/**
 *
 * @author garciparedes
 */
public class NuevaReserva extends javax.swing.JFrame {

    /**
     * Creates new form NuevaReserva
     */
    ControllerNuevaReserva controller;
    DatePicker calendarioEntrada;
    DatePicker calendarioSalida;
    
    public NuevaReserva() {
        
        initComponents();
        controller = new ControllerNuevaReserva(this);
        
        for(TipoEstancia i : TipoEstancia.values()){
            combo_alojamiento.addItem(i);
        }
        for(TipoHabitacion j : TipoHabitacion.values()){
            combo_habitacion.addItem(j);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_fechaEntrada = new javax.swing.JLabel();
        txt_fechaEntrada = new javax.swing.JLabel();
        btn_fechaEntrada = new javax.swing.JButton();
        lbl_fechaSalida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_fechaSalida = new javax.swing.JButton();
        lbl_habitacion = new javax.swing.JLabel();
        combo_habitacion = new javax.swing.JComboBox();
        lbl_alojamiento = new javax.swing.JLabel();
        combo_alojamiento = new javax.swing.JComboBox();
        lbl_info1 = new javax.swing.JLabel();
        btn_reservar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_fechaEntrada.setText("Fecha de entrada:");

        txt_fechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_fechaEntrada.setText("--/--/--");

        btn_fechaEntrada.setText("Cambiar");
        btn_fechaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechaEntradaActionPerformed(evt);
            }
        });

        lbl_fechaSalida.setText("Fecha de salida:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--/--/--");

        btn_fechaSalida.setText("Cambiar");
        btn_fechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechaSalidaActionPerformed(evt);
            }
        });

        lbl_habitacion.setText("Tipo de habitación:");

        combo_habitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---------------" }));

        lbl_alojamiento.setText("Tipo de alojamiento:");

        combo_alojamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---------------" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_fechaEntrada)
                            .addComponent(lbl_fechaSalida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_fechaEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_fechaSalida, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_habitacion)
                            .addComponent(lbl_alojamiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_alojamiento, 0, 220, Short.MAX_VALUE)
                            .addComponent(combo_habitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechaEntrada)
                    .addComponent(txt_fechaEntrada)
                    .addComponent(btn_fechaEntrada))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechaSalida)
                    .addComponent(jLabel1)
                    .addComponent(btn_fechaSalida))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_habitacion)
                    .addComponent(combo_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_alojamiento)
                    .addComponent(combo_alojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_info1.setText("Nueva reserva");

        btn_reservar.setText("Reservar");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_info1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_info1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reservar)
                    .addComponent(btn_salir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        
        //reset();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_fechaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechaEntradaActionPerformed
        calendarioEntrada = new DatePicker(this);
    }//GEN-LAST:event_btn_fechaEntradaActionPerformed

    private void btn_fechaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechaSalidaActionPerformed
        calendarioSalida = new DatePicker(this);
    }//GEN-LAST:event_btn_fechaSalidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechaEntrada;
    private javax.swing.JButton btn_fechaSalida;
    private javax.swing.JButton btn_reservar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox combo_alojamiento;
    private javax.swing.JComboBox combo_habitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_alojamiento;
    private javax.swing.JLabel lbl_fechaEntrada;
    private javax.swing.JLabel lbl_fechaSalida;
    private javax.swing.JLabel lbl_habitacion;
    private javax.swing.JLabel lbl_info1;
    private javax.swing.JLabel txt_fechaEntrada;
    // End of variables declaration//GEN-END:variables
}
