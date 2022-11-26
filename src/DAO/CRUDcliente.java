
package DAO;

//import Formatos.ManejadorTablas;
import Formatos.Mensajes;
import Modelo.Cliente;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CRUDcliente extends ConectarBD{
    
    public CRUDcliente(){};
   
    public void MostrarClienteEnTabla(JTable tabla,JLabel eti){
        String [] titulos={"Nº","ID Cliente","Dni","Nombres y apellidos","Telefono","correo"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        
        try {
            rs=st.executeQuery("SELECT idcliente,dni,nombreape,telefono,correo,indicador FROM cliente WHERE indicador='S'");
            int cantRg=0;
            while(rs.next()){
                cantRg++;
                Cliente cli = new Cliente();
                cli.setIdcliente(rs.getInt(1));
                cli.setDni(rs.getString(2));
                cli.setNombres(rs.getString(3));
                cli.setTelefono(rs.getString(4));
                cli.setCorreo(rs.getString(5));
                cli.setIndicador(rs.getString(6));
                modelo.addRow(cli.RegistroCliente(cantRg));
            }//fin
//             ManejadorTablas.FormatoTablaCliente(tabla);
            eti.setText("Cantidad de registros: "+cantRg);
            conexion.close();   
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede mostrar los registros en la tabla cliente"+ex);
        }
    }
    
    public void InsertarRegistroCliente(Cliente cli){
        try {
           ps=conexion.prepareStatement("INSERT INTO cliente (dni,nombreape,telefono,correo,indicador) VALUES (?,?,?,?,'S');");
           ps.setString(1, cli.getDni());
           ps.setString(2, cli.getNombres());
           ps.setString(3, cli.getTelefono());
           ps.setString(4, cli.getCorreo());
           ps.executeUpdate();
           Mensajes.M1("Datos registrados correctamente");
        } catch (Exception ex) {
           Mensajes.M1("Error no se puso insertar el registro");
        }
    }
    public Cliente ConsultarRegistroCliente(int idcli){
        Cliente cli=null;
        try {
            rs=st.executeQuery("SELECT idcliente,dni,nombreape,telefono,correo,indicador FROM cliente WHERE indicador='S' AND idcliente="+idcli);
            if(rs.next()){
                cli=new Cliente();
                cli.setIdcliente(rs.getInt(1));
                cli.setDni(rs.getString(2));
                cli.setNombres(rs.getString(3));
                cli.setTelefono(rs.getString(4));
                cli.setCorreo(rs.getString(5));
                cli.setIndicador(rs.getString(6));
            }
            rs.close();
        } catch (Exception ex) {
            Mensajes.M1("Error al recuperar registro Cliente"+ex);
        }
        return cli;
}
    public void ActualizarRegistroCliente(Cliente cli){
        try {
            ps=conexion.prepareStatement("UPDATE cliente SET dni=?,nombreape=?,telefono=?,correo=? WHERE idcliente=?;");
            ps.setString(1, cli.getDni());
            ps.setString(2, cli.getNombres());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getCorreo());
            ps.setInt(5, cli.getIdcliente());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede actualizar el registro"+ex);
        }
    }
    public void EliminarRegistroCliente(int idcli){
        try {
            ps=conexion.prepareStatement("UPDATE cliente SET indicador='N' WHERE idcliente=?;");
            ps.setInt(1, idcli);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se pudo eliminar el registro"+ex);
        }
    }
}
