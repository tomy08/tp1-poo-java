package ej25;
import java.util.Scanner;
public class ej25 {

    private static void menu() {
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
    }
	
    // Función para realizar la suma
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    // Función para realizar la resta
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    // Función para realizar la multiplicación
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    // Función para realizar la división
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Retorna NaN si la división no es válida
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Mostrar el menú
            menu();
            
            // Pedir al usuario que elija una opcion
            System.out.print("Ingresa el número de la opción: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 5) {
                System.out.println("¡Gracias por usar la calculadora!");
                break;  // Salir del bucle y finalizar el programa
            }
            
            // Pedir los numeros para la operacion
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            // Realizar la operacion segun la opcion elegida
            double resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = suma(num1, num2);
                    break;
                case 2:
                    resultado = resta(num1, num2);
                    break;
                case 3:
                    resultado = multiplicacion(num1, num2);
                    break;
                case 4:
                    resultado = division(num1, num2);
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta nuevamente.");
                    continue;  // Si la opción es inválida, continuar el bucle
            }

            // Mostrar el resultado
            System.out.println("El resultado es: " + resultado);
        }
        
        scanner.close();
    }
}
