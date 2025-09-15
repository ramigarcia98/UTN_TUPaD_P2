
public class principal {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado0 = new Empleado(1, "Ramiro Garcia","Ingeniero",2000000 ); //Para Constructor 1
        Empleado empleado1 = new Empleado("Francisco Romano","Arquitecto"); //Para Constructor 2
        Empleado empleado2 = new Empleado(3, "Rodrigo Molina","Ingeniero",3000000 ); //Para Constructor 1
        Empleado empleado3 = new Empleado("Mario Rivera","Abogado"); //Para Constructor 2
        Empleado empleado4 = new Empleado("Martin Gomez","Programador"); //Para Constructor 2
        Empleado empleado5 = new Empleado("Ulises Perrig","Contador"); //Para Constructor 2
       
        System.out.println(empleado0);
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        System.out.println(empleado5);
        
        
        empleado0.actualizarSalario(30.0); //Porcentaje
        empleado0.actualizarSalario(1000000); //Cant fija
        empleado5.actualizarSalario(1500000); //Cant fija
        
        System.out.println("Total empleados final: " + Empleado.mostrarTotalEmpleados());
    }
    
}
