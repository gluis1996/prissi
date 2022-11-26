
package Controlador;



import DAO.CRUDenvios;
import Formatos.FormatoFrmEnvio;
import Modelo.Envios;
import Vista.FrmEnvio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorFrmEnvio implements ActionListener {
   FrmEnvio vista;
 
 public ControladorFrmEnvio (FrmEnvio fenv){
     vista=fenv;
     vista.jbtnRegistrar.addActionListener(this);
     FormatoFrmEnvio.PresentacionFormEnvios(fenv);
     
 }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==vista.jbtnRegistrar){
           Envios en = FormatoFrmEnvio.LeerEnvios(vista);
           CRUDenvios crud= new CRUDenvios();
           crud.InsertarEnvios(en);
           FormatoFrmEnvio.LimpiarEntradas(vista);
       }
    }  
}
