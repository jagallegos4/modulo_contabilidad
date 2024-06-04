/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andres Gallegos
 */
public class Conexion {
    public static Connection conectar(){
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_appdistpro1","root","");
            return cn;
        }catch(SQLException e){
            System.out.println("Error de conexión: "+ e);
        }
        return null;
    }
}
