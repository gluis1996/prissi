
package Controlador;

import DAO.CRUDcliente;
import DAO.CRUDinsumos;
import Formatos.FormatoFrmInsumos;
import Formatos.Mensajes;
import Modelo.Insumos;
import Vista.FrmInsumos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorFrmInsumos implements ActionListener{
    FrmInsumos vista;
    CRUDinsumos crudin;
    Insumos in;
    
    public ControladorFrmInsumos (FrmInsumos fi){
        vista = fi;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        crudin = new CRUDinsumos();
        crudin.MostrarInsumosEnTabla(vista.jtblRegistroInsumos, vista.jlblCantidadRegistros);
        FormatoFrmInsumos.Presentacion(fi);
        FormatoFrmInsumos.Estado1(fi);
        fi.setVisible(true);
    }
    public void LeerDatos(){
        in=new Insumos();
        in.setNombreinsumos(vista.jcbxNombres.getSelectedItem().toString());
        in.setStock(Integer.parseInt(vista.jtxtStock.getText()));
        in.setFechaingreso(vista.jdtchssFechainsgreso.getDate());
    }
    public void ActualizarFrm(){
        crudin=new CRUDinsumos();
        crudin.MostrarInsumosEnTabla(vista.jtblRegistroInsumos, vista.jlblCantidadRegistros);
    }
    //ActionEvent e
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnRegistrar){
            LeerDatos();
            crudin=new CRUDinsumos();
            crudin.InsertarRegistroInsumos(in);
            ActualizarFrm();
            FormatoFrmInsumos.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnConsultar){
            int idin=Mensajes.M2("Ingrese el IDINSUMO que desea buscar");
            crudin=new CRUDinsumos();
            in=crudin.ConsultarRegistroInsumos(idin);
            if(in==null){
                Mensajes.M1("El id del cliente"+idin+"no existe en la tabla insumos");
            }
            else {
                vista.jtxtIdinsumos.setText(Integer.toString(in.getIdinsumos()));
                vista.jcbxNombres.setSelectedItem(in.getNombreinsumos());
                vista.jdtchssFechainsgreso.setDate(in.getFechaingreso());
                FormatoFrmInsumos.estado2(vista);
            }
        }
        if(e.getSource()==vista.jbtnActualizar){
            LeerDatos();
            in.setIdinsumos(Integer.parseInt(vista.jtxtIdinsumos.getText()));
            crudin=new CRUDinsumos();
            crudin.ActualizarRegistroInsumos(in);
            ActualizarFrm();
            FormatoFrmInsumos.LimpiarEntradas(vista);
        }
        if(e.getSource()==vista.jbtnEliminar){
            int respuesta=Mensajes.M3("Confirmar","Desea eliminar registro");
            if(respuesta==0){
                int idin=Integer.parseInt(vista.jtxtIdinsumos.getText());
                crudin=new CRUDinsumos();
                crudin.EliminarRegistroInsumos(idin);
                ActualizarFrm();
                FormatoFrmInsumos.LimpiarEntradas(vista);
            }
        }
    }
    
}
