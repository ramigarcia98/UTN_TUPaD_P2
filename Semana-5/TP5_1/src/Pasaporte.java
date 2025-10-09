
public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    public Titular titular; //Referencia al Titular
    

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrar(){
            System.out.println("Pasaporte: " + numero + " -Foto: " + foto.getImagen() + " -Formato: " + foto.getFormato());
    }
   
    
    
    
    
    
}
