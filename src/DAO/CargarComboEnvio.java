
package DAO;

import Formatos.Mensajes;
import javax.swing.JComboBox;

/**
 *
 * @author Priscila Lunarejo
 */
public class CargarComboEnvio extends ConectarBD{
    public CargarComboEnvio (){}
   
   //metodo para cargar el nombre de los clientes
   public void CargarProveedorEnCombo (JComboBox combo){
       try {
        rs = st.executeQuery("SELECT nombreape FROM proveedores WHERE indicador='S' ORDER BY 1;");
         while(rs.next()){
             combo.addItem(rs.getString(1));
         }
       } catch (Exception e) {
           Mensajes.M1("ERROR no se puede cargar el combo Lista Proveedores..."+e);
       }
   }
   public void CargarInsumosEnCombo(JComboBox combo){
       try {
           rs=st.executeQuery("SELECT nombreinsumo FROM insumos WHERE indicador='S' ORDER BY 1;");
           while(rs.next()){
               combo.addItem(rs.getString(1));
           }
       } catch (Exception e) {
           Mensajes.M1("ERROR no se puede cargar el combo Insumos.."+e);
       }
   } 
}
