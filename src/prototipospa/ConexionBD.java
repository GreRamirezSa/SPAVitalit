/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipospa;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConexionBD {
    public Connection conectar(){
    Connection con=null;
    String url = "jdbc:postgresql://localhost:5432/SpaDB";
    try {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, "postgres", "postgres");
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e, "Error"+e.getMessage(),JOptionPane.ERROR);
    }
    return con;
    }
}
