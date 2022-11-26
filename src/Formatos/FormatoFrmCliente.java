
package Formatos;
import Vista.FrmCliente;
/**
 *
 * @author Priscila Lunarejo
 */
public class FormatoFrmCliente {
    public static void Presentacion (FrmCliente fc){
        fc.setTitle("Registro Cliente");
        fc.jtxtIdcliente.setEnabled(false);
    }
    
    public static void Estado1(FrmCliente fc){
        fc.jbtnRegistrar.setEnabled(true);
        fc.jbtnConsultar.setEnabled(true);
        fc.jbtnActualizar.setEnabled(false);
        fc.jbtnEliminar.setEnabled(false);
    }
    
    public static void estado2(FrmCliente fc){
        fc.jbtnRegistrar.setEnabled(false);
        fc.jbtnConsultar.setEnabled(true);
        fc.jbtnActualizar.setEnabled(true);
        fc.jbtnEliminar.setEnabled(true);
    }
    public static void LimpiarEntradas(FrmCliente fc){
        fc.jtxtIdcliente.setText("");
        fc.jtxtDni.setText("");
        fc.jtxtNombres.setText("");
        fc.jtxtTelefono.setText("");
        fc.jtxtCorreo.setText("");
        fc.jtxtDni.requestFocus();
    }
}
