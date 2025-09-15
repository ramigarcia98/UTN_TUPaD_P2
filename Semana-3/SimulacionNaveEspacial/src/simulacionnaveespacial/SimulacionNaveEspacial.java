
package simulacionnaveespacial;

public class SimulacionNaveEspacial {

    public static void main(String[] args) {
        
        NaveEspacial nave = new NaveEspacial("Explorer I", 50, 100);

        // Intentar avanzar sin recargar
        nave.despegar();
        nave.avanzar(6); // debería fallar (necesita 60, solo tiene 50)

        // Recargar y avanzar correctamente
        nave.recargarCombustible(40); // ahora tiene 90
        nave.avanzar(6); // ahora sí, consume 60 → quedan 30

        // Mostrar estado final
        nave.mostrarEstado();
    }
        
}
    
