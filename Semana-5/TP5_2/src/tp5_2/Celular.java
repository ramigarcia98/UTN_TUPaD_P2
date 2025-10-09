/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_2;

/**
 *
 * @author EXT84134
 */
public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; //Agregacion 1 a 1
    private Usuario usuario; //Asociacion bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    // Set para vincular con Usuario por COMPOSICION
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    public void mostrarBateria() {
        if (bateria != null) {
            System.out.println("El celular " + marca + "-" + modelo + 
                    " tiene Bateria: " + bateria.getModelo() + " con %" + 
                    bateria.getCapacidad() + " de capacidad");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getImei() {
        return imei;
    }
    
    
    
    
}
