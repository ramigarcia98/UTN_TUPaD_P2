/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_13;

/**
 *
 * @author EXT84134
 */
public class GeneradorQR {
    
    public void generar(String valor){
        CodigoQR codigoqr = new CodigoQR(valor);
        
        System.out.println("El valor del Codigo QR: " + codigoqr.getValor());
    }
}
