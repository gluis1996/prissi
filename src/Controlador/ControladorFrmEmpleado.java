
package Controlador;

import DAO.CRUDempleado;
import Formatos.FormatoFrmEmpleado;
import Formatos.Mensajes;
import Modelo.Empleado;
import Vista.FrmEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorFrmEmpleado implements ActionListener{
    FrmEmpleado vista;
    CRUDempleado crudem;
    Empleado em;
    
    public ControladorFrmEmpleado(FrmEmpleado fe){
        vista=fe;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        crudem=new CRUDempleado();
        crudem.MostrarEmpleadoEnTabla(vista.jtblRegistroEmpleados, vista.lblCantidadRegistros);
        FormatoFrmEmpleado.Presentacion(fe);
        FormatoFrmEmpleado.Estado1(fe);
        fe.setVisible(true);
    }
    public void LeerDatos(){
        em=new Empleado();
        em.setDni(vista.jtxtDni.getText());
        em.setNombres(vista.jtxtNombres.getText());
        em.setTelefono(vista.jtxtTelefono.getText());
        em.setCorreo(vista.jtxtCorreo.getText());
        em.setSueldo(Double.parseDouble(vista.jtxtSueldo.getText()));
    }
    public void ActualizarFrm(){
        crudem=new CRUDempleado();
        crudem.MostrarEmpleadoEnTabla(vista.jtblRegistroEmpleados, vista.lblCantidadRegistros);
    }
    
//
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnRegistrar){
            LeerDatos();
            crudem=new CRUDempleado();
            crudem.InsertarRegistroEmpleado(em);
            ActualizarFrm();
            FormatoFrmEmpleado.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnConsultar){
            int idem=Mensajes.M2("Ingrese el IDEMPLEADO que desea buscar");
            crudem=new CRUDempleado();
            em=crudem.ConsultarRegistroEmpleado(idem);
            if(em==null){
                Mensajes.M1("El IDEMPLEADo"+idem+"no existe en la tabla empleado");
            }
            else{
                vista.jtxtIdEmpleado.setText(Integer.toString(em.getIdempleado()));
                vista.jtxtDni.setText(em.getDni());
                vista.jtxtNombres.setText(em.getNombres());
                vista.jtxtTelefono.setText(em.getTelefono());
                vista.jtxtCorreo.setText(em.getCorreo());
                vista.jtxtSueldo.setText(Double.toString(em.getSueldo()));
                FormatoFrmEmpleado.Estado2(vista);
            }
        }
        if(e.getSource()==vista.jbtnActualizar){
            LeerDatos();
            em.setIdempleado(Integer.parseInt(vista.jtxtIdEmpleado.getText()));
            crudem=new CRUDempleado();
            crudem.ActualizarRegistroEmpleado(em);
            ActualizarFrm();
            FormatoFrmEmpleado.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnEliminar){
            int respuesta=Mensajes.M3("Confirmar", "Desea eliminar el registro");
            if(respuesta==0){
                int idem=Integer.parseInt(vista.jtxtIdEmpleado.getText());
                crudem=new CRUDempleado();
                crudem.EliminarRegistroEmpleado(idem);
                ActualizarFrm();
                FormatoFrmEmpleado.LimpiarEntradas(vista);
            }
        }
    }
    
}
