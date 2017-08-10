/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipospa;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableColumn;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author lis_h
 */
public class ConVenBuscarF extends javax.swing.JFrame {

    principalAdmin pAdmin;
    VentasAdminConVenF re;
    OpcionesVenta oV;
    int contador = 0;

    /**
     * Creates new form PedidosAdmin
     */
    public ConVenBuscarF() {

        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        button_regresar = new javax.swing.JButton();
        button_eliminar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Lbusu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_serv = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_productos = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pedidos = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_idp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones para venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

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

        button_eliminar1.setBackground(new java.awt.Color(255, 136, 18));
        button_eliminar1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_eliminar1.setText("Consultar venta");
        button_eliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_eliminar1MouseClicked(evt);
            }
        });
        jPanel1.add(button_eliminar1);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setText("Detalle Venta Fadmin");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoBueno.jpg"))); // NOI18N

        Lbusu.setText("jLabel2");

        table_serv.setBackground(new java.awt.Color(255, 102, 0));
        table_serv.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_serv.setForeground(new java.awt.Color(255, 255, 255));
        table_serv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servicio"
            }
        ));
        table_serv.setEnabled(false);
        table_serv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_servMouseClicked(evt);
            }
        });
        table_serv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_servKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table_serv);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setText("Servicios");

        table_productos.setBackground(new java.awt.Color(255, 102, 0));
        table_productos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_productos.setForeground(new java.awt.Color(255, 255, 255));
        table_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre producto"
            }
        ));
        table_productos.setToolTipText("");
        table_productos.setEnabled(false);
        table_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_productosMouseClicked(evt);
            }
        });
        table_productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_productosKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(table_productos);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setText("Productos");

        table_pedidos.setBackground(new java.awt.Color(255, 102, 0));
        table_pedidos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_pedidos.setForeground(new java.awt.Color(255, 255, 255));
        table_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id del pedido"
            }
        ));
        table_pedidos.setEnabled(false);
        table_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pedidosMouseClicked(evt);
            }
        });
        table_pedidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_pedidosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table_pedidos);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setText("Pedidos");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel18.setText("ID Venta");

        txt_idp.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_idp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idpKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lbusu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_idp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel15)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel16)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel17)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(Lbusu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_regresarMouseClicked
        re = new VentasAdminConVenF();
        re.setVisible(true);
        this.setVisible(false);
        re.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_regresarMouseClicked

    private void button_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_regresarActionPerformed

    private void table_servMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_servMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_servMouseClicked

    private void table_servKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_servKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_table_servKeyReleased

    private void table_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_productosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_productosMouseClicked

    private void table_productosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_productosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_table_productosKeyReleased

    private void table_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pedidosMouseClicked

    }//GEN-LAST:event_table_pedidosMouseClicked

    private void table_pedidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_pedidosKeyReleased

    }//GEN-LAST:event_table_pedidosKeyReleased

    private void txt_idpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idpKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        //48-57
        if (k >= 97 && k <= 127 || k >= 65 && k <= 90 || k >= 30 && k <= 47 || k >= 58 && k <= 64 || k >= 91 && k <= 96) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(this, "Ingrese sólo números", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idpKeyTyped

    private void button_eliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_eliminar1MouseClicked
                  
        String id = txt_idp.getText();

        if (!id.equals("")) {
            try {

                if (!id.equals("")) {
                    ///inicia primera tabla/////////////////////////
                    DefaultTableModel modelo = new DefaultTableModel();
                    this.table_pedidos.setModel(modelo);

                    Connection miCon;
                    miCon = (new ConexionBD()).conectar();
                    String sql = "select id_pedido as \"Id del pedido\" from det_venta_pedi where id_venta='"+id+"' ";
                    Statement stmt = miCon.createStatement();
                    ResultSet r = stmt.executeQuery(sql);
                    // stmt.close();

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
                    txt_idp.setText("");
                    ////termina primera tabla/////
                      
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Conexión Fallida " + ex.getMessage());
            }
               try {

                if (!id.equals("")) {
///inicia segunda tabla/////////////////////////
                    DefaultTableModel modelo2 = new DefaultTableModel();
                    this.table_productos.setModel(modelo2);

                    Connection miCon2;
                    miCon2 = (new ConexionBD()).conectar();
                    String sql2 = "select nombre as \"Nombre producto\" from det_venta_produc where id_venta='"+id+"'";
                    Statement stmt2 = miCon2.createStatement();
                    ResultSet r2 = stmt2.executeQuery(sql2);
                    // stmt.close();

                    ResultSetMetaData rsMd2 = r2.getMetaData();

                    int cantidadColumnas2 = rsMd2.getColumnCount();

                    for (int i = 1; i <= cantidadColumnas2; i++) {
                        modelo2.addColumn(rsMd2.getColumnLabel(i));
                    }

                    while (r2.next()) {
                        Object[] fila = new Object[cantidadColumnas2];
                        for (int i = 0; i < cantidadColumnas2; i++) {
                            fila[i] = r2.getObject(i + 1);
                        }
                        modelo2.addRow(fila);
                    }

                    r2.close();
                    txt_idp.setText("");
                    ////termina segunda tabla/////
                      
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Conexión Fallida, producto  " + ex.getMessage());
            }
               
               try {

                if (!id.equals("")) {
///inicia tercera tabla/////////////////////////
                    DefaultTableModel modelo3 = new DefaultTableModel();
                    this.table_serv.setModel(modelo3);

                    Connection miCon3;
                    miCon3 = (new ConexionBD()).conectar();
                    String sql3 = "select nombre as \"Nombre servicio\" from det_venta_serv where id_venta='"+id+"'";
                    Statement stmt3 = miCon3.createStatement();
                    ResultSet r3 = stmt3.executeQuery(sql3);
                    // stmt.close();

                    ResultSetMetaData rsMd3 = r3.getMetaData();

                    int cantidadColumnas3 = rsMd3.getColumnCount();

                    for (int i = 1; i <= cantidadColumnas3; i++) {
                        modelo3.addColumn(rsMd3.getColumnLabel(i));
                    }

                    while (r3.next()) {
                        Object[] fila = new Object[cantidadColumnas3];
                        for (int i = 0; i < cantidadColumnas3; i++) {
                            fila[i] = r3.getObject(i + 1);
                        }
                        modelo3.addRow(fila);
                    }
                      /* if(!r3.next()) {
                        JOptionPane.showMessageDialog(this, "Registro no econtrado " );
                        } */
                    
                    r3.close();
                    txt_idp.setText("");
                    ////termina tercera  tabla/////
                      
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Conexión Fallida, servicio  " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error, busque por id venta");
        }
    }//GEN-LAST:event_button_eliminar1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    
     public void actualizar() {

    }

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
            java.util.logging.Logger.getLogger(ConVenBuscarF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConVenBuscarF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConVenBuscarF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConVenBuscarF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ConVenBuscarF().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbusu;
    private javax.swing.JButton button_eliminar1;
    private javax.swing.JButton button_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_pedidos;
    private javax.swing.JTable table_productos;
    private javax.swing.JTable table_serv;
    private javax.swing.JTextField txt_idp;
    // End of variables declaration//GEN-END:variables
}
