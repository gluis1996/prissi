
package Modelo;

/**
 *
 * @author Priscila Lunarejo
 */
public class Empleado {
  private int idempleado;
  private String dni;
  private String nombres;
  private String telefono;
  private String correo;
  private double sueldo;
  private String indicador;
  
  public Empleado(){};

    public int getIdempleado() {
        return idempleado;
    }
    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getIndicador() {
        return indicador;
    }
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
  
  public Object[] RegistroEmpleado (int num ){
      Object[] fila={num,idempleado,dni,nombres,telefono,correo,sueldo};
      return fila;
  }
  
}
