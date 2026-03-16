package Ejercicio4;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashSet<Integer> numeros = new HashSet<Integer>();
        int suma  = 0;
        
        System.out.println("Introduzca 5 numeros para sumar su total");

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca  un numero: ");
            int n = teclado.nextInt();
            numeros.add(n);
        }
        System.out.println("Lista de numeros añadidos: " + numeros) ;

        for (Integer i : numeros) {
            suma += i;
        }
        
        System.out.println("El total de la suma de los numeros es de: " + suma);
        
        teclado.close();
    }
}
