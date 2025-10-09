
public class Titular {
    
   private String nombre;
   private String DNI;
   public Pasaporte pasaporte; //Asociacion 1 a 1

    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
   
   
}
