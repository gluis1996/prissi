
package Formatos;

import Vista.FrmProducto;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Priscila Lunarejo
 */
public class FormatoFrmProducto {
    
    public static void Presentacion(FrmProducto fp){
        fp.setTitle("Registro Productos");
        fp.jtxtIdproducto.setEnabled(false);
    }
    public static void Estado1(FrmProducto fp){
        fp.jbtnRegistrar.setEnabled(true);
        fp.jbtnConsultar.setEnabled(true);
        fp.jbtnActualizar.setEnabled(false);
        fp.jbtnEliminar.setEnabled(false);
    }
    public static void Estado2(FrmProducto fp){
        fp.jbtnRegistrar.setEnabled(false);
        fp.jbtnConsultar.setEnabled(true);
        fp.jbtnActualizar.setEnabled(true);
        fp.jbtnEliminar.setEnabled(true);
    }
    public static void LimpiarEntras(FrmProducto fp){
        fp.jtxtIdproducto.setText("");
        fp.jtxtdescripcion.setText("");
        fp.jtxtStock.setText("");
        fp.jtxtPrecio.setText("");
        Calendar cal=new GregorianCalendar();
        fp.jdtchssFecha.setCalendar(cal);
    }
}
