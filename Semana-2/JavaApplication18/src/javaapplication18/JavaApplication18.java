
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author GARCIA RAMIRO - COMISION 14
 */
public class JavaApplication18 {

    //VARIABLE GLOBAL (usada en el ejercicio 11)
    final static double ENTRADA  = 0.10;
    
//////  MENU PRINCIPAL
    public static void main(String[] args) {

        
       Scanner input = new Scanner(System.in);
       int opcion;
       
       do {
            System.out.println("\n===== MENU DE EJERCICIOS =====");
            System.out.println("1. Verificacion de Año Bisiesto");
            System.out.println("2. Mayor de Tres Numeros.");
            System.out.println("3. Clasificacion de Edad.");
            System.out.println("4. Calculadora de Descuento segun categoria.");
            System.out.println("5. Suma de Numeros Pares.");
            System.out.println("6. Contador de Positivos, Negativos y Ceros (for).");
            System.out.println("7. Validacion de Nota entre 0 y 10 (do-while).");
            System.out.println("8. Calculo del Precio Final con impuesto y descuento.");
            System.out.println("9. Composicion de funciones para calcular costo de envio y total de compra.");
            System.out.println("10. Actualizacion de stock a partir de venta y recepcion de productos.");
            System.out.println("11. Calculo de descuento especial usando variable global.");
            System.out.println("12. Modificacion de un array de precios y visualizacion de resultados.");
            System.out.println("13. Impresion recursiva de arrays antes y despues de modificar un elemento.");
            System.out.println("0. Salir");
            System.out.println("\n");
            System.out.print("Ingrese la opcion: ");
            opcion = Integer.parseInt(input.nextLine());

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
        
           
    }
    
////////////////// FUNCIONES PARA CADA EJERCICIO //////////////////////////
    
//////  EJERCICIO 1 ////////
/*
1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
Ejemplo de entrada/salida:
Ingrese un año: 2024
El año 2024 es bisiesto.
Ingrese un año: 1900
El año 1900 no es bisiesto.
 */
    
    public static void ejercicio1(){
        
        System.out.println("EJERCICIO 1");
        
        Scanner input = new Scanner(System.in);
        int año;
        
        System.out.print("Ingrese un año: ");
        año = Integer.parseInt(input.nextLine());
        
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0 )) {
            System.out.println("El año " + año + " es bisiesto.");    
        }
        else{
              System.out.println("El año " + año + " no es bisiesto.");   
            }
        
    }
    
//______________________________________________________________________________________________________________________________________________   
//////  EJERCICIO 2 ///////// 
/*    
2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
Ejemplo de entrada/salida:
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12
 */
    public static void ejercicio2(){
        
        System.out.println("EJERCICIO 2");
        
        Scanner input = new Scanner(System.in);
        int n, mayor;
        
        mayor = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese n" + i + ": ");
            n = Integer.parseInt(input.nextLine());
            
            if (n > mayor) { 
                mayor = n;
            }
        }
        System.out.print("El mayor es: " + mayor);
        
    }
 
//______________________________________________________________________________________________________________________________________________   
//////  EJERCICIO 3 /////////     
/*
3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"        
*/       
    public static void ejercicio3(){
        
    System.out.println("EJERCICIO 3");
        
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Eres un Niño");
        }
        else if (12 <= edad && edad <=17){
            System.out.println("Eres un Adolescente");
        }
        else if (18 <= edad && edad <= 59){
            System.out.println("Eres un Adulto");
        }
        else{
            System.out.println("Eres un Adulto mayor");
        }
    
    
    
    }

//______________________________________________________________________________________________________________________________________________   
//////  EJERCICIO 4 /////////     
/*
4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0    
*/

public static void ejercicio4(){

    Scanner input = new Scanner(System.in);
    int precio;
    String categoria;
    
    System.out.println("Ingrese el precio del producto: ");
    precio = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese la categoria del producto (A,B o C): ");
    categoria = input.nextLine().toUpperCase();
    
    
    switch (categoria) {
        case "A":
            System.out.println("Descuento aplicado: 10%");
            System.out.println("Precio final: " + (precio - (precio * 0.1 )));
            break;
        case "B":
            System.out.println("Descuento aplicado: 15%");
            System.out.println("Precio final: " + (precio - (precio * 0.15 )));
            break;
        case "C":
            System.out.println("Descuento aplicado: 20%");
            System.out.println("Precio final: " + (precio - (precio * 0.2 )));
            break;    
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
    }
    
    
    
    

    }

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 5 /////////
/*
5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0,
momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
*/

public static void ejercicio5(){
    
    Scanner input = new Scanner(System.in);
    int numero, suma;
    suma = 0;
    
     do {        
         System.out.println("Ingrese un numero (0 para terminar)");
         numero = Integer.parseInt(input.nextLine());
         
         if (numero % 2 == 0) {
            suma = suma + numero;
         }
         
    } while (numero != 0);
    
     System.out.println("La suma de los numero pares es: " + suma);
    
    
}

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 6 /////////
/*
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
*/

public static void ejercicio6(){
    
    Scanner input = new Scanner(System.in);
    int numero, posi, nega, cero;
    
    posi = nega = cero = 0;
    
    
    for (int i = 0; i < 10; i++) {
       System.out.println("Ingrese el numero " + i + ":"); 
       numero =  Integer.parseInt(input.nextLine());
       
        if (numero > 0){
            posi = posi + 1;
        }
        else if (numero < 0){
            nega = nega + 1;
        }
        else{
            cero = cero + 1;
            }
        }
    
    System.out.println("RESULTADOS");
    System.out.println("Positivos: " + posi);
    System.out.println("Negativos: " + nega);
    System.out.println("Ceros: " + cero);
    }

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 7 /////////
/*
7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango,
debe seguir pidiéndole la nota hasta que ingrese un valor válido.
*/   

public static void ejercicio7(){
    
    Scanner input = new Scanner(System.in);
    int nota;
    
    do {
        System.out.println("Ingrese una nota (0-10):");
        nota = Integer.parseInt(input.nextLine());
        
        if (nota <= 10 && nota >= 0) {
            System.out.println("Nota guardada correctamente"); 
        }
        else{
            System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10");
        }
        
        
    } while (nota > 10 || nota < 0);
         
    
}

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 8 /////////
/*
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
*/

//funcion precio final
public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
    
    double impuestoDecimal = impuesto / 100.0;
    double descuentoDecimal = descuento / 100.0;

    double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    return precioFinal;    
}

//programa principal
public static void ejercicio8(){
    
    Scanner input = new Scanner(System.in);
    double precioBase, impuesto, descuento;
    
    System.out.println("Ingrese el precio base del producto:");
    precioBase = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese el impuesto en porcentaje:");
    impuesto = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese el descuento en porcentaje:");
    descuento = Integer.parseInt(input.nextLine());
    
    System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
    
}

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 9 /////////
/*
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
Desde main(), solicita el peso del paqu
*/

//funcion del costo de envio
public static double calcularCostoEnvio(double peso, String zona){
    
    double precioEnvio;
    
    precioEnvio = 0;
    
    if (zona.toLowerCase().equals("nacional")) {
        precioEnvio = 5 * peso;
    }
    else if (zona.toUpperCase() == "internacional"){
        precioEnvio = 10 * peso;
        
    }
    return precioEnvio;
}

//funcion del precio total del producto
public static double calcularTotalCompra(double precioProducto, double costoEnvio){
    
    return precioProducto + costoEnvio;
}

//programa principal
public static void ejercicio9(){
   
    Scanner input = new Scanner(System.in);
    double precioProducto, peso;
    String zona;
    
    System.out.println("Ingrese el precio del producto:");
    precioProducto = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese el peso del paquete en kg:");
    peso = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese la zona de envio (Nacional/Internacional)::");
    zona = input.nextLine().toUpperCase();
    
    System.out.println("El costo de envio es: " + calcularCostoEnvio(peso, zona));
    System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto,calcularCostoEnvio(peso, zona)));
    
}

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 10 /////////
/*
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
*/

 //funcion nuevo stock
public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
    
 int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
 
 return nuevoStock;
}

//programa principal
public static void ejercicio10(){
    
    Scanner input = new Scanner(System.in);
    int stockActual, cantidadVendida, cantidadRecibida;
    
    System.out.println("Ingrese el stock actual del producto:");
    stockActual = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese la cantidad vendida:");
    cantidadVendida = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese la cantidad recibida");
    cantidadRecibida = Integer.parseInt(input.nextLine());
    
    System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
    
    
}

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 11 /////////
/*
11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable 
global para calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
*/

// funcion descuento especial
public static double calcularDescuentoEspecial(double precio){
    
    double descuentoAplicado = precio * ENTRADA;
    return descuentoAplicado;
    
}

//programa principal
public static void ejercicio11(){
    
    Scanner input = new Scanner(System.in);
    double precio;
    
    System.out.println("Ingrese el precio del producto:");
    precio = Integer.parseInt(input.nextLine());
    
    System.out.println("El descuento especial aplicado es: " + calcularDescuentoEspecial(precio) );
    System.out.println("El precio final con descuento es:" + (precio - calcularDescuentoEspecial(precio)));
}

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 12 /////////
/*
12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
*/

public static void ejercicio12(){
    
    Scanner input = new Scanner(System.in);
    double[] precio = {199.99, 299.5, 149.75, 399.0, 89.99}; //array de 5 elementos
    
    for (int i = 0; i < precio.length; i++) {
        System.out.println("Precio: $" + precio[i]);
    }
    
    precio[2] = 129.99;
    
    System.out.println("Precios modificados:");
    for (int i = 0; i < precio.length; i++) {
        System.out.println("Precio: $" + precio[i]);
    }
    
    
    
    
    
}

//______________________________________________________________________________________________________________________________________________
//////  EJERCICIO 13 /////////
/*
13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
*/

//funcion recursiva para recorrer un array
public static void recursivaRecorrerArray(double[] precio, int indice){
    
    if (indice == precio.length) {
            return; // caso base: terminamos
        }
    System.out.println("Producto " + indice + ": $" + precio[indice]);
    recursivaRecorrerArray(precio, indice + 1); // llamada recursiva
    
}

public static void ejercicio13(){
   
    double[] precio = {199.99, 299.5, 149.75, 399.0, 89.99}; //array de 5 elementos
    
    recursivaRecorrerArray(precio, 0);
    
    precio[2] = 129.99;
    
    System.out.println("Precios modificados:");
    recursivaRecorrerArray(precio, 0);
    
}





































}




    

