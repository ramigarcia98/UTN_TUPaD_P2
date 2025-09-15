/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodeestudiantes;

public class Principal {

    public static void main(String[] args) {
        
        
        Estudiantes estudiantes = new Estudiantes();
        
        estudiantes.mostrarInfo();
        
        estudiantes.apellido = "Garcia";
        estudiantes.nombre = "Ramiro";
        estudiantes.curso = 6;
        estudiantes.calificacion = 5;
        
        estudiantes.mostrarInfo();
        
        estudiantes.subirCalificacion(4);
        estudiantes.mostrarInfo();
        estudiantes.bajarCalificacion(8);
        estudiantes.mostrarInfo();
        
        
        
    }
    
}
