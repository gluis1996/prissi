
package Controlador;

import DAO.CargarPagosVenta;
import Formatos.FormatoFrmPagoVenta;
import Vista.FrmPagoVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorPagosVenta implements ActionListener{
      FrmPagoVenta vista;
    
    String[] titulos = {"Datos pedidos","Datos Ingresados"};
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    
    public ControladorPagosVenta(FrmPagoVenta f1){
        vista = f1;
        vista.jtbnBuscar.addActionListener(this);
        vista.jbtnEliminarRegistro.addActionListener(this);
        vista.jtblRegistroPagos.setModel(modelo);
        f1.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.jtbnBuscar){
            CargarPagosVenta pago = new CargarPagosVenta();
            pago.mostrarPago(vista.jtxtDni.getText(), modelo,vista.jlblCostoTotal);
        }
        if(e.getSource()== vista.jbtnEliminarRegistro){
            CargarPagosVenta pago = new CargarPagosVenta();
            pago.EliminarRegistro(vista.jtxtDni.getText(), modelo, vista.jlblCostoTotal);
            FormatoFrmPagoVenta.LimpiarEntradas(vista);
        }
    
    }
}
 
