
package DAO;

//import Formatos.ManejadorTablas;
import Formatos.Mensajes;
import Modelo.Proveedores;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Lunarejo
 */
public class CRUDproveedores extends ConectarBD{
   public CRUDproveedores(){};
   
    public void MostrarProveedoresEnTabla(JTable tabla,JLabel eti){
        String [] titulos={"Nº","ID Proveedor","Dni","Nombres y apellidos","Telefono","correo"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        
        try {
            rs=st.executeQuery("SELECT idproveedor,dni,nombreape,telefono,correo,indicador FROM proveedores WHERE indicador='S'");
            int cantRg=0;
            while(rs.next()){
                cantRg++;
                Proveedores cli = new Proveedores();
                cli.setIdproveedor(rs.getInt(1));
                cli.setDni(rs.getString(2));
                cli.setNombres(rs.getString(3));
                cli.setTelefono(rs.getString(4));
                cli.setCorreo(rs.getString(5));
                cli.setIndicador(rs.getString(6));
                modelo.addRow(cli.RegistroProveedor(cantRg));
            }//fin
//             ManejadorTablas.FormatoTablaProveedores(tabla);
            eti.setText("Cantidad de registros: "+cantRg);
            conexion.close();   
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede mostrar los registros en la tabla Proveedores"+ex);
        }
    }
    
    public void InsertarRegistroProveedor(Proveedores p){
        try {
           ps=conexion.prepareStatement("INSERT INTO proveedores (dni,nombreape,telefono,correo,indicador) VALUES (?,?,?,?',?);");
           ps.setString(1, p.getDni());
           ps.setString(2, p.getNombres());
           ps.setString(3, p.getTelefono());
           ps.setString(4, p.getCorreo());
           ps.executeUpdate();
           Mensajes.M1("Datos registrados correctamente");
        } catch (Exception ex) {
           Mensajes.M1("Error no se puso insertar el registro");
        }
    }
    public Proveedores ConsultarRegistroProveedor(int idp){
       Proveedores p=null;
        try {
            rs=st.executeQuery("SELECT idproveedor,dni,nombreape,telefono,correo,indicador FROM proveedores WHERE indicador='S' AND idproveedor=?"+idp);
            if(rs.next()){
                p=new Proveedores();
                p.setIdproveedor(rs.getInt(1));
                p.setDni(rs.getString(2));
                p.setNombres(rs.getString(3));
                p.setTelefono(rs.getString(4));
                p.setCorreo(rs.getString(5));
                p.setIndicador(rs.getString(6));
            }
            rs.close();
        } catch (Exception ex) {
            Mensajes.M1("Error al recuperar registro Cliente"+ex);
        }
        return p;
}
    public void ActualizarRegistroProveedor(Proveedores p){
        try {
            ps=conexion.prepareStatement("UPDATE proveedores SET dni=?,nombreape=?,telefono=?',correo=? WHERE idproveedor=?;");
            ps.setString(1, p.getDni());
            ps.setString(2, p.getNombres());
            ps.setString(3, p.getTelefono());
            ps.setString(4, p.getCorreo());
            ps.setInt(5, p.getIdproveedor());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede actualizar el registro"+ex);
        }
    }
    public void EliminarRegistroProveedor(int idp){
        try {
            ps=conexion.prepareStatement("UPDATE proveedores SET indicador='N' WHERE idproveedor=?;");
            ps.setInt(1, idp);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se pudo eliminar el registro"+ex);
        }
    } 
}
