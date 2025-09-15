
package granjadigital;

public class GranjaDigital {

    public static void main(String[] args) {
        Gallinas gallina00 = new Gallinas();
        Gallinas gallina01 = new Gallinas();
        
        //Gallina 00
        System.out.println("Gallina 00");
        gallina00.edad = 1;
        gallina00.idGallinas = 00;
        gallina00.huevosPuestos = 3;
        
        gallina00.mostrarEstado();
        gallina00.envejecer(2);
        gallina00.ponerHuevo(3);
        gallina00.mostrarEstado();
        
        //Gallina 01
        System.out.println("Gallina 01");
        gallina01.edad = 2;
        gallina01.idGallinas = 01;
        gallina01.huevosPuestos = 2;
        
        gallina01.mostrarEstado();
        gallina01.envejecer(1);
        gallina01.ponerHuevo(4);
        gallina01.mostrarEstado();
        
                
    }
    
}
