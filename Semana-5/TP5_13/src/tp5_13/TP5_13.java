/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_13;

/**
 *
 * @author EXT84134
 */
public class TP5_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GeneradorQR generadorqr = new GeneradorQR();
        Usuario usuario = new Usuario("Garcia Ramiro","ramigarci123@gmail.com");
        
        generadorqr.generar("JK23478SHKFKSF99");
        
        
    }
    
}
