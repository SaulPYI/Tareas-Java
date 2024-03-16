/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;

/**
 *
 * @author S
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int[] edades={25, 17, 38, 12, 30};
        
        int sumaMayores = 0;
        int sumaMenores = 0;
        int cantidadMenores = 0;
        int cantidadMayores = 0;
        
        double promedioMayores = 0;
        double promedioMenores = 0;
        
       for(int i = 0; i < edades.length; i++){
           switch(edades[i] >=18 ?1 :0){
               case 1:
               sumaMayores += edades[i];
                   cantidadMayores++;
                   break;
                   default: 
                       sumaMenores += edades[i];
                       cantidadMenores++;
                       break;
           }
       }
        
        promedioMayores = sumaMayores / cantidadMayores;
        promedioMenores = sumaMenores / cantidadMenores;
        
        System.out.println("El promedio de Mayores es: "+ promedioMayores);
        System.out.println("El promedio de Menores es: "+ promedioMenores);
    }
    
}