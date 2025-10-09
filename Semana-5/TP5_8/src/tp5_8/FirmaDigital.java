/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_8;

/**
 *
 * @author EXT84134
 */
public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void mostrarFirma(){
        System.out.println("La firma con codigo " +  codigoHash + " corresponde al usuario " + usuario.getNombre());
    }
    
    
}
