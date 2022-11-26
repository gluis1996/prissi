
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formatos.*;
import DAO.*;
import Modelo.Cliente;
import Vista.FrmCliente;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorFrmCliente implements ActionListener{
    FrmCliente vista;
    CRUDcliente crudcli;
    Cliente cli;
    
    public ControladorFrmCliente (FrmCliente fc){
        vista = fc;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        crudcli = new CRUDcliente();
        crudcli.MostrarClienteEnTabla(vista.jtblRegistroClientes, vista.jlblCantidadRegistros);
        FormatoFrmCliente.Presentacion(fc);
        FormatoFrmCliente.Estado1(fc);
        fc.setVisible(true);
    }
    public void LeerDatos(){
        cli=new Cliente();
        cli.setDni(vista.jtxtDni.getText());
        cli.setNombres(vista.jtxtNombres.getText());
        cli.setTelefono(vista.jtxtTelefono.getText());
        cli.setCorreo(vista.jtxtCorreo.getText());
    }
    public void ActualizarFrm(){
        crudcli=new CRUDcliente();
        crudcli.MostrarClienteEnTabla(vista.jtblRegistroClientes, vista.jlblCantidadRegistros);
    }
    //ActionEvent e
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnRegistrar){
            LeerDatos();
            crudcli=new CRUDcliente();
            crudcli.InsertarRegistroCliente(cli);
            ActualizarFrm();
            FormatoFrmCliente.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnConsultar){
            int idcli=Mensajes.M2("Ingrese el IDCLIENTE que desea buscar");
            crudcli=new CRUDcliente();
            cli=crudcli.ConsultarRegistroCliente(idcli);
            if(cli==null){
                Mensajes.M1("El id del cliente"+idcli+"no existe en la tabla cliente");
            }
            else {
                vista.jtxtIdcliente.setText(Integer.toString(cli.getIdcliente()));
                vista.jtxtDni.setText(cli.getDni());
                vista.jtxtNombres.setText(cli.getNombres());
                vista.jtxtTelefono.setText(cli.getTelefono());
                vista.jtxtCorreo.setText(cli.getCorreo());
                FormatoFrmCliente.estado2(vista);
            }
        }
        if(e.getSource()==vista.jbtnActualizar){
            LeerDatos();
            cli.setIdcliente(Integer.parseInt(vista.jtxtIdcliente.getText()));
            crudcli=new CRUDcliente();
            crudcli.ActualizarRegistroCliente(cli);
            ActualizarFrm();
            FormatoFrmCliente.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnEliminar){
            int respuesta=Mensajes.M3("Confirmar","Desea eliminar registro");
            if(respuesta==0){
                int idcli=Integer.parseInt(vista.jtxtIdcliente.getText());
                crudcli=new CRUDcliente();
                crudcli.EliminarRegistroCliente(idcli);
                ActualizarFrm();
                FormatoFrmCliente.LimpiarEntradas(vista);
            }
        }
    }
}
