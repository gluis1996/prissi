
package DAO;

import Formatos.Mensajes;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Lunarejo
 */
public class CargarPagosVenta extends ConectarBD{
     public CargarPagosVenta(){}
    
    public void mostrarPago(String dni, DefaultTableModel modelo, JLabel label){
        
        try {
            double precioTotal;
            ps = conexion.prepareStatement("SELECT nombreape,telefono,correo,descripcion,cantidad,preciounitario FROM cliente \n" +
                                            "INNER JOIN ventas ON cliente.idcliente = ventas.idventa\n" +
                                            "INNER JOIN producto ON cliente.idcliente =producto.idproducto\n" +
                                            "WHERE cliente.dni=?;");

            ps.setString(1,dni);
            rs = ps.executeQuery();
            
            String [] dat = {"Nombres y Apellidos","Teléfono","Correo","Descripción del producto","Cantidad","Precio unitario"};
      
            modelo.setRowCount(0);
            
            if(rs.next()){
                for(int i = 0; i < dat.length; i ++){
                    Object[] obj = new Object[2];
                    obj[0]=dat[i];
                    obj[1]= rs.getString(i+1);
                    modelo.addRow(obj);
                }
          
                precioTotal = Double.parseDouble(rs.getString(5))* Double.parseDouble(rs.getString(6));
                
                label.setText(""+precioTotal);
            }else{
                JOptionPane.showMessageDialog(null,"No hay registro con el dni ingresado");
            }
       } catch (Exception e) {
           Mensajes.M1("ERROR no se puede cargar el lista Clientes.."+e);
       }
    }
    
    public void EliminarRegistro(String dni, DefaultTableModel modelo, JLabel label){
        try{
            
            ps=conexion .prepareStatement("DELETE cliente,ventas,producto\n" +
                                        "FROM cliente\n" +
                                        "JOIN ventas ON cliente.idcliente = ventas.idventa\n" +
                                        "INNER JOIN producto ON cliente.idcliente =producto.idproducto\n" +
                                        "WHERE cliente.dni= ?;");
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
