/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_10;

/**
 *
 * @author EXT84134
 */
public class CuentaBancaria {
    
    private String cbu;
    private String saldo;
    private ClaveSeguridad claveseguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, String saldo, String nombre, String dni) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveseguridad = new ClaveSeguridad(nombre,dni);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentabancaria() != this) {
            titular.setCuentabancaria(this);
        }
    }

    public String getCbu() {
        return cbu;
    }

    public String getSaldo() {
        return saldo;
    }
    
    public void mostrarClave(){
        System.out.println("La cuenta con cbu: " + cbu + " y un saldo de " + saldo +
                " tiene el siguiente codigo de seguirdad: " + claveseguridad.getCodigo() +
                " modificado el dia " + claveseguridad.getUltimaModificacion());
    }
}
