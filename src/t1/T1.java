/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author UCF20408
 */
public class T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Paciente p = new Paciente();
        
        System.out.println("Ingrese el nombre del paciente ");
        p.setNombre(sc.next());
        System.out.println("Ingrese el apellido paterno del paciente ");
        p.setApellidoPaterno(sc.next());
        System.out.println("Ingrese el apellido materno del paciente ");
        p.setApellidoMaterno(sc.next());
        System.out.println("Ingrese el tipo de documento del paciente ");
        String td = sc.next();
        System.out.println("Ingrese el número de documento del paciente ");
        p.validadIdentidad(td, sc.next());
        System.out.println("Ingrese la fecha de nacimiento del paciente ");
 
        System.out.println("Ingrese las alergias del paciente ");
        p.setAlergias(sc.next());
        System.out.println("Ingrese el tipo de sangre del paciente ");
        p.setTipoSangre(sc.next());
        System.out.println("Ingrese el correo del paciente ");
        p.validarCorreo(sc.next());
        System.out.println("Ingrese el telefono del paciente ");
        p.validarTelefono(sc.next());

        p.verDatos();
    }
    
}
