
package biblioteca;

public class Libros {
   
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    //getter para obtener loas atributos
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    
    //setter para modificar los atributos
    public void setAñoPublicacionValidacion(int añoPublicacion){
        if (añoPublicacion > 0) { //controlamos la integridad de los datos
            this.añoPublicacion = añoPublicacion;
        }
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
   
    
}
