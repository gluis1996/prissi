
package Modelo;

import java.util.Date;

/**
 *
 * @author Priscila Lunarejo
 */
public class Insumos {
    private int idinsumos;
    private String nombreinsumos;
    private int stock;
    private Date fechaingreso;
    private String indicador;
    
    public Insumos(){};
    
    public int getIdinsumos() {
        return idinsumos;
    }

    public void setIdinsumos(int idinsumos) {
        this.idinsumos = idinsumos;
    }

    public String getNombreinsumos() {
        return nombreinsumos;
    }

    public void setNombreinsumos(String nombreinsumos) {
        this.nombreinsumos = nombreinsumos;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
   public Object[] RegistroInsumos(int num){
        Object[]fila={num,idinsumos,nombreinsumos,stock,fechaingreso};
        return fila;
    }
    
}
