
package Modelo;

import java.util.Date;

/**
 *
 * @author Priscila Lunarejo
 */
public class Producto {
    private int idproducto;
    private String descripcion;
    private int stock;
    private double precio;
    private Date fechaing;
    private String indicador;
    
    public Producto(){};

    public int getIdproduto() {
        return idproducto;
    }
    public void setIdproduto(int idproduto) {
        this.idproducto = idproduto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Date getFechaing() {
        return fechaing;
    }
    public void setFechaing(Date fechaing) {
        this.fechaing = fechaing;
    }
    public String getIndicador() {
        return indicador;
    }
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
    public Object[] RegistroProducto(int num){
        Object[] fila={num,idproducto,descripcion,stock,precio,fechaing,indicador};
        return fila;
    }
    
}
