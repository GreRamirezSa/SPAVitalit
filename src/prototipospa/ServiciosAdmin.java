/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipospa;

import java.awt.event.KeyEvent;
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
public class ServiciosAdmin extends javax.swing.JFrame {

    principalAdmin pAdmin;

    /**
     * Creates new form ServiciosAdmin
     */
    public ServiciosAdmin() {
        initComponents();
        actualizar();
        setLocationRelativeTo(null);
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
        txt_serv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        button_registrar = new javax.swing.JButton();
        button_eliminar = new javax.swing.JButton();
        button_actualizar = new javax.swing.JButton();
        button_buscar = new javax.swing.JButton();
        button_verTodo = new javax.swing.JButton();
        button_regresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_duracion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Lbusu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_serv.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        table_usuarios.setBackground(new java.awt.Color(255, 102, 0));
        table_usuarios.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        table_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre servicio", "Duración", "Costo"
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones para servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setText("Servicios");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Nombre del servicio");

        txt_duracion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_duracionActionPerformed(evt);
            }
        });
        txt_duracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_duracionKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoBueno.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Duración");

        txt_costo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Costo");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("ID");

        txt_id.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("min");

        Lbusu.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))
                        .addGap(126, 126, 126))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lbusu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Lbusu)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        String nomS = txt_serv.getText();
        String duracion = txt_duracion.getText();
        String costo = txt_costo.getText();

        String id = txt_id.getText();
        int response = JOptionPane.showConfirmDialog(this, "Nombre: " + nomS + "\nDuracion: " + duracion + "\nCosto: " + costo + "\n¿Son los datos correctos?", "ATENCIÓN",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.YES_OPTION) {
            Connection miCon;
            miCon = (new ConexionBD()).conectar();
            if (!nomS.equals("") && !duracion.equals("") && !costo.equals("")) {
                if (miCon != null) {
                    try {

                        String sql = "INSERT INTO servicios (nombre, duracion, costo) VALUES ('" + nomS + "'," + duracion + ",'" + costo + "')";
                        Statement stmt = miCon.createStatement();
                        stmt.executeUpdate(sql);
                        stmt.close();

                        JOptionPane.showMessageDialog(this, "Registrado con éxito");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Verifique la información a insertar", "Error no se registro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                txt_costo.setText("");
                txt_duracion.setText("");
                txt_serv.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Error, no dejar campos vacíos");
            }
            actualizar();
        } else if (response == JOptionPane.CLOSED_OPTION) {
        }
        /*System.out.println(usu);
     System.out.println(nom);
     System.out.println(tipo);*/

    }//GEN-LAST:event_button_registrarMouseClicked

    private void button_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarActionPerformed

    private void button_registrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_registrarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarKeyReleased

    private void button_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_eliminarMouseClicked

        String id = txt_id.getText();
        int response = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar el servicio?", "ATENCIÓN",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.YES_OPTION) {
            Connection miCon;
            miCon = (new ConexionBD()).conectar();
            if (!id.equals("")) {
                if (miCon != null) {
                    try {
                        String sql = "DELETE FROM servicios WHERE id_servicio=" + "'" + id + "'";
                        Statement stmt = miCon.createStatement();
                        stmt.executeUpdate(sql);
                        stmt.close();
                        /*if(r.getRow() == 0)
                    System.out.println("Vacio");
                else
                    while(r.next()){    
                      
                    }*/
                        JOptionPane.showMessageDialog(this, "Registro eliminado");
                        txt_id.setText("");
                    } catch (SQLException e) {

                        JOptionPane.showMessageDialog(this, "Imposible eliminar, servicio en uso dentro de la base de datos", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Error, eliminar por ID");
            }
            actualizar();
            txt_id.setText("");
        } else if (response == JOptionPane.CLOSED_OPTION) {
        }
    }//GEN-LAST:event_button_eliminarMouseClicked

    private void button_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_actualizarMouseClicked
        String id = txt_id.getText();
        String costo = txt_costo.getText();
        Connection miCon;

        miCon = (new ConexionBD()).conectar();
        if (!id.equals("")) {
            if (!costo.equals("")) {
                if (miCon != null) {
                    try {

                        String sql = "UPDATE servicios SET costo= " + costo + " WHERE id_servicio=" + id;
                        Statement stmt = miCon.createStatement();
                        stmt.executeUpdate(sql);
                        stmt.close();
                        JOptionPane.showMessageDialog(this, "Actualizado con éxito");
                        txt_id.setText("");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Se ha producido algún error verificar información", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                txt_costo.setText("");
                txt_id.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "Error, ingrese el costo actualizado");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Error, actualizar el costo del servicio por ID");
        }
        actualizar();
    }//GEN-LAST:event_button_actualizarMouseClicked

    private void button_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_buscarMouseClicked
        String id = txt_id.getText();
        if (!id.equals("")) {
            try {

                DefaultTableModel modelo = new DefaultTableModel();
                this.table_usuarios.setModel(modelo);

                Connection miCon;
                miCon = (new ConexionBD()).conectar();
                String sql = "select id_servicio as \"ID servicios\",nombre as \"Nombre servicio\",duracion as \"Duración en minutos\",costo as \"Costo\" from servicios WHERE id_servicio=" + "'" + id + "'";
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
                txt_id.setText("");

            } catch (Exception ex) {
                ex.printStackTrace();

                JOptionPane.showMessageDialog(this, "Se ha producido algún error verificar información", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error, buscar por ID");
        }
    }//GEN-LAST:event_button_buscarMouseClicked

    private void button_verTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_verTodoMouseClicked
        actualizar();
    }//GEN-LAST:event_button_verTodoMouseClicked

    private void button_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_regresarMouseClicked
        pAdmin = new principalAdmin();
        pAdmin.setVisible(true);
        this.setVisible(false);
        pAdmin.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_regresarMouseClicked

    private void txt_duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_duracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_duracionActionPerformed

    private void button_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_regresarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costoKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
        //48-57
        if (k >= 97 && k <= 127 || k >= 65 && k <= 90 || k >= 30 && k <= 45 || k >= 58 && k <= 64 || k >= 91 && k <= 96 || k == 47) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(this, "Ingrese sólo números", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txt_costoKeyTyped

    private void txt_duracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_duracionKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
        //48-57
        if (k >= 97 && k <= 127 || k >= 65 && k <= 90 || k >= 30 && k <= 47 || k >= 58 && k <= 64 || k >= 91 && k <= 96) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(this, "Ingrese sólo números", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txt_duracionKeyTyped

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    

        //48-57
        if (k >= 97 && k <= 127 || k >= 65 && k <= 90 || k >= 30 && k <= 47 || k >= 58 && k <= 64 || k >= 91 && k <= 96) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(this, "Ingrese sólo números", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idKeyTyped
    public void actualizar() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            this.table_usuarios.setModel(modelo);

            Connection miCon;
            miCon = (new ConexionBD()).conectar();

            String sql = "SELECT id_servicio as \"ID servicios\",nombre as \"Nombre servicio\",duracion as \"Duración en minutos\",costo as \"Costo\" FROM servicios";
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
            java.util.logging.Logger.getLogger(ServiciosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiciosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiciosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiciosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiciosAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbusu;
    private javax.swing.JButton button_actualizar;
    private javax.swing.JButton button_buscar;
    private javax.swing.JButton button_eliminar;
    private javax.swing.JButton button_registrar;
    private javax.swing.JButton button_regresar;
    private javax.swing.JButton button_verTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_usuarios;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_duracion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_serv;
    // End of variables declaration//GEN-END:variables
}
