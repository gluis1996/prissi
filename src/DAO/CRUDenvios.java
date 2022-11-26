
package DAO;

import Formatos.Mensajes;
import Modelo.Envios;
import java.text.SimpleDateFormat;

/**
 *
 * @author Priscila Lunarejo
 */
public class CRUDenvios extends ConectarBD{
    
    public void InsertarEnvios (Envios v){
        try {
            ps=conexion.prepareStatement("INSERT INTO ventas(idCliente,idProducto,fecha,cantidad,preciounitario,indicador) VALUES(?,?,?,?,?,'S');");
            ps.setInt(1, v.getIdproveedor());
            ps.setInt(2, v.getIdinsumos());
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");        
            ps.setString(3,df.format(v.getFecha()));
            ps.setInt(4, v.getCantidad());
            ps.setDouble(5,v.getPrecio());
            ps.executeUpdate();
        Mensajes.M1("La venta se ha registrado correctamente....");
        } catch (Exception e) {
             Mensajes.M1("ERROR no se puede insertar el registro productos..."+e);
        }
    } 
}