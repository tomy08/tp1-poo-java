package ej13;

import java.util.Scanner;

public class ej13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = mostrarMenu(sc);
        double temperatura;

        switch (opcion) {
            case 1:
                System.out.print("Introduce la temperatura en Celsius: ");
                temperatura = sc.nextDouble();
                double fahrenheit = convertirCelsiusAFahrenheit(temperatura);
                System.out.println("Equivale a " + fahrenheit + " °F");
                break;
            case 2:
                System.out.print("Introduce la temperatura en Fahrenheit: ");
                temperatura = sc.nextDouble();
                double celsius = convertirFahrenheitACelsius(temperatura);
                System.out.println("Equivale a " + celsius + " °C");
                break;
            default:
                System.out.println("Opción no valida.");
        }

        sc.close();
    }

    // Funcion para mostrar el menú y obtener la opción del usuario
    private static int mostrarMenu(Scanner sc) {
        System.out.println("Conversor de temperatura:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una opción (1 o 2): ");
        return sc.nextInt();
    }

    // Funcion para convertir de Celsius a Fahrenheit
    private static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Función para convertir de Fahrenheit a Celsius
    private static double convertirFahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
