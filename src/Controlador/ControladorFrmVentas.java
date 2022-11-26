
package Controlador;

import DAO.CRUDventas;
import Formatos.FormatoFrmVentas;
import Modelo.Ventas;
import Vista.FrmVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorFrmVentas implements ActionListener{
   FrmVentas vista;
 
 public ControladorFrmVentas (FrmVentas fv){
     vista=fv;
     vista.jbtnRegistrar.addActionListener(this);
     FormatoFrmVentas.PresentacionFormVentas(fv);
     
 }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==vista.jbtnRegistrar){
           Ventas v = FormatoFrmVentas.LeerVentas(vista);
           CRUDventas crud= new CRUDventas();
           crud.InsertarVentas(v);
           FormatoFrmVentas.LimpiarEntradas(vista);
       }
    }  
}
