/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_2;

/**
 *
 * @author EXT84134
 */
public class TP5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bateria bateria = new Bateria("China", "99");
        Celular celular = new Celular ("123456","Samsung","Galaxi 20",bateria);
        Usuario usuario = new Usuario ("Garcia Ramiro", "40940757");
        
        celular.mostrarBateria(); //Comprobar Agregacion
        
        celular.setUsuario(usuario); //Asociacion bidireccional
        System.out.println("El Usuario asociado al celular con imei " + celular.getImei() + 
                " es " + celular.getUsuario().getNombre() );
        
        System.out.println("El usuario " + usuario.getNombre() + 
                " esta asociado al celular con imei " + usuario.getCelular().getImei() );
        
        
        
        
    }
    
}
