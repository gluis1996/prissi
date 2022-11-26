
package Modelo;

/**
 *
 * @author Priscila Lunarejo
 */
public class Cliente {
    private int idcliente;
    private String dni;
    private String nombres;
    private String telefono;
    private String correo;
    private String indicador;
    
public Cliente(){}

    public int getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
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
    public String getIndicador() {
        return indicador;
    }
    
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
    public Object [] RegistroCliente(int num){
        Object [] fila={num,idcliente,dni,nombres,telefono,correo};
        return fila;
    }
}
