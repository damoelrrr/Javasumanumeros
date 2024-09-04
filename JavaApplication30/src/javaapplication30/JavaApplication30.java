package javaapplication30;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Daniel Rodriguez
 */
public class JavaApplication30 {
    
    private static String convertirNumeroAPalabras(int numero) {
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                             "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] decenas = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        
        if (numero < 20) {
            return unidades[numero];
        } else if (numero < 100) {
            if (numero % 10 == 0) {
                return decenas[numero / 10];
            } else {
                return decenas[numero / 10] + " y " + unidades[numero % 10];
            }
        } else if (numero == 100) {
            return "cien";
        } else {
            return "Numero fuera de rango";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un número del 0 al 100:");
        int numero1 = scan.nextInt();
        
        System.out.println("Ingrese otro número del 0 al 100:");
        int numero2 = scan.nextInt();
        
        int suma = numero1 + numero2;
        
        String numero1Palabras = convertirNumeroAPalabras(numero1);
        String numero2Palabras = convertirNumeroAPalabras(numero2);
        String sumaPalabras = convertirNumeroAPalabras(suma);
        
        System.out.println("La suma de " + numero1Palabras + " mas " + numero2Palabras + " es " + sumaPalabras);
        System.out.println("The sum of " + numero1Palabras + " plus " + numero2Palabras + " is " + sumaPalabras);
    }
}
