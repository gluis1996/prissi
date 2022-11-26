
package Formatos;

import DAO.CargarComboEnvio;
import DAO.ClavesForaneasEnvio;
import Modelo.Envios;
import Vista.FrmEnvio;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Priscila Lunarejo
 */
public class FormatoFrmEnvio {
       static public void PresentacionFormEnvios(FrmEnvio fe){
    fe.setVisible(true);
    fe.setTitle("Registro de los envios");
    CargarComboEnvio cc  = new CargarComboEnvio();
    cc.CargarProveedorEnCombo(fe.jcbxListaProveedores);
    cc.CargarInsumosEnCombo(fe.jcbxListaInsumos);
    Calendar cal =  new GregorianCalendar();
    fe.jdatchosFecha.setCalendar(cal);
}
public static void LimpiarEntradas(FrmEnvio fe){
    fe.jcbxListaProveedores.setSelectedIndex(0);
    fe.jcbxListaInsumos.setSelectedIndex(0);
    Calendar cal =  new GregorianCalendar();
    fe.jdatchosFecha.setCalendar(cal);
    fe.jtxtCantidad.setText("");
    fe.jtxtPrecio.setText("");
}
public static Envios LeerEnvios(FrmEnvio fe){
    Envios e =  new Envios();
    ClavesForaneasEnvio clrs= new ClavesForaneasEnvio();
    e.setIdproveedor(clrs.RecuperarIdProveedor(fe.jcbxListaProveedores.getSelectedItem().toString()));
    e.setIdinsumos(clrs.RecuperarIdInsumos(fe.jcbxListaInsumos.getSelectedItem().toString()));
    e.setFecha(fe.jdatchosFecha.getDate());
    e.setCantidad(Integer.parseInt(fe.jtxtCantidad.getText()));
    e.setPrecio(Double.parseDouble(fe.jtxtPrecio.getText()));
 
    return e;
}  
}
