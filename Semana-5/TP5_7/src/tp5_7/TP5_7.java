/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_7;

/**
 *
 * @author EXT84134
 */
public class TP5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Motor motor = new Motor("Nafta","123456789");
        Vehiculo vehiculo = new Vehiculo("AVH287","Ford Focus",motor);
        Conductor conductor = new Conductor("Garcia Ramiro","B2");
        
        vehiculo.mostrarMotor();
        vehiculo.setConductor(conductor);
        
        System.out.println("El vehiculo con patente " + vehiculo.getPatente() + " pertenece al conductor " + vehiculo.getConductor().getNombre());
        
    }
    
}
