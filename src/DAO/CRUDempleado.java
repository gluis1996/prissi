
package DAO;

//import Formatos.ManejadorTablas;
import Formatos.Mensajes;
import Modelo.Empleado;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Lunarejo
 */
public class CRUDempleado extends ConectarBD {
    public CRUDempleado(){};
    
    public void MostrarEmpleadoEnTabla(JTable tabla,JLabel eti){
        String [] titulos={"Nº","ID Empleado","Dni","Nombres y Apellidos","Telefono","Correo","Sueldo"};
        DefaultTableModel modelo=new DefaultTableModel (null,titulos);
        tabla.setModel(modelo);
        
        try {
            rs=st.executeQuery("SELECT idempleado,dni,nombres,telefono,correo,sueldo,indicador FROM empleado WHERE indicador='S'");
            int cantRg=0;
            
            while(rs.next()){
                cantRg++;
                Empleado em=new Empleado ();
                em.setIdempleado(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNombres(rs.getString(3));
                em.setTelefono(rs.getString(4));
                em.setCorreo(rs.getString(5));
                em.setSueldo(rs.getDouble(6));
                modelo.addRow(em.RegistroEmpleado(cantRg));
            }//FIN
//           ManejadorTablas.FormatoTablaEmpleado(tabla);
           eti.setText("Cantidad de Registros: "+cantRg);
           conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede mostrar los registros en la tabla Empleado"+ex);
        }
    }
    public void InsertarRegistroEmpleado(Empleado em){
        try {
            ps=conexion.prepareStatement("INSERT INTO empleado (dni,nombres,telefono,correo,sueldo,indicador) VALUES (?,?,?,?,?,'S');");
            ps.setString(1, em.getDni());
            ps.setString(2, em.getNombres());
            ps.setString(3, em.getTelefono());
            ps.setString(4, em.getCorreo());
            ps.setDouble(5, em.getSueldo());
            ps.executeUpdate();
            Mensajes.M1("Datos registrados correctamente");
        } catch (Exception ex) {
            Mensajes.M1("Error no se pudo insertar el registro");
        }
    }
    public Empleado ConsultarRegistroEmpleado(int idem){
        Empleado em=null;
        try {
            rs=st.executeQuery("SELECT idempleado,dni,nombres,telefono,correo,sueldo,indicador FROM empleado WHERE indicador='S' AND idempleado="+idem);
            if(rs.next()){
                em=new Empleado();
                em.setIdempleado(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNombres(rs.getString(3));
                em.setTelefono(rs.getString(4));
                em.setCorreo(rs.getString(5));
                em.setSueldo(rs.getDouble(6));
                em.setIndicador(rs.getString(7));
            }
            rs.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede recuperar registro Empleado"+ex);
        }
        return em;
    }
    
    public void ActualizarRegistroEmpleado(Empleado em){
        try {
            ps=conexion.prepareStatement("UPDATE empleado SET dni=?,nombres=?,telefono=?,correo=?, sueldo=? WHERE idempleado=?;");
            ps.setString(1, em.getDni());
            ps.setString(2, em.getNombres());
            ps.setString(3, em.getTelefono());
            ps.setString(4, em.getCorreo());
            ps.setDouble(5, em.getSueldo());
            ps.setInt(6, em.getIdempleado());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente");
            ps.close();
            
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede actualizar el registro");
        }
    }
    public void EliminarRegistroEmpleado(int idem){
        try {
            ps=conexion.prepareStatement("UPDATE cliente SET indicador='N' WHERE idcliente=?;");
            ps.setInt(1, idem);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se pudo eliminar el registro"+ex);
        }
    }
    
}
