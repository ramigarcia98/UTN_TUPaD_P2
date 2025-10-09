/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_6;

/**
 *
 * @author EXT84134
 */
public class Reserva {
    
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void mostrar(){
        System.out.println("Reserva: fecha-hora: " + fecha + "-" + hora + " mesa-capacidad: " + mesa.getMesa() + "-" + mesa.getCapacidad());
    }
    
}
