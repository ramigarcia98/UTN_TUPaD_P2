
import java.util.HashSet;


public class Empleado {
    
    private static int totalEmpleados = 0;
    private int id; //Identificador único del empleado.
    private String nombre; //Nombre completo.
    private String puesto; //Cargo que desempeña.
    private double salario; //Salario actual.
    
    
    //CONSTRUCTOR COMPLETO
    public Empleado(int id, String nombre, String puesto, double salario){
        setId(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        totalEmpleados++;       
    }
    
    //CONSTRUCTOR CON NOMBRE Y PUESTO (id automático y salario por defecto)
    public Empleado(String nombre, String puesto){
        this(
                totalEmpleados + 1, //ID automatico
                nombre, 
                puesto, 
                0.0); //Salario por defecto
             
    }
    
    // METODO aumento salario (porecetnaje)
    public void actualizarSalario(double porcAumento){
        salario = salario * (1 + porcAumento / 100);
        System.out.println("Hola " + nombre + " tienes un aumento del %" + porcAumento + " = $" + salario);
    }
    
    public void actualizarSalario(int cantFija){
        salario = salario + cantFija;
        System.out.println("Hola " + nombre + " tienes un aumento de $" + cantFija + " = $" + salario);
    }
    
    //Metodo toString()
    @Override
    public String toString(){
        return "Empleado{" + "id=" + id + " ,Nombre=" + nombre + " ,Puesto=" + puesto + ", Salario=" + salario + "}";
    }
    
    /*Metodo para mostrar datos es reemplazado por toString
    public void mostrarDatos(){
        System.out.println(id + " " + nombre + " " + puesto + " " + salario);
    }
    */
    
    //Método estático mostrarTotalEmpleados
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    //SETTERS Y GETTERS
    public void setId(int id) {
        if(id >= 0){
           this.id = id; 
        }        
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
          this.nombre = nombre;  
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuesto(String puesto) {
        if (puesto != null) {
         this.puesto = puesto;   
        }    
    }

    public String getPuesto() {
        return puesto;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
          this.salario = salario;  
        }
    }

    public double getSalario() {
        return salario;
    }
    
    
    
    
}
