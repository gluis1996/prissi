package DAO;
import java.sql.*;
import Formatos.Mensajes;

public class ConectarBD implements Parametros{
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    
    public ConectarBD(){
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA,USUARIO,CLAVE);
            st = conexion.createStatement();
        }catch(Exception ex){
            Mensajes.M1("Error no se puede conectar a la BD"+ex);
        }
    }
    
}
