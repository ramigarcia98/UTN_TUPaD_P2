
package biblioteca;

public class Biblioteca {


    public static void main(String[] args) {
        Libros libro = new Libros();
        
        libro.setTitulo("Dracula");
        libro.setAutor("Bram Stocker");
        libro.setAñoPublicacionValidacion(-1897);
        
        System.out.println("El titulo del libro es: " + libro.getTitulo());
        System.out.println("El autor del libro es: " + libro.getAutor());
        System.out.println("El año de publicacion del libro es: " + libro.getAñoPublicacion());
        
        libro.setAñoPublicacionValidacion(1897);
        System.out.println("El año de publicacion del libro es: " + libro.getAñoPublicacion());
        
        
    }
    
}
