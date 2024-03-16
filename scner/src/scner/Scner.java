/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scner;

import java.util.Scanner;

/**
 *
 * @author S
 */
public class Scner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int [] edades = new int[5];
        for(int i = 1; i < 6; i++){
            System.out.println("Ingrese la edad "+ i + ": "); 
            edades[i] = scanner.nextInt();
        }    
   }
    
}
