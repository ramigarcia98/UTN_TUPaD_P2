/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_3;

/**
 *
 * @author EXT84134
 */
public class TP5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor autor = new Autor("Joseph Rudyard Kipling ","India");
        Editorial editorial = new Editorial("Penguin Random House","1745 Broadway, Manhattan");
        Libro libro = new Libro("El libro de la Selva","123456789", editorial);
        
        libro.mostrarEditorial(); // Comprobar agregacion; visualiza el el editorial del libro
        
        libro.setAutor(autor);
        System.out.println(libro.getTitulo() + " fue escrito por " + libro.getAutor().getNombre()
                + " nacido en " + libro.getAutor().getNacionalidad());
    }
    
}
