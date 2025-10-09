/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_14;

/**
 *
 * @author EXT84134
 */
public class TP5_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EditoreVideo editorevideo = new EditoreVideo();
        Proyecto proyecto = new Proyecto("Mi primer video","00:12:34");
        
        editorevideo.exportar(".mp4");
    }
    
}
