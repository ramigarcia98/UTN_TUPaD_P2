/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_10;

/**
 *
 * @author EXT84134
 */
public class TP5_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Titular tirular = new Titular ("Garcia Ramiro", "40569890");
        //ClaveSeguridad claveseguridad = new ClaveSeguridad ("12345","18/09/2025");
        CuentaBancaria cuentabancaria = new CuentaBancaria ("123121242134","$1.400.000","12345","18/09/2025");
        
        cuentabancaria.mostrarClave();
        
        cuentabancaria.setTitular(tirular);
        System.out.println("La cuenta bancaria con cbu: " + cuentabancaria.getCbu() + 
                " pertenece a " + cuentabancaria.getTitular().getNombre() + 
                " con dni " + cuentabancaria.getTitular().getDni());
    }
    
    
}
