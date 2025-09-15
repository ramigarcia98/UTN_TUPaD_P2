
package granjadigital;

public class Gallinas {
    
    int idGallinas;
    int edad;
    int huevosPuestos;
    
    void mostrarEstado(){
      System.out.println(idGallinas + " " + edad + " " + huevosPuestos);
    }
    
    int envejecer(int anios){
      edad = edad + anios;
      return edad;
    }
    
    int ponerHuevo(int huevos){
      huevosPuestos = huevosPuestos + huevos;
      return edad;
    }
    
    
}
