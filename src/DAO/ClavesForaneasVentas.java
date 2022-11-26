
package DAO;

import Formatos.Mensajes;

/**
 *
 * @author Priscila Lunarejo
 */
public class ClavesForaneasVentas extends ConectarBD{
    public int RecuperarIdCliente(String nomcli){
    int idcli=0;
      try {
            ps = conexion.prepareStatement("SELECT idcliente FROM cliente WHERE nombreape=?;"); 
            ps.setString(1,nomcli);
            rs= ps.executeQuery();
            if(rs.next()) idcli = rs.getInt(1);
            rs.close();
      } catch (Exception e) {
        Mensajes. M1("ERROR no se puede recuperar el Id cliente.."+e);
      }
      return idcli;
  }
  public int RecuperarIdProducto(String pdes){
   int idhab=0;
      try {
            ps = conexion.prepareStatement("SELECT idproducto FROM producto WHERE descripcion=?");
            ps.setString(1,pdes);
            rs= ps.executeQuery();
            if(rs.next()) idhab = rs.getInt(1);
            rs.close();
      } catch (Exception e) {
        Mensajes. M1("ERROR no se puede recuperar el Id producto.."+e);
      }
   return idhab;
  }
}
