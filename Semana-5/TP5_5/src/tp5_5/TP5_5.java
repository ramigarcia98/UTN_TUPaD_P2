/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_5;

/**
 *
 * @author EXT84134
 */
public class TP5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computadora computadora = new Computadora("Samsung","12345","AX-101","23");
        Propietario propietario = new Propietario ("Garcia Ramiro","40940787");
        
        computadora.mostrar();
        
        computadora.setPropietario(propietario);
        
        System.out.println("Propietario de computadora: " + computadora.getPropietario().getNombre());
        System.out.println("Marca de la computadora del propietario: " + propietario.getComputadora().getMarca());
             
          
    }
    
}
