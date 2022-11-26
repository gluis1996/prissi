/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import DAO.CRUDproveedores;
import Formatos.FormatoFrmProveedores;
import Formatos.Mensajes;
import Modelo.Proveedores;
import Vista.FrmProveedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorFrmProveedores implements ActionListener{
    FrmProveedores vista;
    CRUDproveedores crudp;
    Proveedores p;
    
    public ControladorFrmProveedores(FrmProveedores fp){
        vista = fp;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        crudp = new CRUDproveedores();
        crudp.MostrarProveedoresEnTabla(vista.jtblRegistroProveedor, vista.lblCantidadRegistros);
        FormatoFrmProveedores.Presentacion(fp);
        FormatoFrmProveedores.Estado1(fp);
        fp.setVisible(true);
    }
    public void LeerDatos(){
        p=new Proveedores();
        p.setDni(vista.jtxtDni.getText());
        p.setNombres(vista.jtxtNombres.getText());
        p.setTelefono(vista.jtxtTelefono.getText());
        p.setCorreo(vista.jtxtCorreo.getText());
    }
    public void ActualizarFrm(){
        crudp=new CRUDproveedores();
        crudp.MostrarProveedoresEnTabla(vista.jtblRegistroProveedor, vista.lblCantidadRegistros);
    }
    //ActionEvent e
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnRegistrar){
            LeerDatos();
            crudp=new CRUDproveedores();
            crudp.InsertarRegistroProveedor(p);
            ActualizarFrm();
            FormatoFrmProveedores.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnConsultar){
            int idp=Mensajes.M2("Ingrese el IDPROVEEDOR que desea buscar");
            crudp=new CRUDproveedores();
            p=crudp.ConsultarRegistroProveedor(idp);
            if(p==null){
                Mensajes.M1("El id del proveedor"+idp+"no existe en la tabla proveedor");
            }
            else {
                vista.jtxtIdproveedor.setText(Integer.toString(p.getIdproveedor()));
                vista.jtxtDni.setText(p.getDni());
                vista.jtxtNombres.setText(p.getNombres());
                vista.jtxtTelefono.setText(p.getTelefono());
                vista.jtxtCorreo.setText(p.getCorreo());
                FormatoFrmProveedores.estado2(vista);
            }
        }
        if(e.getSource()==vista.jbtnActualizar){
            LeerDatos();
            p.setIdproveedor(Integer.parseInt(vista.jtxtIdproveedor.getText()));
            crudp=new CRUDproveedores();
            crudp.ActualizarRegistroProveedor(p);
            ActualizarFrm();
            FormatoFrmProveedores.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnEliminar){
            int respuesta=Mensajes.M3("Confirmar","Desea eliminar registro");
            if(respuesta==0){
                int idp=Integer.parseInt(vista.jtxtIdproveedor.getText());
                crudp=new CRUDproveedores();
                crudp.EliminarRegistroProveedor(idp);
                ActualizarFrm();
                FormatoFrmProveedores.LimpiarEntradas(vista);
            }
        }
    }
}
