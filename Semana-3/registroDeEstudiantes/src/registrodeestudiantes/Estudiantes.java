/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeestudiantes;

/**
 *
 * @author EXT84134
 */
public class Estudiantes {
    //ATRIBUTOS
    String nombre;
    String apellido;
    int curso;
    int calificacion;
    
    //METODOS
    void mostrarInfo() {
      System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);  
    }
    
    int subirCalificacion(int puntosMas){
        calificacion = calificacion + puntosMas;    
        return calificacion;
    } 
    
    int bajarCalificacion(int puntosMenos){
        calificacion = calificacion - puntosMenos;    
        return calificacion;
    }
}
        
    

