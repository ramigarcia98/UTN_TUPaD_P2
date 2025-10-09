/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_8;

/**
 *
 * @author EXT84134
 */
public class TP5_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario usuario = new Usuario("Garcia Ramiro","ramigarcia@gmail.com");
        FirmaDigital firmadigital = new FirmaDigital("123ABC","12/10/2025",usuario);
        Documento documento = new Documento("Descargas","Descargas multimedia","123ABC","12/10/2025",usuario);
        
        documento.mostrarDocumento();
        firmadigital.mostrarFirma();
    }
    
}
