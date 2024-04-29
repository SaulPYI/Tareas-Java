import java.util.Scanner;

class CalculadoraEdades {
    private int[] edades;

    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }

    public double calcularPromedioMayoresEdad() {
        int suma = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                suma += edad;
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }

    public double calcularPromedioMenoresEdad() {
        int suma = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad < 18) {
                suma += edad;
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }
}

public class CalcularEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas en el grupo:");
        int cantidadPersonas = scanner.nextInt();

        int[] edades = new int[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            edades[i] = scanner.nextInt();
        }
       
        CalculadoraEdades calculadora = new CalculadoraEdades(edades);

        double promedioMayoresEdad = calculadora.calcularPromedioMayoresEdad();
        double promedioMenoresEdad = calculadora.calcularPromedioMenoresEdad();

        System.out.println("El promedio de edades para los mayores de edad es: " + promedioMayoresEdad);
        System.out.println("El promedio de edades para los menores de edad es: " + promedioMenoresEdad);
    }
}