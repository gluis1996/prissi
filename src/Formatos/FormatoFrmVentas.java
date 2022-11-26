
package Formatos;
import Modelo.*;
import Vista.*;
import DAO.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Priscila Lunarejo
 */
public class FormatoFrmVentas {
    static public void PresentacionFormVentas(FrmVentas fv){
    fv.setVisible(true);
    fv.setTitle("Registro de las ventas");
    CargarComboVentas cc  = new CargarComboVentas();
    cc.CargarClienteEnCombo(fv.jcbxlistaClientes);
    cc.CargarPorductoEnCombo(fv.jcbxlistaProducto);
    Calendar cal =  new GregorianCalendar();
    fv.jdtchssFecha.setCalendar(cal);
}
public static void LimpiarEntradas(FrmVentas fv){
    fv.jcbxlistaClientes.setSelectedIndex(0);
    fv.jcbxlistaProducto.setSelectedIndex(0);
    Calendar cal =  new GregorianCalendar();
    fv.jdtchssFecha.setCalendar(cal);
    fv.jtxtCantidad.setText("");
    fv.jtxtPrecio.setText("");
}
public static Ventas LeerVentas(FrmVentas fv){
    Ventas v =  new Ventas();
    ClavesForaneasVentas clrs= new ClavesForaneasVentas();
    v.setIdcliente(clrs.RecuperarIdCliente(fv.jcbxlistaClientes.getSelectedItem().toString()));
    v.setIdproducto(clrs.RecuperarIdProducto(fv.jcbxlistaProducto.getSelectedItem().toString()));
    v.setFecha(fv.jdtchssFecha.getDate());
    v.setCantidad(Integer.parseInt(fv.jtxtCantidad.getText()));
    v.setPrecio(Double.parseDouble(fv.jtxtPrecio.getText()));
 
    return v;
} 
}
