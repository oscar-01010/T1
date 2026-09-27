package t1;


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
    static  int idGenerador = 0;
    private int id;
    private String nombre; 
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private Date fechaNacimiento;
    private String alergias;
    private String correo;
    private String telefono;
    private String tipoSangre;

    public Paciente() {
        this.id = ++idGenerador;
    }

    
    
    
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

    public String getTipoSangre() {
        return tipoSangre;
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

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    
    
    public void validadIdentidad(String tipoDocumento, String numeroDocumento){
        try{
            Integer.parseInt(numeroDocumento);
            if(tipoDocumento.equalsIgnoreCase("DNI")&&numeroDocumento.length()==8){
                this.tipoDocumento = tipoDocumento.toUpperCase();
                this.numeroDocumento = numeroDocumento;
            }else if (tipoDocumento.equalsIgnoreCase("CE")&&numeroDocumento.length()==9){
                this.tipoDocumento = tipoDocumento.toUpperCase();
                this.numeroDocumento = numeroDocumento;
            }else {
                System.out.println("Datos incompletos u incorretos");
            } 
        }catch(NumberFormatException e){
            System.out.println("Solo se deben ingresar numeros");
        }
        
    }
    
    public void validarTelefono(String telefono){
        try{
            Integer.parseInt(telefono);
            if(telefono.length()==9 ){
                this.telefono = telefono;
            }else{
                System.out.println("El número de telefono debe tener 9 digitos");
            }
        }catch(NumberFormatException e){
            System.out.println("Solo se deben ingresar numeros");
        }
        
    }
    
    public void validarCorreo(String correo){
        if(correo.contains("@")&&correo.endsWith(".com")){
            this.correo = correo;
        }else{
            System.out.println("El correo debe contener un @ y termiar en .com");
        }
    }
    
    public void validarAlergias(String alergias){
        if(!alergias.equals("")&&alergias!=null){
            this.alergias = alergias;
        }else{
            System.out.println("No se deben omitir las alergias");
        }
    }
    
    public void verDatos(){
        System.out.println(
                "Nombre: " + this.nombre+
                "\nApellido paterno: " + this.apellidoPaterno+
                "\nApellido materno: " + this.apellidoPaterno+
                "\nTipo documento: " + this.tipoDocumento+
                "\nnúmero documento: " + this.numeroDocumento+
                "\nFecha nacimineto: " + this.fechaNacimiento+
                "\nAlergias: " + this.alergias+
                "\nTipo de sangre: " + this.tipoSangre+
                "\nCorreo: "+ this.correo+
                "\nTelefono: "+ this.telefono   
                     
        );
    }
}
