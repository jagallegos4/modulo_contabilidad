
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Andres Gallegos
 */
public class ControladorUsuario {
    
    public boolean loginUser(Usuario objeto){
        boolean respuesta = false;
        
        Connection cn = Conexion.conectar();
        String sql ="select usuario, password from usuario where usuario='"+objeto.getUser()+"' and password='"+objeto.getPassword()+"'";
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                respuesta = true;
            }
        }catch(SQLException e){
            System.out.println("Error de login: "+e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }
        return respuesta;
    }
}
