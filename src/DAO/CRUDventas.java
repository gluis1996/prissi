
package DAO;
import Modelo.*;
import Formatos.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author Priscila Lunarejo
 */
public class CRUDventas extends ConectarBD{
    
    public void InsertarVentas (Ventas v){
        try {
            ps=conexion.prepareStatement("INSERT INTO ventas(idCliente,idProducto,fecha,cantidad,preciounitario,indicador) VALUES(?,?,?,?,?,'S');");
            ps.setInt(1, v.getIdcliente());
            ps.setInt(2, v.getIdproducto());
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
