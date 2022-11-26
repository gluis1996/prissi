
package Formatos;

import Vista.FrmProveedores;

/**
 *
 * @author Priscila Lunarejo
 */
public class FormatoFrmProveedores {
    public static void Presentacion (FrmProveedores fp){
        fp.setTitle("Registro Cliente");
        fp.jtxtIdproveedor.setEnabled(false);
    }
    
    public static void Estado1(FrmProveedores fp){
        fp.jbtnRegistrar.setEnabled(true);
        fp.jbtnConsultar.setEnabled(true);
        fp.jbtnActualizar.setEnabled(false);
        fp.jbtnEliminar.setEnabled(false);
    }
    
    public static void estado2(FrmProveedores fp){
        fp.jbtnRegistrar.setEnabled(false);
        fp.jbtnConsultar.setEnabled(true);
        fp.jbtnActualizar.setEnabled(true);
        fp.jbtnEliminar.setEnabled(true);
    }
    public static void LimpiarEntradas(FrmProveedores fp){
        fp.jtxtIdproveedor.setText("");
        fp.jtxtDni.setText("");
        fp.jtxtNombres.setText("");
        fp.jtxtTelefono.setText("");
        fp.jtxtCorreo.setText("");
        fp.jtxtDni.requestFocus();
    } 
}
