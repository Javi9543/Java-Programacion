package Ejercicio1;

import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        Menu juego = new Menu();
        Scanner teclado = new Scanner(System.in);

        juego.crearOpcion("Iniciar Partida");
        juego.crearOpcion("Cargar Partida");
        juego.crearOpcion("Salir");

        juego.muestraMenu();

        System.out.println("Introduzca una opcion: ");
        int opc = teclado.nextInt();

        juego.capturaOpcion(opc);

        teclado.close();
    }
}
