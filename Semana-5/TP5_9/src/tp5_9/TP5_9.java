/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_9;

/**
 *
 * @author EXT84134
 */
public class TP5_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Paciente paciente = new Paciente("Garcia Ramiro","Omint");
        Profesional profesional = new Profesional("Perrig David","Traumatologia");
        CitaMedica citamedica = new CitaMedica("12/11/2025","08:30am");
        
        citamedica.setPaciente(paciente);
        citamedica.setProfesional(profesional);
        
        System.out.println("Sr " + citamedica.getPaciente().getNombre() + " con obra social " + 
                citamedica.getPaciente().getObraSocial() + " ,usted tiene una cita medica con el Dr " + citamedica.getProfesional().getNombre() + 
                " especialista en " + citamedica.getProfesional().getEspecialidad() + " el dia " +
                citamedica.getFecha() + " a las " + citamedica.getHora());
    }
    
   
}
