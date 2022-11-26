
package Controlador;

import DAO.CRUDproducto;
import Formatos.FormatoFrmProducto;
import Formatos.Mensajes;
import Modelo.Producto;
import Vista.FrmProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Priscila Lunarejo
 */
public class ControladorFrmProducto implements ActionListener{
    FrmProducto vista;
    CRUDproducto crudprod;
    Producto prod;
    
    public ControladorFrmProducto(FrmProducto fp){
        vista=fp;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnConsultar.addActionListener(this);
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnEliminar.addActionListener(this);
        crudprod=new CRUDproducto();
        crudprod.MostrarProductosEnTabla(vista.jtblRegistroProd, vista.jlblCantidadregistros);
        FormatoFrmProducto.Presentacion(fp);
        FormatoFrmProducto.Estado1(fp);
        fp.setVisible(true);
    }
    public void LeerDatos(){
        prod=new Producto();
        prod.setDescripcion(vista.jtxtdescripcion.getText());
        prod.setStock(Integer.parseInt(vista.jtxtStock.getText()));
        prod.setPrecio(Double.parseDouble(vista.jtxtPrecio.getText()));
        prod.setFechaing(vista.jdtchssFecha.getDate());
    }
    public void ActualizarFrm(){
        crudprod=new CRUDproducto();
        crudprod.MostrarProductosEnTabla(vista.jtblRegistroProd,vista.jlblCantidadregistros);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnRegistrar){
            LeerDatos();
            crudprod=new CRUDproducto();
            crudprod.InsertarRegistroProducto(prod);
            ActualizarFrm();
            FormatoFrmProducto.LimpiarEntras(vista);
        }
        if(e.getSource()==vista.jbtnConsultar){
            int idpd=Mensajes.M2("Ingrese el IDEMPLEADO que desea buscar");
            crudprod=new CRUDproducto();
            prod=crudprod.ConsultarRegistroProducto(idpd);
            if(prod==null){
                Mensajes.M1("El IDEMPLEADO "+idpd+" no existe en la tabla empleado");
            }
            else{
                vista.jtxtIdproducto.setText(Integer.toString(prod.getIdproduto()));
                vista.jtxtdescripcion.setText(prod.getDescripcion());
                vista.jtxtStock.setText(Integer.toString(prod.getStock()));
                vista.jtxtPrecio.setText(Double.toString(prod.getPrecio()));
  
                vista.jdtchssFecha.setDate(prod.getFechaing());//error
                 FormatoFrmProducto.Estado2(vista);

            }
        }
        if(e.getSource()==vista.jbtnActualizar){
            LeerDatos();
            prod.setIdproduto(Integer.parseInt(vista.jtxtIdproducto.getText()));
            crudprod=new CRUDproducto();
            crudprod.ActualizarRegistroProducto(prod);
            ActualizarFrm();
            FormatoFrmProducto.LimpiarEntras(vista);
        }
        if(e.getSource()==vista.jbtnEliminar){
            int respuesta=Mensajes.M3("Confirmar", "Desea eliminar el registro");
            if(respuesta==0){
                int idprod=Integer.parseInt(vista.jtxtIdproducto.getText());
                crudprod=new CRUDproducto();
                crudprod.EliminarRegistroProducto(idprod);
                ActualizarFrm();
                FormatoFrmProducto.LimpiarEntras(vista);
            }
        }
    }
    
}
