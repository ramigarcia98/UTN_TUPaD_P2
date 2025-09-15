/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registromascotas;

public class Mascotas {
  String nombre;
  String especie;
  int edad;
  
  void mostrarInfo(){
      System.out.println(nombre + " " + especie + " " + edad);
    }
  
  int cumplirAnios(int anios){
      edad = edad + anios;
      return edad;
  }
    
}
