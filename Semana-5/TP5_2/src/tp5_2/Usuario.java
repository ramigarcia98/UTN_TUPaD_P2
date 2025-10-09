/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_2;

/**
 *
 * @author EXT84134
 */
public class Usuario {
    
    private String nombre;
    private String DNI;
    private Celular celular; //Asociacion bidireccional

    public Usuario(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != null) {
            celular.setUsuario(this);
        }
    }
    
    public Celular getCelular() {
        return celular;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    
}
