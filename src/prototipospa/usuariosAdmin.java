/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipospa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lis_h
 */
public class usuariosAdmin extends javax.swing.JFrame {

    principalAdmin pAdmin;

    /**
     * Creates new form usuariosAdmin
     */
    public usuariosAdmin() {
        initComponents();
        actualizar();
        setLocationRelativeTo(null);
    }

    public void Error() {
        JOptionPane.showMessageDialog(null, "Error en la operacion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void nombre(String u) {
        Lbusu.setText(u);
        Lbusu.setVisible(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtnom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuarios = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        button_registrar = new javax.swing.JButton();
        button_eliminar = new javax.swing.JButton();
        button_actualizar = new javax.swing.JButton();
        button_buscar = new javax.swing.JButton();
        button_verTodo = new javax.swing.JButton();
        button_regresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtusu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbusu = new javax.swing.JComboBox<>();
        Lbusu1 = new javax.swing.JLabel();
        Lbusu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtnom.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        table_usuarios.setBackground(new java.awt.Color(255, 102, 0));
        table_usuarios.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        table_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Asistente", "Tipo usuario"
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

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Tipo de usuario");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones para usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        button_registrar.setBackground(new java.awt.Color(255, 136, 18));
        button_registrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_registrar.setText("Registrar");
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

        button_eliminar.setBackground(new java.awt.Color(255, 136, 18));
        button_eliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_eliminar.setText("Eliminar");
        button_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(button_eliminar);

        button_actualizar.setBackground(new java.awt.Color(255, 136, 18));
        button_actualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_actualizar.setText("Actualizar");
        button_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_actualizarMouseClicked(evt);
            }
        });
        jPanel1.add(button_actualizar);

        button_buscar.setBackground(new java.awt.Color(255, 136, 18));
        button_buscar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_buscar.setText("Buscar");
        button_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_buscarMouseClicked(evt);
            }
        });
        jPanel1.add(button_buscar);

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
        button_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(button_regresar);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Nombre asistente");

        txtusu.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoBueno.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Nombre de usuario");

        cmbusu.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmbusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Asistente" }));
        cmbusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbusuActionPerformed(evt);
            }
        });

        Lbusu1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Lbusu1.setText("Usuario");

        Lbusu.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 344, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Lbusu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbusu1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cmbusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(114, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Lbusu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Lbusu1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
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
    private void table_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_usuariosMouseClicked

    }//GEN-LAST:event_table_usuariosMouseClicked

    private void table_usuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_usuariosKeyReleased

    }//GEN-LAST:event_table_usuariosKeyReleased

    private void button_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_registrarMouseClicked
        String usu = txtusu.getText();
        String nom = txtnom.getText();
        String tipo = "";
        String tipo2 = "";
        if (cmbusu.getSelectedIndex() == 0) {
            tipo = "0";
            tipo2 = "Administrador";
        } else if (cmbusu.getSelectedIndex() == 1) {
            tipo = "1";
            tipo2 = "Asistente";
        }
        int response = JOptionPane.showConfirmDialog(this, "Usuario: " + usu + "\nNombre: " + nom + "\nTipo: " + tipo2 + "\n¿Son los datos correctos?", "ATENCIÓN",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {
        } else if (response == JOptionPane.YES_OPTION) {
            Connection miCon;
            miCon = (new ConexionBD()).conectar();
            if (!usu.equals("")) {
                if (miCon != null) {
                    try {
                        String sql = "SELECT USUARIO FROM USUARIO WHERE USUARIO= '" + usu + "'";
                        Statement stmt = miCon.createStatement();
                        ResultSet r = stmt.executeQuery(sql);
                        //stmt.close();
                        System.out.println("1");
                        if (r.next()) {
                            String cad = r.getString("usuario") + "";
                            System.out.println("2");
                            if (cad.equals(usu)) {

                                System.out.println("Usuario ya registrado");
                                JOptionPane.showMessageDialog(this, "Usuario ya registrado");
                            }

                        } else {
                            Connection miCon2;
                            miCon2 = (new ConexionBD()).conectar();
                            if (!usu.equals("") && !nom.equals("")) {
                                if (miCon2 != null) {
                                    try {
                                        String sql2 = "INSERT INTO USUARIO (nombre, usuario, contra, tipo) VALUES ('" + nom + "','" + usu + "','" + usu + "'," + tipo + ")";
                                        Statement stmt2 = miCon2.createStatement();
                                        stmt2.executeUpdate(sql2);
                                        stmt2.close();
                                        JOptionPane.showMessageDialog(this, "Registrado con éxito");
                                    } catch (SQLException e) {
                                        JOptionPane.showMessageDialog(this, "Verifique la información a insertar", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Error, no dejar campos vacíos.");
                            }
                            actualizar();
                            txtusu.setText("");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Verifique la información a insertar", "Error",
                                JOptionPane.ERROR_MESSAGE);

                    }
                }
                txtnom.setText("");
                txtusu.setText("");

            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error, no dejar campos vacíos.");
            }
        } else if (response == JOptionPane.CLOSED_OPTION) {

        }
    }//GEN-LAST:event_button_registrarMouseClicked

    private void button_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarActionPerformed

    private void button_registrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_registrarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarKeyReleased

    private void button_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_eliminarMouseClicked
        String usu = txtusu.getText();
        int response = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar al usuario " + usu, "ATENCIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {
        } else if (response == JOptionPane.YES_OPTION) {
            Connection miCon;
            miCon = (new ConexionBD()).conectar();
            if (!usu.equals("")) {
                if (miCon != null) {
                    try {
                        String sql = "DELETE FROM USUARIO WHERE USUARIO=" + "'" + usu + "'";
                        Statement stmt = miCon.createStatement();
                        stmt.executeUpdate(sql);
                        stmt.close();
                        JOptionPane.showMessageDialog(this, "Se eliminó con éxito ");

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error, eliminar por nombre de usuario");
            }
            actualizar();
            txtusu.setText("");
        } else if (response == JOptionPane.CLOSED_OPTION) {
        }
    }//GEN-LAST:event_button_eliminarMouseClicked

    private void button_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_buscarMouseClicked
        String usu = txtusu.getText();
        if (!usu.equals("")) {
            try {

                DefaultTableModel modelo = new DefaultTableModel();
                this.table_usuarios.setModel(modelo);

                Connection miCon;
                miCon = (new ConexionBD()).conectar();
                String sql = "select id_usuario as \"ID usuario\", nombre as \"Nombre\", usuario as \"Usuario\", contra as \"Contraseña\", tipo as \"Tipo\" from USUARIO WHERE USUARIO=" + "'" + usu + "'";
                Statement stmt = miCon.createStatement();
                ResultSet r = stmt.executeQuery(sql);

                ResultSetMetaData rsMd = r.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(rsMd.getColumnLabel(i));
                }

                while (r.next()) {
                    System.out.println(r.getString("usuario"));
                    Object[] fila = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = r.getObject(i + 1);
                    }
                    modelo.addRow(fila);
                }
                r.close();
                txtusu.setText("");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error, buscar por nombre de usuario");
        }
        cambio2();
    }//GEN-LAST:event_button_buscarMouseClicked

    private void button_verTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_verTodoMouseClicked
        actualizar();
    }//GEN-LAST:event_button_verTodoMouseClicked

    private void button_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_actualizarMouseClicked
        String usu = txtusu.getText();
        int response = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea actualizar al usuario?" + usu, "ATENCIÓN",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.YES_OPTION:
                String tipo = cmbusu.getSelectedIndex() + "";
                System.out.println(tipo);
                Connection miCon;
                miCon = (new ConexionBD()).conectar();
                if (!usu.equals("")) {
                    if (miCon != null) {
                        try {
                            String sql = "UPDATE USUARIO SET tipo= " + tipo + " WHERE USUARIO='" + usu + "'";
                            Statement stmt = miCon.createStatement();
                            stmt.executeUpdate(sql);
                            stmt.close();
                            JOptionPane.showMessageDialog(this, "Actualizado con éxito ");
                            
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(this, "No se pudo actualizar", "Error",
                                    JOptionPane.ERROR_MESSAGE);      
                        }
                    }
                    txtnom.setText("");
                    txtusu.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Error, actualizar el tipo de usuario por nombre de usuario");
                }   actualizar();
                break;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_button_actualizarMouseClicked

    private void cmbusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbusuActionPerformed

    private void button_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_regresarMouseClicked
        pAdmin = new principalAdmin();
        pAdmin.setVisible(true);
        this.setVisible(false);
        pAdmin.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_regresarMouseClicked

    private void button_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_regresarActionPerformed

    //comentario de prueba para ver que onda y porque se traba
    public void cambio() {
        for (int i = 0; i < table_usuarios.getRowCount(); i++) {
            if ((int) table_usuarios.getValueAt(i, 2) == 0) {
                table_usuarios.setValueAt("Administrador", i, 2);

            } else {
                table_usuarios.setValueAt("Asistente", i, 2);
            }

        }

    }
      public void cambio2() {
        for (int i = 0; i < table_usuarios.getRowCount(); i++) {
            if ((int) table_usuarios.getValueAt(i, 4) == 0) {
                table_usuarios.setValueAt("Administrador", i, 4);

            } else {
                table_usuarios.setValueAt("Asistente", i, 4);
            }

        }

    }

    public void actualizar() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            this.table_usuarios.setModel(modelo);

            Connection miCon;
            miCon = (new ConexionBD()).conectar();

            String sql = "SELECT NOMBRE as \"Nombre\",USUARIO as\"Usuario\",TIPO as \"Tipo\" FROM USUARIO";
            Statement stmt = miCon.createStatement();
            ResultSet r = stmt.executeQuery(sql);

            ResultSetMetaData rsMd = r.getMetaData();

            int cantidadColumnas = rsMd.getColumnCount();

            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }

            while (r.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = r.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            r.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        cambio();
    }

    public void Confirmar() {
        int response = JOptionPane.showConfirmDialog(this, "", "ATENCIÓN",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.YES_OPTION) {

        } else if (response == JOptionPane.CLOSED_OPTION) {
        }
    }

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
            java.util.logging.Logger.getLogger(usuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuariosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuariosAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbusu;
    private javax.swing.JLabel Lbusu1;
    private javax.swing.JButton button_actualizar;
    private javax.swing.JButton button_buscar;
    private javax.swing.JButton button_eliminar;
    private javax.swing.JButton button_registrar;
    private javax.swing.JButton button_regresar;
    private javax.swing.JButton button_verTodo;
    private javax.swing.JComboBox<String> cmbusu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_usuarios;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}