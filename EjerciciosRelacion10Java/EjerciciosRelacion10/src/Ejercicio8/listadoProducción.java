package Ejercicio8;

import java.util.Scanner;

public class listadoProducción {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);;
        ObrerosProd produccion = new ObrerosProd();
       
       
        //Introducir nombres y producciones al array
        String[] nombre = new String[20];
        int[][] prod = new int[20][6];

        System.out.println("Introduzca los nombres de los obreros: ");

        for (int i = 0; i < 20; i++) {
            System.out.println("nombre empleado " + i);
            nombre[i] = teclado.next();
            for (int j = 0; j < 6; j++) {
                System.out.println("Introduzca la produccion de cada mes del obrero " + i + ": ");
                prod[i][j] = teclado.nextInt();
            }
        }

        //mando los nombres al array de la clase ObrerosProd
        
        produccion.setNombres(nombre);
        produccion.setProduccion(prod);

        //Calculo de las producciones
        produccion.calcularTotProd();
        produccion.calcularTotMes();
        produccion.calculartoTotProd();

        //Mostrar tabla de producciones por obrero
        System.out.println("\n -- REPORTE SEMESTRAL DE PRODUCCIÓN -- ");
        System.out.printf("%-15s %-4s %-4s %-4s %-4s %-4s %-4s %-5s\n", 
                          "OBRERO", "M1", "M2", "M3", "M4", "M5", "M6", "TOT");

        for (int i = 0; i < 20; i++) {
            System.out.printf("%-15s ", produccion.getNombres()[i]);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%-4d ", produccion.getProduccion()[i][j]);
            }
            System.out.printf("%-5d\n", produccion.getTotProd()[i]);
        }
        
        System.out.print("TOTAL           "); 
        for (int j = 0; j < 6; j++) {
            System.out.printf("%-5d ", produccion.getTotMes()[j]);
        }
        System.out.printf("%-8d\n", produccion.getToTotProduccion());
        teclado.close();
    }
}
