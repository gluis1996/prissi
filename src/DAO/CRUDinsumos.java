
package DAO;

//import Formatos.ManejadorTablas;
import Formatos.Mensajes;
import Modelo.Insumos;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Lunarejo
 */
public class CRUDinsumos extends ConectarBD{
    public CRUDinsumos(){};
    public void MostrarInsumosEnTabla(JTable tabla,JLabel eti){
        String [] titulos={"Nº","ID Insumos","Nombre Insumos","Stock","Fecha Ingreso"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        
        try {
            rs=st.executeQuery("SELECT idinsumos,nombreinsumo,stock,fechaentrada,indicador FROM insumos WHERE indicador='S'");
            int cantRg=0;
            while(rs.next()){
                cantRg++;
                Insumos in = new Insumos();
                in.setIdinsumos(rs.getInt(1));
                in.setNombreinsumos(rs.getString(2));
                in.setStock(rs.getInt(3));
                in.setFechaingreso(rs.getDate(4));
                modelo.addRow(in.RegistroInsumos(cantRg));
            }//fin
//             ManejadorTablas.FormatoTablaInsumos(tabla);
            eti.setText("Cantidad de registros: "+cantRg);
            conexion.close();   
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede mostrar los registros en la tabla insumos"+ex);
        }
    }
    
    public void InsertarRegistroInsumos(Insumos in){
        try {
           ps=conexion.prepareStatement("INSERT INTO insumos (nombreinsumo,stock,fechaentrada,indicador) VALUES (?,?,?,'S');");
           ps.setString(1, in.getNombreinsumos());
           ps.setInt(2, in.getStock());
           SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           ps.setString(3, df.format(in.getFechaingreso()));
           ps.executeUpdate();
           Mensajes.M1("Datos registrados correctamente"); 
        } catch (Exception ex) {
           Mensajes.M1("Error no se puso insertar el registro");
        }
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");        
//            ps.setString(3,df.format(rs.getFechaentrada()));
    }
    public Insumos ConsultarRegistroInsumos(int idin){
        Insumos in=null;
        try {
            rs=st.executeQuery("SELECT idinsumos,nombreinsumo,stock,fechaentrada,indicador FROM insumos WHERE indicador='S' AND idinsumos='"+idin+"'");
            if(rs.next()){
                in=new Insumos();
                in.setIdinsumos(rs.getInt(1));
                in.setNombreinsumos(rs.getString(2));
                in.setStock(rs.getInt(3));
                in.setFechaingreso(rs.getDate(4));
                in.setIndicador(rs.getString(5));
            }
            rs.close();
        } catch (Exception ex) {
            Mensajes.M1("Error al recuperar registro Insumos "+ex);
        }
        return in;
}
    public void ActualizarRegistroInsumos(Insumos in){
        try {
            ps=conexion.prepareStatement("UPDATE insumos SET nombreinsumo='ETIQUETA DE TALLA', stock=200 ,fechaentrada='2022-08-07' WHERE idinsumos=?;");
            ps.setString(1, in.getNombreinsumos());
            ps.setInt(2, in.getStock());
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(3, df.format(in.getFechaingreso()));
            ps.setInt(4, in.getIdinsumos());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se puede actualizar el registro"+ex);
        }
    }
    public void EliminarRegistroInsumos(int idin){
        try {
            ps=conexion.prepareStatement("UPDATE insumos SET indicador='N' WHERE idinsumos=?;");
            ps.setInt(1, idin);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado correctamente");
            ps.close();
        } catch (Exception ex) {
            Mensajes.M1("Error no se pudo eliminar el registro"+ex);
        }
    }
}
