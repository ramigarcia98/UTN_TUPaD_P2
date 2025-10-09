/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_14;

/**
 *
 * @author EXT84134
 */
public class EditoreVideo {
    
    void exportar(String formato){
        Render render = new Render(formato);
        
        System.out.println("El formato del video es: " + render.getFormato());
    }
}
