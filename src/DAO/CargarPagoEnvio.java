
package DAO;

import Formatos.Mensajes;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Lunarejo
 */
public class CargarPagoEnvio extends ConectarBD{
   public CargarPagoEnvio(){}
    
    public void mostrarPago(String dni, DefaultTableModel modelo, JLabel label){
        
        try {
            double precioTotal;
            ps = conexion.prepareStatement("SELECT nombreape,telefono,correo,nombreinsumo,cantidad,preciounitario FROM proveedores\n" +
                                            "INNER JOIN registro_envio ON proveedores.idproveedor = registro_envio.idenvio\n" +
                                            "INNER JOIN insumos ON proveedores.idproveedor = insumos.idinsumos\n" +
                                            "WHERE proveedores.dni= ?;");

            ps.setString(1,dni);
            rs = ps.executeQuery();
            
            String [] dat = {"Nombres y Apellidos","Teléfono","Correo","Descripción del insumo","Cantidad","Precio unitario"};
      
            modelo.setRowCount(0);
            
            if(rs.next()){
                for(int i = 0; i < dat.length; i ++){
                    Object[] obj = new Object[2];
                    obj[0]=dat[i];
                    obj[1]= rs.getString(i+1);
                    modelo.addRow(obj);
                }
          
                precioTotal = Double.parseDouble(rs.getString(5))* Double.parseDouble(rs.getString(6));
                
                label.setText("El precio total de envio es: "+precioTotal);
            }else{
                JOptionPane.showMessageDialog(null,"No hay registro con el dni ingresado");
            }
       } catch (Exception e) {
           Mensajes.M1("ERROR no se puede cargar el lista Proveedores.."+e);
       }
    }
    
    public void EliminarRegistro(String dni, DefaultTableModel modelo, JLabel label){
        try{
            
            ps=conexion .prepareStatement("DELETE proveedores,registro_envio,insumos\n" +
                                        "FROM proveedores\n" +
                                        "INNER JOIN registro_envio ON proveedores.idproveedor = registro_envio.idenvio\n" +
                                        "INNER JOIN insumos ON proveedores.idproveedor = insumos.idinsumos\n" +
                                        "WHERE proveedores.dni= ?;");
            ps.setString(1, dni);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado");
            ps.close();
            
            modelo.setRowCount(0);
            label.setText("");
            
        }catch(Exception e){
            Mensajes.M1("Error no se pueden eliminar los registros"+e);
        }
    }  
}
