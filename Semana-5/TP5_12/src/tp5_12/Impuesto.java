/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_12;

/**
 *
 * @author EXT84134
 */
public class Impuesto {
    
    private String monto;
    private Contribuyente contribuyente;

    public Impuesto(String monto) {
        this.monto = monto;
        
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public String getMonto() {
        return monto;
    }

 
    
    
    
    
}
