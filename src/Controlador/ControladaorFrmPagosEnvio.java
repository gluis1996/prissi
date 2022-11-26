
package Controlador;

import DAO.CargarPagoEnvio;
import Formatos.FormatoFrmPagoEnvio;
import Vista.FrmPagoEnvio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Priscila Lunarejo
 */
public class ControladaorFrmPagosEnvio implements ActionListener{
      FrmPagoEnvio vista;
    
    String[] titulos = {"Datos pedidos","Datos Ingresados"};
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    
    public ControladaorFrmPagosEnvio (FrmPagoEnvio f2){
        vista = f2;
        vista.jtbnBuscar.addActionListener(this);
        vista.jbtnEliminarRegistro.addActionListener(this);
        vista.jtblRegistroPagos.setModel(modelo);
        f2.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.jtbnBuscar){
            CargarPagoEnvio pago = new CargarPagoEnvio();
            pago.mostrarPago(vista.jtxtDni.getText(), modelo,vista.lblCostoTotalenvio);
        }
        if(e.getSource()== vista.jbtnEliminarRegistro){
            CargarPagoEnvio pago = new CargarPagoEnvio();
            pago.EliminarRegistro(vista.jtxtDni.getText(), modelo, vista.lblCostoTotalenvio);
            FormatoFrmPagoEnvio.LimpiarEntradas(vista);
        }
    
    }   
}
        