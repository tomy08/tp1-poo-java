package ej20;
import java.util.Scanner;
import java.util.Random;

public class ej20 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce la longitud deseada para la contraseña: ");
        int longitud = scanner.nextInt();

        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String caracteres = letrasMinusculas + letrasMayusculas + numeros;

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(indice));
        }

        System.out.println("Contraseña generada: " + password.toString());

        scanner.close();
	}

}
