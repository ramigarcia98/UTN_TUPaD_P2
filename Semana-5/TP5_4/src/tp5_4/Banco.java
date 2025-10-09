/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_4;

/**
 *
 * @author EXT84134
 */
public class Banco {
    
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
    
}
