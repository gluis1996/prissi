
package Principal;
import Vista.*;
import Controlador.*;

public class Main {
    public static FrmMenu fm;
    public static ControladorMenu controlfm;

    public static FrmCliente fc;
    public static ControladorFrmCliente controlfc;
    
    public static FrmEmpleado fe;
    public static ControladorFrmEmpleado controlfe;
    
    public static FrmProducto fp;
    public static ControladorFrmProducto controlpd;
    
    public static FrmProveedores fpv;
    public static ControladorFrmProveedores controlpv;
    
    public static FrmInsumos fi;
    public static ControladorFrmInsumos controlin;
    
    public static FrmVentas fv;
    public static ControladorFrmVentas controlve;
    
    public static FrmEnvio fen;
    public static ControladorFrmEnvio controlen;
    
    public static FrmPagoVenta fpve;
    public static ControladorPagosVenta controlpgv;
    
    public static FrmPagoEnvio fpe;
    public static ControladaorFrmPagosEnvio controlpe;
    
    public static void main(String[] args) {
       
        fm =new FrmMenu();
        controlfm =new ControladorMenu(fm);
    }
    
}
