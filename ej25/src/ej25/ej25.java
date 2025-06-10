package ej25;
import java.util.Scanner;
public class ej25 {

    private static void menu() {
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Selecciona una opci�n:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicaci�n");
        System.out.println("4. Divisi�n");
        System.out.println("5. Salir");
    }
	
    // Funci�n para realizar la suma
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    // Funci�n para realizar la resta
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    // Funci�n para realizar la multiplicaci�n
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    // Funci�n para realizar la divisi�n
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Divisi�n por cero.");
            return Double.NaN; // Retorna NaN si la divisi�n no es v�lida
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Mostrar el men�
            menu();
            
            // Pedir al usuario que elija una opcion
            System.out.print("Ingresa el n�mero de la opci�n: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 5) {
                System.out.println("�Gracias por usar la calculadora!");
                break;  // Salir del bucle y finalizar el programa
            }
            
            // Pedir los numeros para la operacion
            System.out.print("Ingresa el primer n�mero: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo n�mero: ");
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
                    continue;  // Si la opci�n es inv�lida, continuar el bucle
            }

            // Mostrar el resultado
            System.out.println("El resultado es: " + resultado);
        }
        
        scanner.close();
    }
}
