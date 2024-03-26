
import java.util.Scanner;



public class TemperaturaTanque {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       //defino las variables del momento del dia con sus correspondientes tesperaturas
        int tempManana = 25;
        int tempTarde = 30;
        int tempNoche = 20;
        
      //pido al usuario que ingrese el momento del dia
        System.out.println("Ingrese el momento del dia (manana, tarde, noche):");
        String momentoDia = scanner.nextLine();
        //que ingrese la temperatura del tanque 
        System.out.println("Ingrese la temperatura actual del tanque de combustible:");
        int temperatura = scanner.nextInt();
        
        //para definir la temperatura predeterminada
        int tempPredeterminada;
        //switch para comprobar lo de que el usuario ingreso correctamente el momento del dia y establecer la temperatura
        //correspondiente del momento del dia
        switch (momentoDia) {
            case "manana":
                tempPredeterminada = tempManana;
                break;
            case "tarde":
                tempPredeterminada = tempTarde;
                break;
            case "noche":
                tempPredeterminada = tempNoche;
                break;
            default:
                System.out.println("Entrada no valida. Selecciona entre manana, tarde o noche.");
                return;
        }
        
        String resultado;
        if (temperatura < tempPredeterminada ) { 
            resultado = "Muy Buena";
        } else if (temperatura >= tempPredeterminada && temperatura <= tempPredeterminada ) {
            resultado = "Normal";
        } else {
            resultado = "Peligrosa";
        }
        
        System.out.println("La temperatura del tanque de combustible en la " + momentoDia + " es: " + resultado);
        
        scanner.close();
    }
}