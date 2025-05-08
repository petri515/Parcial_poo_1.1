/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_poo;


import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Parcial_poo {
  
    
    public static void main(String[] args) {
        while(true){
        System.out.println("Ingrese el numero segun la operacion que desee realizar \n 1. Registrar nuevo libro \n 2. Registrar nuevo usuario \n 3. buscar categoria \n 0.Salir del programa ");
        Scanner sc = new Scanner(System.in);
        
            int ejecutar = sc.nextInt();
        
            if(ejecutar == 1){
                libros libro1 = new libros();
                System.out.print("El libro se llamara: ");
                String nombre = sc.next();
                libro1.setNombreLibro(nombre);
            
        
        }
        }
    }   
     

    
    
   
}
