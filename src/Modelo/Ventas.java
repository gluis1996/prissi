
package Modelo;

import java.util.Date;

/**
 *
 * @author Priscila Lunarejo
 */
public class Ventas {
    
    public Ventas(){};
    
    private int idventa;
    private int idcliente;
    private int idproducto;
    private Date fecha;
    private int cantidad;
    private double precio;
    private String indicador;

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
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
    
//    public Object [] RegistroVentas(int num){
//        Object[] fila={num,idventa,idcliente,idproducto,fecha,cantidad,precio};
//        return fila;
//    }
}
