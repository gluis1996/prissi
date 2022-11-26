
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Formatos.*;
import Principal.*;
import javax.swing.JFrame;

public class ControladorMenu implements ActionListener{
    FrmMenu vista;
    
    public ControladorMenu (FrmMenu fm){
        vista=fm;
        vista.mitemRegistrarCliente.addActionListener(this);
        vista.mitemRegistrarEmpleado.addActionListener(this);
        vista.mitemRegistrarProductos.addActionListener(this);
        vista.mitemRegistrarProveedores.addActionListener(this);
        vista.mitemRegistrarInsumos.addActionListener(this);
        vista.mitemRegistroVentas.addActionListener(this);
        vista.mitemRegistroEnvio.addActionListener(this);
        vista.mitemPagosVenta.addActionListener(this);
        vista.miitemPagoEnvio.addActionListener(this);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Sistema para la gestión de insumos");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.mitemRegistrarCliente){
            Main.fc =new FrmCliente();
            Main.controlfc =new ControladorFrmCliente(Main.fc);
            vista.jdscpContenedor.add(Main.fc);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fc);
            
        }
        if(e.getSource()==vista.mitemRegistrarEmpleado){
            Main.fe=new FrmEmpleado();
            Main.controlfe=new ControladorFrmEmpleado(Main.fe);
            vista.jdscpContenedor.add(Main.fe);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fe);
        }
        if(e.getSource()==vista.mitemRegistrarProductos){
            Main.fp=new FrmProducto();
            Main.controlpd=new ControladorFrmProducto(Main.fp);
            vista.jdscpContenedor.add(Main.fp);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fp);
        }
        if(e.getSource()==vista.mitemRegistrarProveedores){
            Main.fpv=new FrmProveedores();
            Main.controlpv=new ControladorFrmProveedores(Main.fpv);
            vista.jdscpContenedor.add(Main.fpv);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fpv);
        }
        if(e.getSource()==vista.mitemRegistrarInsumos){
            Main.fi=new FrmInsumos();
            Main.controlin=new ControladorFrmInsumos(Main.fi);
            vista.jdscpContenedor.add(Main.fi);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fi);
        }  
        if(e.getSource()==vista.mitemRegistroVentas){
            Main.fv=new FrmVentas();
            Main.controlve=new ControladorFrmVentas(Main.fv);
            vista.jdscpContenedor.add(Main.fv);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fv);
        }  
        if(e.getSource()==vista.mitemRegistroEnvio){
            Main.fen=new FrmEnvio();
            Main.controlen=new ControladorFrmEnvio(Main.fen);
            vista.jdscpContenedor.add(Main.fen);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fen);
        }
        if(e.getSource()==vista.mitemPagosVenta){
            Main.fpve=new FrmPagoVenta();
            Main.controlpgv=new ControladorPagosVenta(Main.fpve);
            vista.jdscpContenedor.add(Main.fpve);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fpve);
        } 
        if(e.getSource()==vista.miitemPagoEnvio){
            Main.fpe=new FrmPagoEnvio();
            Main.controlpe=new ControladaorFrmPagosEnvio(Main.fpe);
            vista.jdscpContenedor.add(Main.fpe);
            CentrarForma.CPanel(vista.jdscpContenedor, Main.fpe);
        } 
    }
    
}
