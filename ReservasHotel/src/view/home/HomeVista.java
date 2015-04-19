package view.home;

/**
 * Clase <code>HomeVista</code> muestra la vista principal.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import main.Start;

public class HomeVista extends javax.swing.JFrame {
    
    private static final String INICIAR_SESION = "Iniciar Sesión";
    private static final String CERRAR_SESION = "Cerrar Sesión";
    
    private static final String SESION_NO_INICIADA = "Sesión no iniciada";
    private static final String SESION_INICIADA = "Sesión iniciada como ";


    private final ControllerHome controller;
    
    /**
     * Constructor de la clase <code>HomeVista</code>.
     */
    public HomeVista() {
        
        initComponents();
        controller = new ControllerHome(this);
        update();        
    }
    
    /**
     * Actualiza la informacion de las etiquetas.
     */
    public void update(){
        
        jPanelUserInfo.setVisible(Start.isLoged());
        setJLabelNombreHotelText(Start.getHotel().getNombre());
        setJLabelDisponibilidadText(Start.getHotel().getDisponibilidad());
        setJLabelHorarioText(Start.getHotel().getHorario());
        setJLabelTelefonoText(Start.getHotel().getTelefono());
        setJLabelEmailText(Start.getHotel().getEmail());
        setJLabelDireccionText(Start.getHotel().getDireccion());
        setJLabelPoblacionText(Start.getHotel().getPoblacion());
        setJLabelPaisText(Start.getHotel().getPais());
        
        if (Start.isLoged()){
            setJLabelNombreText(Start.getUsuario().getNombre());
            setJLabelApellidosText(Start.getUsuario().getApellidos());
            setJLabelReservasText(String.valueOf(Start.getUsuario().getNumReservas()));
            setJButtonIniciarSesionText(CERRAR_SESION); 
            setJLabelEstadoSesionText(SESION_INICIADA + Start.getUsuario().getUsername());
            setJButtonHacerReservaEnabled(true);
            setJButtonVerReservasEnabled(true);

        } else {
            setJButtonIniciarSesionText(INICIAR_SESION);
            setJLabelEstadoSesionText(SESION_NO_INICIADA);
            setJButtonHacerReservaEnabled(false);
            setJButtonVerReservasEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonHacerReserva = new javax.swing.JButton();
        jButtonVerReservas = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelEstadoSesion = new javax.swing.JLabel();
        jPanelUserInfo = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_reservas = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelReservas = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();
        jLabelNombreHotel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabelDisponibilidad = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jLabelPoblacion = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setText("Bienvenido al servicio de reserva del hotel:");

        jButtonHacerReserva.setText("Añadir Reserva");
        jButtonHacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHacerReservaActionPerformed(evt);
            }
        });

        jButtonVerReservas.setText("Ver Reservas");
        jButtonVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerReservasActionPerformed(evt);
            }
        });

        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelEstadoSesion.setText("Sesión no iniciada");

        jPanelUserInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Mis datos"));

        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_nombre.setText("Nombre:");

        lbl_apellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_apellidos.setText("Apellidos:");

        lbl_reservas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_reservas.setText("NºReservas Actuales:");

        jLabelNombre.setText("jLabel1");

        jLabelApellidos.setText("jLabel2");

        jLabelReservas.setText("jLabel3");

        javax.swing.GroupLayout jPanelUserInfoLayout = new javax.swing.GroupLayout(jPanelUserInfo);
        jPanelUserInfo.setLayout(jPanelUserInfoLayout);
        jPanelUserInfoLayout.setHorizontalGroup(
            jPanelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellidos)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelReservas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelUserInfoLayout.setVerticalGroup(
            jPanelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUserInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(jLabelApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_reservas)
                    .addComponent(jLabelReservas))
                .addContainerGap())
        );

        jButtonIniciarSesion.setText("Iniciar Sesion");
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        jLabelNombreHotel.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabelNombreHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreHotel.setText("Hotel UVA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del Hotel"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Principales"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Disponibilidad:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Horario de Apertura:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Teléfono");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email:");

        jLabelEmail.setText("jLabel13");

        jLabelTelefono.setText("jLabel14");

        jLabelHorario.setText("jLabel15");

        jLabelDisponibilidad.setText("jLabel16");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelHorario)
                    .addComponent(jLabelDisponibilidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelDisponibilidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelHorario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelEmail))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cómo llegar"));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dirección:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Población:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("País:");

        jLabelPais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPais.setText("jLabel10");

        jLabelPoblacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPoblacion.setText("jLabel11");

        jLabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDireccion.setText("jLabel12");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelPoblacion)
                    .addComponent(jLabelPais))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelPoblacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelPais))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonHacerReserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVerReservas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jButtonIniciarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExit))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNombreHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelEstadoSesion))
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelUserInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabelNombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabelEstadoSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHacerReserva)
                    .addComponent(jButtonVerReservas)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonIniciarSesion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerReservasActionPerformed
        controller.verReservas();
    }//GEN-LAST:event_jButtonVerReservasActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        controller.salir();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonHacerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHacerReservaActionPerformed
        controller.hacerReserva();
    }//GEN-LAST:event_jButtonHacerReservaActionPerformed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        controller.iniciarSesion();
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    public void setJLabelNombreText(String value){
        jLabelNombre.setText(value);
    }
    
    public void setJLabelApellidosText(String value){
        jLabelApellidos.setText(value);
    }
    
    public void setJLabelReservasText(String value){
        jLabelReservas.setText(value);
    }
    
    public void setJButtonIniciarSesionText(String value){
        jButtonIniciarSesion.setText(value);
    }
    
    public void setJLabelEstadoSesionText(String value){
        jLabelEstadoSesion.setText(value);
    }
    
    public void setJLabelNombreHotelText(String value){
        jLabelNombreHotel.setText(value);
    }
    
    public void setJLabelDisponibilidadText(String value){
        jLabelDisponibilidad.setText(value);
    }
    
    public void setJLabelHorarioText(String value){
        jLabelHorario.setText(value);
    }
    
    public void setJLabelTelefonoText(String value){
        jLabelTelefono.setText(value);
    }
    
    public void setJLabelEmailText(String value){
        jLabelEmail.setText(value);
    }
    
    public void setJLabelDireccionText(String value){
        jLabelDireccion.setText(value);
    }
    
    public void setJLabelPoblacionText(String value){
        jLabelPoblacion.setText(value);
    }
    
    public void setJLabelPaisText(String value){
        jLabelPais.setText(value);
    }
    
    public void setJButtonHacerReservaEnabled(boolean value){
        jButtonHacerReserva.setEnabled(value);
    }
    
    public void setJButtonVerReservasEnabled(boolean value){
        jButtonVerReservas.setEnabled(value);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonHacerReserva;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonVerReservas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDisponibilidad;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstadoSesion;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreHotel;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelPoblacion;
    private javax.swing.JLabel jLabelReservas;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelUserInfo;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_reservas;
    // End of variables declaration//GEN-END:variables
}
