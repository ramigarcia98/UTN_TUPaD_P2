/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_6;

/**
 *
 * @author EXT84134
 */
public class TP5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mesa mesa = new Mesa("37","6");
        Reserva reserva = new Reserva("12/10/2025","21:00hs",mesa);
        Cliente cliente = new Cliente("Garcia Ramiro","3518097682");
        
        reserva.mostrar();
        
        reserva.setCliente(cliente);
        System.out.println("Cliente asociado a la reserva: " + reserva.getCliente().getNombre() + " - Telefono: " + reserva.getCliente().getTelefono());
    }
    
}
