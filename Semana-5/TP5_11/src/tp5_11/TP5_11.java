/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_11;

/**
 *
 * @author EXT84134
 */
public class TP5_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion cancion = new Cancion("Velda");
        Artista artista = new Artista("Bad Bunny","Reggueton");
        Reproductor reproducir = new Reproductor();
        
        reproducir.reproducir(cancion);
        cancion.setArtista(artista);
        
        System.out.println("La cancion \"" + cancion.getTitulo() + "\" es cantada por el "
                + "artista " + cancion.getArtista().getNombre());
    }
    
}
