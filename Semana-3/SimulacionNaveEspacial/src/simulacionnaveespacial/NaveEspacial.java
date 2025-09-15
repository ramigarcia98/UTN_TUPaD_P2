
package simulacionnaveespacial;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int capacidadMax;
    private boolean enVuelo;

    public NaveEspacial(String nombre, int combustible, int capacidadMax) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.capacidadMax = capacidadMax;
        this.enVuelo = false;
    }

    public void despegar() {
        if (combustible > 0) {
            enVuelo = true;
            System.out.println(nombre + " ha despegado con éxito.");
        } else {
            System.out.println(nombre + " no tiene combustible suficiente para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 10; // 1 distancia = 10 unidades de combustible
        if (!enVuelo) {
            System.out.println(nombre + " no ha despegado todavía.");
            return;
        }
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades de distancia.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > capacidadMax) {
            combustible = capacidadMax;
            System.out.println(nombre + " ha sido recargada al máximo (" + capacidadMax + ").");
        } else {
            combustible += cantidad;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades de combustible.");
        }
    }

    public void mostrarEstado() {
        String estado = enVuelo ? "en vuelo" : "en tierra";
        System.out.println("\n--- Estado de la Nave ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + capacidadMax);
        System.out.println("Estado: " + estado);
    }
}


