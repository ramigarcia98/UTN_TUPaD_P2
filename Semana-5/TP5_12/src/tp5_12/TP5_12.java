/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_12;

/**
 *
 * @author EXT84134
 */
public class TP5_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Impuesto impuesto = new Impuesto("$30.000");
        Contribuyente contribuyente = new Contribuyente("Garcia Ramiro","23-40940787-9");
        Calculadora calculadora = new Calculadora();
        
        calculadora.calcular(impuesto);
        impuesto.setContribuyente(contribuyente);
        
        System.out.println("El monto a pagar corresponde al contribuyente " + impuesto.getContribuyente().getNombre());
        
    }
    
}
