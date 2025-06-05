package ej7;

import java.util.Scanner;

public class ej7 {
    // Verifica si un caracter es una vocal
    public static boolean esVocal(char letra, char[] vocales) { //
        for (char v : vocales) { // Recorre el arreglo de vocales
            if (letra == v) { // Si la letra es igual a alguna vocal
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char vocales[] = { 'a', 'e', 'i', 'o', 'u' };
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar una frase/palabra: ");
        String texto = sc.nextLine().toLowerCase(); // Lee la frase o palabra ingresada por el usuario y la convierte a
                                                    // minúsculas
        int cantVocales = 0;
        int cantConsonantes = 0;

        for (char letra : texto.toCharArray()) { // Recorre cada caracter de la cadena de texto
            if (Character.isLetter(letra)) { // Verifica si el caracter es una letra
                if (esVocal(letra, vocales)) {
                    cantVocales++;
                } else {
                    cantConsonantes++;
                }
            }
        }

        System.out.println("Cantidad de vocales: " + cantVocales);
        System.out.println("Cantidad de consonantes: " + cantConsonantes);

        sc.close();
    }

}
