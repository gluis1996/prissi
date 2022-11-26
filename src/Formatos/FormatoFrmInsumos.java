
package Formatos;

import Vista.FrmInsumos;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Priscila Lunarejo
 */
public class FormatoFrmInsumos {
        public static void Presentacion (FrmInsumos fi){
        fi.setTitle("Registro Insumos");
        fi.jtxtIdinsumos.setEnabled(false);
    }
    
    public static void Estado1(FrmInsumos fi){
        fi.jbtnRegistrar.setEnabled(true);
        fi.jbtnConsultar.setEnabled(true);
        fi.jbtnActualizar.setEnabled(false);
        fi.jbtnEliminar.setEnabled(false);
    }
    
    public static void estado2(FrmInsumos fi){
        fi.jbtnRegistrar.setEnabled(false);
        fi.jbtnConsultar.setEnabled(true);
        fi.jbtnActualizar.setEnabled(true);
        fi.jbtnEliminar.setEnabled(true);
    }
    public static void LimpiarEntradas(FrmInsumos fi){
        fi.jtxtIdinsumos.setText("");
        fi.jcbxNombres.setSelectedIndex(0);
        fi.jtxtStock.setText("");
        Calendar cal=new GregorianCalendar();
        fi.jdtchssFechainsgreso.setCalendar(cal);
    }
}
