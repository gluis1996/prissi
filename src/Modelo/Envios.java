
package Modelo;

import java.util.Date;

/**
 *
 * @author Priscila Lunarejo
 */
public class Envios {
    
   public Envios(){}
       
    private int idenvio;
    private int idproveedor;
    private int idinsumos;
    private Date fecha;
    private int cantidad;
    private double precio;
    private String indicador;

    public int getIdenvio() {
        return idenvio;
    }
    public void setIdenvio(int idenvio) {
        this.idenvio = idenvio;
    }
    public int getIdproveedor() {
        return idproveedor;
    }
    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }
    public int getIdinsumos() {
        return idinsumos;
    }
    public void setIdinsumos(int idinsumos) {
        this.idinsumos = idinsumos;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getIndicador() {
        return indicador;
    }
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    } 
}
