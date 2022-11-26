
package DAO;

import Formatos.Mensajes;

/**
 *
 * @author Priscila Lunarejo
 */
public class ClavesForaneasEnvio extends ConectarBD{
  public int RecuperarIdProveedor(String nomprov){
    int idprov=0;
      try {
            ps = conexion.prepareStatement("SELECT idproveedor FROM proveedores WHERE nombreape=?;"); 
            ps.setString(1,nomprov);
            rs= ps.executeQuery();
            if(rs.next()) idprov = rs.getInt(1);
            rs.close();
      } catch (Exception e) {
        Mensajes. M1("ERROR no se puede recuperar el Id proveedor.."+e);
      }
      return idprov;
  }
  public int RecuperarIdInsumos(String inom){
   int idhab=0;
      try {
            ps = conexion.prepareStatement("SELECT idinsumos FROM insumos WHERE nombreinsumo=?;");
            ps.setString(1,inom);
            rs= ps.executeQuery();
            if(rs.next()) idhab = rs.getInt(1);
            rs.close();
      } catch (Exception e) {
        Mensajes. M1("ERROR no se puede recuperar el Id Insumos.."+e);
      }
   return idhab;
  }  
}
