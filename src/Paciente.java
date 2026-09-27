
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCF20408
 */
public class Paciente {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private Date fechaNacimiento;
    private String alergias;
    private String correo;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    
    public void validadIdentidad(String tipoDocumento, String numeroDocumento){
        if(tipoDocumento.equalsIgnoreCase("DNI")&&numeroDocumento.length()==8){
            this.tipoDocumento = tipoDocumento.toUpperCase();
            this.numeroDocumento = numeroDocumento;
        }else if (tipoDocumento.equalsIgnoreCase("CE")&&numeroDocumento.length()==9){
            this.tipoDocumento = tipoDocumento.toUpperCase();
            this.numeroDocumento = numeroDocumento;
        }else {
            System.out.println("Datos incompletos u incorretos");
        } 
    }
    
    public void validarTelefono(String telefono){
        //if(telefono.length()==9 && Integer.parseInt(telefono)){
            
        //}
    }
    
}
