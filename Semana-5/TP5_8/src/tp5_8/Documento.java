/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_8;

/**
 *
 * @author EXT84134
 */
public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmadigital;

    public Documento(String titulo, String contenido, String codigoHas, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmadigital = new FirmaDigital(codigoHas, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void mostrarDocumento(){
        System.out.println("El documento " + titulo + " fue firmado el dia " + firmadigital.getFecha());
    }
    
    
}
