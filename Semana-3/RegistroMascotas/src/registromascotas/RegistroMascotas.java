
package registromascotas;

public class RegistroMascotas {

    public static void main(String[] args) {
        Mascotas mascota = new Mascotas();
        
        mascota.mostrarInfo();
        
        mascota.nombre = "Rocky";
        mascota.especie = "Pitbull";
        mascota.edad = 3;
        
        mascota.mostrarInfo();
        
        mascota.cumplirAnios(3);
        mascota.mostrarInfo();
    }
    
}
