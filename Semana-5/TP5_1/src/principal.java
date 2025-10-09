
public class principal {

    public static void main(String[] args) {
        
        Titular titular = new Titular ("Ramiro","40940757");
        Pasaporte pasaporte = new Pasaporte("X123456", "02/04/2020","foto-carnet","jpg");
        
       
        pasaporte.mostrar();
        titular.setPasaporte(pasaporte);
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());
    }
    
}
