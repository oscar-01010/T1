package t1;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCF20408
 */
public class PacienteControlador {
    ArrayList<Paciente> pacientes = new ArrayList();
    
    public void agregarPaciente(Paciente p){
        pacientes.add(p);
    }
    
    public void eliminarPaciente(String numeroDocumento){

    }
    
    public void listarPacientes(){
        for(int i=0; i<pacientes.size(); i++)
            pacientes.get(i);
        
    }
}
