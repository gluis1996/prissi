
package Formatos;
import Vista.FrmEmpleado;
/**
 *
 * @author Priscila Lunarejo
 */
public class FormatoFrmEmpleado {
    
    public static void Presentacion(FrmEmpleado fe){
        fe.setTitle("Registro Empleado");
        fe.jtxtIdEmpleado.setEnabled(false);
    }
    public static void Estado1(FrmEmpleado fe){
        fe.jbtnRegistrar.setEnabled(true);
        fe.jbtnConsultar.setEnabled(true);
        fe.jbtnActualizar.setEnabled(false);
        fe.jbtnEliminar.setEnabled(false);
    }
    public static void Estado2(FrmEmpleado fe){
        fe.jbtnRegistrar.setEnabled(false);
        fe.jbtnConsultar.setEnabled(true);
        fe.jbtnActualizar.setEnabled(true);
        fe.jbtnEliminar.setEnabled(true);
    }
    public static void LimpiarEntradas(FrmEmpleado fe){
        fe.jtxtIdEmpleado.setText("");
        fe.jtxtDni.setText("");
        fe.jtxtNombres.setText("");
        fe.jtxtTelefono.setText("");
        fe.jtxtCorreo.setText("");
        fe.jtxtSueldo.setText("");
        fe.jtxtDni.requestFocus();
    }
}
