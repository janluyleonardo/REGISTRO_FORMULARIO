package registro;

import javax.swing.table.DefaultTableModel;


public class VENTANA extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel ();
    
    
    
    public VENTANA() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Carrera");
        modelo.addColumn("genero");
        tbldatos.setModel(modelo);
        
        
    }
    REG e = new REG();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        btngrupo = new javax.swing.ButtonGroup();
        btngrupoocupa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spdia = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spmes = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spaño = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        cbciudad = new javax.swing.JComboBox<>();
        cbdepartamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        BTNSALIR = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcarrera = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        rbmasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        ckbAdmin = new javax.swing.JCheckBox();
        ckbEmpl = new javax.swing.JCheckBox();
        ckbOtro = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbldatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbldatos);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(10, new java.awt.Color(0, 0, 0), null));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("DIA");

        spdia.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        spdia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("MES");

        spmes.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        spmes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("AÑO");

        spaño.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        spaño.setModel(new javax.swing.SpinnerNumberModel(1999, 1970, 2100, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(spmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(spaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        cbciudad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cbciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leticia", "Medellin", "Arauca", "Barranquilla", "Cartagena de indias", "Tunja", "Manizalez", "Florencia ", "Yopal", "Popayan", "Valledupar", "Quibdo", "Monteria", "Bogota", "Inirida", "San jode del guaviare", "Neiva", "Rioacha", "Santa marta", "Villavicencio", "Pasto", "San jose de cucuta", "Mocoa", "Armenia", "Pereira ", "San andres", "Buaramanga ", "Sincelejo", "Ibague", "Cali", "Miyu", "Puerto carreño" }));

        cbdepartamento.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cbdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Antioquia", "Arauca", "Atlantico", "Bolivar", "Boyaca", "Caldas", "Caqueta", "Casanare", "Cauca", "Cesar", "Choco", "Cordoba", "Cundinamarca", "Guainia", "Guaviare", "Huila", "La guajira ", "Magdakena", "Meta", "Nariño", "Norte de santander", "Putumayo", "Quindio", "Risaralda ", "San andres y providencia", "Santander", "Sucre", "Tolima", "Valle del cauca", "Vaupes", "Vichada" }));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setText("CIUDAD");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setText("DEPARTAMENTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        BTNSALIR.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BTNSALIR.setText("SALIR");
        BTNSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSALIRActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PERSONALES", 0, 0, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setText("CARRERA ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, -1, -1));
        jPanel4.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 34, 285, -1));
        jPanel4.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 72, 285, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("APELLIDO ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, -1, -1));
        jPanel4.add(txtcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 110, 285, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btngrupo.add(rbmasculino);
        rbmasculino.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        rbmasculino.setText("Maculino");
        rbmasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmasculinoActionPerformed(evt);
            }
        });

        btngrupo.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        rbFemenino.setText("Femenino");
        rbFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemeninoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(rbmasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbFemenino)
                .addGap(97, 97, 97))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbmasculino)
                    .addComponent(rbFemenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ocupaciòn", 0, 0, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N

        btngrupoocupa.add(ckbAdmin);
        ckbAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ckbAdmin.setText("Administrativo");
        ckbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbAdminActionPerformed(evt);
            }
        });

        btngrupoocupa.add(ckbEmpl);
        ckbEmpl.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ckbEmpl.setText("Empleado");
        ckbEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbEmplActionPerformed(evt);
            }
        });

        btngrupoocupa.add(ckbOtro);
        ckbOtro.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ckbOtro.setText("Otro");
        ckbOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbOtroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ckbAdmin)
                .addGap(64, 64, 64)
                .addComponent(ckbEmpl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ckbOtro)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbAdmin)
                    .addComponent(ckbEmpl)
                    .addComponent(ckbOtro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNSALIR)
                        .addGap(45, 45, 45))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnguardar)
                            .addComponent(BTNSALIR)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
    String dato[]= new String[4];
    dato[0]=txtnombre.getText();
    dato[1]=txtapellido.getText();
    dato[2]=txtcarrera.getText();
    dato[3]=rbFemenino.getName();
    
    modelo.addRow(dato);
    e.getfecha(spdia.getValue().toString() , spmes.getValue().toString() , spaño.getValue().toString());
    e.getciuidad(cbciudad.getSelectedItem().toString());
    e.getdepartamento(cbdepartamento.getSelectedItem().toString());
    
    e.getmostrar();
    txtnombre.setText("");
    txtapellido.setText("");
    txtcarrera.setText("");
    txtnombre.requestFocus();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void BTNSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSALIRActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BTNSALIRActionPerformed

    private void rbmasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmasculinoActionPerformed
        e.getgenero(this.rbmasculino.getLabel());
    }//GEN-LAST:event_rbmasculinoActionPerformed

    private void rbFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemeninoActionPerformed
        e.getgenero(this.rbFemenino.getLabel());
    }//GEN-LAST:event_rbFemeninoActionPerformed

    private void ckbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbAdminActionPerformed
        e.getocupacion(ckbAdmin.getText());
    }//GEN-LAST:event_ckbAdminActionPerformed

    private void ckbEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbEmplActionPerformed
        e.getocupacion(ckbEmpl.getText());
    }//GEN-LAST:event_ckbEmplActionPerformed

    private void ckbOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbOtroActionPerformed
        e.getocupacion(ckbOtro.getText());
    }//GEN-LAST:event_ckbOtroActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNSALIR;
    public static javax.swing.ButtonGroup btngrupo;
    public static javax.swing.ButtonGroup btngrupoocupa;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbciudad;
    private javax.swing.JComboBox<String> cbdepartamento;
    private javax.swing.JCheckBox ckbAdmin;
    private javax.swing.JCheckBox ckbEmpl;
    private javax.swing.JCheckBox ckbOtro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JRadioButton rbFemenino;
    public static javax.swing.JRadioButton rbmasculino;
    private javax.swing.JSpinner spaño;
    private javax.swing.JSpinner spdia;
    private javax.swing.JSpinner spmes;
    private javax.swing.JTable tbldatos;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcarrera;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
