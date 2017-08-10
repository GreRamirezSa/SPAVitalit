package prototipospa;


import prototipospa.principalAdmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class ConsultarVentasF extends javax.swing.JFrame {
    principalAdmin back;

    /**
     * Creates new form ConsultarVentas
     */
    public ConsultarVentasF() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        button_registrar = new javax.swing.JButton();
        button_verTodo = new javax.swing.JButton();
        button_regresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        text_precio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_tipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        table_usuarios.setBackground(new java.awt.Color(255, 102, 0));
        table_usuarios.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        table_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha entrega", "Tipo", "Estado", "Precio compra", "Precio venta"
            }
        ));
        table_usuarios.setEnabled(false);
        table_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_usuariosMouseClicked(evt);
            }
        });
        table_usuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_usuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table_usuarios);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones para ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        button_registrar.setBackground(new java.awt.Color(255, 136, 18));
        button_registrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_registrar.setText("Detalle venta");
        button_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_registrarMouseClicked(evt);
            }
        });
        button_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registrarActionPerformed(evt);
            }
        });
        button_registrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                button_registrarKeyReleased(evt);
            }
        });
        jPanel1.add(button_registrar);

        button_verTodo.setBackground(new java.awt.Color(255, 136, 18));
        button_verTodo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_verTodo.setText("Ver Todo");
        button_verTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_verTodoMouseClicked(evt);
            }
        });
        jPanel1.add(button_verTodo);

        button_regresar.setBackground(new java.awt.Color(255, 136, 18));
        button_regresar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_regresar.setText("Regresar");
        button_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_regresarMouseClicked(evt);
            }
        });
        jPanel1.add(button_regresar);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setText("Consultar ventas");

        text_precio.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        text_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_precioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Número de venta");

        text_tipo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Fecha");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoBueno.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(108, 108, 108)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(text_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_precioActionPerformed

    private void button_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_regresarMouseClicked
       /* back = new principalAdmin();
        back.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_button_regresarMouseClicked

    private void button_verTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_verTodoMouseClicked

    }//GEN-LAST:event_button_verTodoMouseClicked

    private void button_registrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_registrarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarKeyReleased

    private void button_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarActionPerformed

    private void button_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_registrarMouseClicked
        //javax.swing.JOptionPane.showMessageDialog(null, "Registrando");
        /*  String cli=txtRFC.getText();

        Connection miCon;
        miCon = (new ConexionB()).conectar();
        if(!cli.equals("") ){
            if(txtRFC.getText().length()<12){
                JOptionPane.showMessageDialog(null, "Error en los campos");
            }
            if(miCon!=null){
                try{
                    String sql ="SELECT * FROM CLIENTES WHERE RFC='"+cli+"'";
                    Statement stmt = miCon.createStatement();
                    //CallableStatment miCon =
                    ResultSet r = stmt.executeQuery(sql);
                    if(r.next()){
                        String cad = r.getString("RFC")+"";
                        if(cad.equals(cli)){
                            javax.swing.JOptionPane.showMessageDialog(null, "Cliente ya registrado");

                        }
                        r.close();

                    }
                    else{

                        Connection miCon2;
                        miCon2 = (new ConexionB()).conectar();
                        if(!cli.equals("") ){
                            if(miCon2!=null){
                                try{
                                    String sql2 = "INSERT INTO CLIENTES VALUES('"+txtNom.getText()+"','"+txtRFC.getText()+"','"+txtEmail.getText()+"')";
                                    Statement stmt2 = miCon2.createStatement();
                                    ResultSet r2 = stmt.executeQuery(sql2);

                                }
                                catch(Exception e){
                                    /* JOptionPane.showMessageDialog(null, "Conexión Fallida"+ e.getMessage());
                                }
                            }

                        }else{
                            JOptionPane.showMessageDialog(null, "Error");
                        }
                        //actualizar();
                        txtRFC.setText("");

                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Conexión Fallida"+ e.getMessage());
                }
            }
        }
        else{ javax.swing.JOptionPane.showMessageDialog(null, "Error");
        }
        limpiar();*/
    }//GEN-LAST:event_button_registrarMouseClicked

    private void table_usuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_usuariosKeyReleased

    }//GEN-LAST:event_table_usuariosKeyReleased

    private void table_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_usuariosMouseClicked

    }//GEN-LAST:event_table_usuariosMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_registrar;
    private javax.swing.JButton button_regresar;
    private javax.swing.JButton button_verTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_usuarios;
    private javax.swing.JTextField text_precio;
    private javax.swing.JTextField text_tipo;
    // End of variables declaration//GEN-END:variables
}