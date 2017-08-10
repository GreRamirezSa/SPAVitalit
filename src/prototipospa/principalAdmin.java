/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipospa;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lis_h
 */
public class principalAdmin extends javax.swing.JFrame {
    usuariosAdmin pUsuarios;
    clientesAdmin pClientes;
    CitasAdmin pCitas;
    ProductAdmin pProductos;
    ServiciosAdmin pServicios;
    OpcionesVenta pVentas;
    login login;
    Certificados cer;
    ChicaAdmin chica;

    /**
     * Creates new form principalAdmin
     */
    public principalAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        button_usuarios = new javax.swing.JButton();
        button_citas = new javax.swing.JButton();
        button_productos = new javax.swing.JButton();
        button_ventas = new javax.swing.JButton();
        button_clientes = new javax.swing.JButton();
        button_servicios = new javax.swing.JButton();
        Lbusu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        button_citas1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        button_chica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        button_ventas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        button_usuarios.setBackground(new java.awt.Color(255, 136, 18));
        button_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        button_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_usuariosMouseClicked(evt);
            }
        });
        button_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_usuariosActionPerformed(evt);
            }
        });

        button_citas.setBackground(new java.awt.Color(255, 136, 18));
        button_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cita.png"))); // NOI18N
        button_citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_citasMouseClicked(evt);
            }
        });
        button_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_citasActionPerformed(evt);
            }
        });

        button_productos.setBackground(new java.awt.Color(255, 136, 18));
        button_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inventario.png"))); // NOI18N
        button_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_productosMouseClicked(evt);
            }
        });

        button_ventas.setBackground(new java.awt.Color(255, 136, 18));
        button_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/venta.png"))); // NOI18N
        button_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_ventasMouseClicked(evt);
            }
        });

        button_clientes.setBackground(new java.awt.Color(255, 136, 18));
        button_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clientes.png"))); // NOI18N
        button_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_clientesMouseClicked(evt);
            }
        });
        button_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_clientesActionPerformed(evt);
            }
        });

        button_servicios.setBackground(new java.awt.Color(255, 136, 18));
        button_servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/servicio.png"))); // NOI18N
        button_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_serviciosMouseClicked(evt);
            }
        });
        button_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_serviciosActionPerformed(evt);
            }
        });

        Lbusu.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        Lbusu.setText("Bienvenido Usuario");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/usuarios.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/clientes.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/signature.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/productos.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/servicios.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/ventas.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Salir");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        button_citas1.setBackground(new java.awt.Color(255, 136, 18));
        button_citas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/certificados.png"))); // NOI18N
        button_citas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_citas1MouseClicked(evt);
            }
        });
        button_citas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_citas1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/cer.png"))); // NOI18N

        button_chica.setBackground(new java.awt.Color(255, 136, 18));
        button_chica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/chica.png"))); // NOI18N
        button_chica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_chicaMouseClicked(evt);
            }
        });
        button_chica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_chicaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Nueva carpeta/cachica.png"))); // NOI18N

        button_ventas1.setBackground(new java.awt.Color(255, 136, 18));
        button_ventas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transaccion.png"))); // NOI18N
        button_ventas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_ventas1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbusu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel5)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel6)
                            .addGap(450, 450, 450))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button_usuarios)
                                            .addComponent(button_productos))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button_servicios)
                                            .addComponent(button_clientes))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button_ventas)
                                            .addComponent(button_citas))
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(64, 64, 64)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel4)
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel2)
                                    .addGap(99, 99, 99)
                                    .addComponent(jLabel3)
                                    .addGap(84, 84, 84)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(button_citas1)
                                .addComponent(jLabel9)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_chica))
                            .addGap(40, 40, 40)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_ventas1)
                .addGap(334, 334, 334))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Lbusu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_clientes)
                            .addComponent(button_citas)
                            .addComponent(button_usuarios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_chica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_servicios)
                    .addComponent(button_productos)
                    .addComponent(button_ventas)
                    .addComponent(button_citas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_ventas1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void nombre(String u){
        Lbusu.setText(u);
    }
    private void button_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_serviciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_serviciosActionPerformed

    private void button_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_clientesActionPerformed

    private void button_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_citasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_citasActionPerformed

    private void button_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_usuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_usuariosActionPerformed

    private void button_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_usuariosMouseClicked
        pUsuarios = new usuariosAdmin();
        pUsuarios.setVisible(true);
        this.setVisible(false);
        pUsuarios.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_usuariosMouseClicked

    private void button_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_clientesMouseClicked
        pClientes = new clientesAdmin();
        pClientes.setVisible(true);
        this.setVisible(false);
        pClientes.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_clientesMouseClicked

    private void button_citasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_citasMouseClicked
        pCitas = new CitasAdmin();
        pCitas.setVisible(true);
        this.setVisible(false);
        pCitas.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_citasMouseClicked

    private void button_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_productosMouseClicked
        pProductos = new ProductAdmin();
        pProductos.setVisible(true);
        this.setVisible(false);
        pProductos.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_productosMouseClicked

    private void button_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_serviciosMouseClicked
        pServicios = new ServiciosAdmin();
        pServicios.setVisible(true);
        this.setVisible(false);
        pServicios.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_serviciosMouseClicked

    private void button_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_ventasMouseClicked
        pVentas = new OpcionesVenta();
        pVentas.setVisible(true);
        this.setVisible(false);
      pVentas.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_ventasMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
   int response = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir?", "ATENCIÓN",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
      
    } else if (response == JOptionPane.YES_OPTION) {
        login = new login();
        login.setVisible(true);
        this.setVisible(false);
 
    } else if (response == JOptionPane.CLOSED_OPTION) {  
    }  
    }//GEN-LAST:event_jLabel8MouseClicked

    private void button_citas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_citas1MouseClicked
        cer = new Certificados();
        cer.setVisible(true);
        
        this.setVisible(false);
         cer.nombre(Lbusu.getText());
    }//GEN-LAST:event_button_citas1MouseClicked

    private void button_citas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_citas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_citas1ActionPerformed

    private void button_chicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_chicaMouseClicked
        try {
            chica = new ChicaAdmin();
        } catch (SQLException ex) {
            Logger.getLogger(principalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        chica.setVisible(true);
        chica.nombre(Lbusu.getText());
        this.setVisible(false);
    }//GEN-LAST:event_button_chicaMouseClicked

    private void button_chicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_chicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_chicaActionPerformed

    private void button_ventas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_ventas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ventas1MouseClicked

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
            java.util.logging.Logger.getLogger(principalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbusu;
    private javax.swing.JButton button_chica;
    private javax.swing.JButton button_citas;
    private javax.swing.JButton button_citas1;
    private javax.swing.JButton button_clientes;
    private javax.swing.JButton button_productos;
    private javax.swing.JButton button_servicios;
    private javax.swing.JButton button_usuarios;
    private javax.swing.JButton button_ventas;
    private javax.swing.JButton button_ventas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
