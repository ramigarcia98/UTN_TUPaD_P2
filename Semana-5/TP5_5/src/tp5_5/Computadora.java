/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_5;

/**
 *
 * @author EXT84134
 */
public class Computadora {

    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placamadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = new PlacaMadre(modelo, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this ) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    public void mostrar(){
        System.out.println("Marca: " + marca + ", Numero de Serie: " + numeroSerie + ", Modelo: " + placamadre.getModelo() + ", Chipset:" + placamadre.getChipset());
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    
}
