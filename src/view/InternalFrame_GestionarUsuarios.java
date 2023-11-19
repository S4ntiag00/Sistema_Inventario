/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author TOR
 */
public class InternalFrame_GestionarUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrame_GestionarUsuarios
     */
    public InternalFrame_GestionarUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondoGestionarUsuarios = new javax.swing.JPanel();
        panelGestionUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_GestionUsuarios = new javax.swing.JTable();
        panel_BotonesGestionUsuarios = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mostrar_mostrarDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre_GestionUsuario = new javax.swing.JTextField();
        txt_apellido_GestionUsuarios = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_documentoIdentidad_GestionUsuario = new javax.swing.JTextField();
        txt_rol_gestionUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario_GestionUsuario = new javax.swing.JTextField();
        txt_contraseña_GestionUsuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gesrionar Usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_fondoGestionarUsuarios.setBackground(java.awt.Color.white);
        panel_fondoGestionarUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGestionUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelGestionUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_GestionUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabel_GestionUsuarios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabel_GestionUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Documento Identidad", "Rol", "Usuariio", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tabel_GestionUsuarios);

        panelGestionUsuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 290));

        panel_fondoGestionarUsuarios.add(panelGestionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 570, 310));

        panel_BotonesGestionUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");

        javax.swing.GroupLayout panel_BotonesGestionUsuariosLayout = new javax.swing.GroupLayout(panel_BotonesGestionUsuarios);
        panel_BotonesGestionUsuarios.setLayout(panel_BotonesGestionUsuariosLayout);
        panel_BotonesGestionUsuariosLayout.setHorizontalGroup(
            panel_BotonesGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BotonesGestionUsuariosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_BotonesGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_BotonesGestionUsuariosLayout.setVerticalGroup(
            panel_BotonesGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BotonesGestionUsuariosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panel_fondoGestionarUsuarios.add(panel_BotonesGestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 160, -1));

        mostrar_mostrarDatos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Documento Identidad");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Rol");

        txt_documentoIdentidad_GestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_documentoIdentidad_GestionUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña");

        javax.swing.GroupLayout mostrar_mostrarDatosLayout = new javax.swing.GroupLayout(mostrar_mostrarDatos);
        mostrar_mostrarDatos.setLayout(mostrar_mostrarDatosLayout);
        mostrar_mostrarDatosLayout.setHorizontalGroup(
            mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre_GestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apellido_GestionUsuarios)))
                .addGap(30, 30, 30)
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_documentoIdentidad_GestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rol_gestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_contraseña_GestionUsuario))
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(txt_usuario_GestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        mostrar_mostrarDatosLayout.setVerticalGroup(
            mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre_GestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_documentoIdentidad_GestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_usuario_GestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_apellido_GestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_rol_gestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_contraseña_GestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        panel_fondoGestionarUsuarios.add(mostrar_mostrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 800, 110));

        getContentPane().add(panel_fondoGestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_documentoIdentidad_GestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_documentoIdentidad_GestionUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_documentoIdentidad_GestionUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mostrar_mostrarDatos;
    private javax.swing.JPanel panelGestionUsuario;
    private javax.swing.JPanel panel_BotonesGestionUsuarios;
    private javax.swing.JPanel panel_fondoGestionarUsuarios;
    private javax.swing.JTable tabel_GestionUsuarios;
    private javax.swing.JTextField txt_apellido_GestionUsuarios;
    private javax.swing.JTextField txt_contraseña_GestionUsuario;
    private javax.swing.JTextField txt_documentoIdentidad_GestionUsuario;
    private javax.swing.JTextField txt_nombre_GestionUsuario;
    private javax.swing.JTextField txt_rol_gestionUsuario;
    private javax.swing.JTextField txt_usuario_GestionUsuario;
    // End of variables declaration//GEN-END:variables
}
