
package DAO;

import Formatos.Mensajes;
import javax.swing.JComboBox;

/**
 *
 * @author Priscila Lunarejo
 */
public class CargarComboVentas extends ConectarBD{
     
   public CargarComboVentas (){}
   
   //metodo para cargar el nombre de los clientes
   public void CargarClienteEnCombo (JComboBox combo){
       try {
        rs = st.executeQuery("SELECT nombreape FROM cliente WHERE indicador='S' ORDER BY 1;");
         while(rs.next()){
             combo.addItem(rs.getString(1));
         }
       } catch (Exception e) {
           Mensajes.M1("ERROR no se puede cargar el combo Lista Clientes.."+e);
       }
   }
   public void CargarPorductoEnCombo(JComboBox combo){
       try {
           rs=st.executeQuery("SELECT descripcion FROM producto WHERE indicador='S' ORDER BY 1;");
           while(rs.next()){
               combo.addItem(rs.getString(1));
           }
       } catch (Exception e) {
           Mensajes.M1("ERROR no se puede cargar el combo Producto.."+e);
       }
   }
}
