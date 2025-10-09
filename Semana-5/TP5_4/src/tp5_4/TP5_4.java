/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_4;

/**
 *
 * @author EXT84134
 */
public class TP5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco("BBVA Frances","23409407578");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234567890","02/09/2030",banco);
        Cliente cliente = new Cliente("Garcia Ramiro","40789034");
        
        tarjeta.mostrarBanco();
        
        tarjeta.setCliente(cliente);
        System.out.println("");
        System.out.println("Numero de tarjeta: " + tarjeta.getNumero());
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println(""); 
        System.out.println("Cliente asociado a la tarjeta: " + tarjeta.getCliente().getNombre());
        System.out.println("Tarjeta asociada al cliente: " + cliente.getTarjeta().getNumero());
    }
    
}
