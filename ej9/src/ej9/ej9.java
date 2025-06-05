package ej9;
import java.util.Scanner;
public class ej9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número entero:");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo número entero:");
        int num2 = sc.nextInt();

        System.out.println("Ingresa el tercer número entero:");
        int num3 = sc.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El numero mayor es: " + mayor);

        sc.close();
    }

}
