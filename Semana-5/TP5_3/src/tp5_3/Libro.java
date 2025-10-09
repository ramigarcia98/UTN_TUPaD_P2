/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_3;

/**
 *
 * @author EXT84134
 */
public class Libro {
    
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;
    
   //CONSTRUCTOS (tiene Editorial para lograr la Agregacion)
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    //Set para vincular Autor con Libro y efectuar asociacion 1 a 1
    public void setAutor(Autor autor) {
        if (autor != null) {
            this.autor = autor;
        }
        
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    void mostrarEditorial() {
        System.out.println("El libro " + "\"" + titulo + "\"" + " tiene editorial: " + editorial.getNombre()
        + " ubicada en: " + editorial.getDireccion());
    }
}
