/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepunto2;

/**
 *
 * @author M@golhy
 */
import java.util.Scanner;
public class ClasePunto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a,b;
        
        System.out.print("Ingrese un valor int para x: ");
        a = entrada.nextInt();
        
         System.out.print("Ingrese un valor para y: ");
        b = entrada.nextInt();
        
        System.out.println("Objeto 1");
        Punto puntito = new Punto(); // Consructor sin parametros
        System.out.println("El valor de x es: "+ puntito.GetX());
        System.out.println("El valor de y es: "+ puntito.GetY());
        
        System.out.println("Objeto 2");
        
        Punto puntito2 = new Punto(a,b); // Consructor con parametros
        System.out.println("El valor de x es: "+ puntito2.GetX());
        System.out.println("El valor de y es: "+ puntito2.GetY());
        
        System.out.print("Ingrese un valor correcto para x: ");
        a = entrada.nextInt();   
        
        puntito2.SetX(a);
        
        System.out.println("Objeto 2 corregido");
        System.out.println("El valor de x es: "+ puntito2.GetX());
        System.out.println("El valor de y es: "+ puntito2.GetY());
        
    }
    
}
