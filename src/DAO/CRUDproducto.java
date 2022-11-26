
package DAO;

//import Formatos.ManejadorTablas;
import Formatos.Mensajes;
import Modelo.Producto;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Lunarejo
 */
public class CRUDproducto extends ConectarBD{
    
    public CRUDproducto(){};
    
    public void MostrarProductosEnTabla(JTable tabla,JLabel eti){
        String [] titulos={"Nº","IP Producto","Descripción","Stock","Precio","Fecha ingreso"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        
        try {
            rs=st.executeQuery("SELECT idproducto,descripcion,stock,precio,fechaingreso,indicador FROM producto WHERE indicador='S'");
            int cantRg=0;
            while(rs.next()){
                cantRg++;
                Producto pd =new Producto();
                pd.setIdproduto(rs.getInt(1));
                pd.setDescripcion(rs.getString(2));
                pd.setStock(rs.getInt(3));
                pd.setPrecio(rs.getDouble(4));
                pd.setFechaing(rs.getDate(5));
                modelo.addRow(pd.RegistroProducto(cantRg));
            }//fin
//            ManejadorTablas.FormatoTablaProducto(tabla);
            eti.setText("Cantidad de registros: "+cantRg);
            conexion.close();
            
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede mostrar los registros en la tabla producoto"+ex);
        }
    }
    public void InsertarRegistroProducto(Producto pd){
        try {
            ps=conexion.prepareStatement("INSERT INTO producto (descripcion,stock,precio,fechaingreso,indicador) VALUES (?,?,?,?,'S');");
            ps.setString(1, pd.getDescripcion());
            ps.setInt(2, pd.getStock());
            ps.setDouble(3, pd.getPrecio());
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(4, df.format(pd.getFechaing()));
            ps.executeUpdate();
            Mensajes.M1("Datos registrados correctamente");
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede insertar el registro");
        }
    }
    public Producto ConsultarRegistroProducto(int idpd){
        Producto pd=null;
        try {
             rs=st.executeQuery("SELECT idproducto,descripcion,stock,precio,fechaingreso,indicador FROM producto WHERE indicador='S' AND idproducto=?"+idpd);
            if(rs.next()){
                pd=new Producto();
                pd.setIdproduto(rs.getInt(1));
                pd.setDescripcion(rs.getString(2));
                pd.setStock(rs.getInt(3));
                pd.setPrecio(rs.getDouble(4));
                pd.setFechaing(rs.getDate(5));
                pd.setIndicador(rs.getString(6));
            }
            rs.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede recuperar registro Producto"+ex);
        }
        return pd;
    }
  
    public void ActualizarRegistroProducto(Producto pd){
        try {
            ps=conexion.prepareStatement("UPDATE producto SET descripcion=?, stock=? ,precio=?, fechaingreso=? WHERE idproducto=?;");
            ps.setString(1, pd.getDescripcion());
            ps.setInt(2, pd.getStock());
            ps.setDouble(3, pd.getPrecio());
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(4, df.format(pd.getFechaing()));
            ps.setInt(5, pd.getIdproduto());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede actualizar el registro");
        }
    }
    public void EliminarRegistroProducto(int idprod){
        try {
            ps=conexion.prepareStatement("UPDATE producto SET indicador='N' WHERE idproducto=?;");
            ps.setInt(1, idprod);
            ps.executeUpdate();
            Mensajes.M1("Mensaje eliminado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se pudo eliminar el registro"+ex);
        }
        
        
    }
}            

