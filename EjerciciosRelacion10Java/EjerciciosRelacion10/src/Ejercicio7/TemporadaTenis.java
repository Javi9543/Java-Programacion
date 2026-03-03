package Ejercicio7;

import java.util.Scanner;

public class TemporadaTenis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("Introduzca el nombre del campeonato: ");
        String cNombre = teclado.nextLine();

        System.out.println("Introduzca el numero de jugadores: ");
        int mJugadores = teclado.nextInt();
        teclado.nextLine();

        Campeonato temporada = new Campeonato(cNombre, mJugadores);
        ;
        
        System.out.println("------------------ MENU DE OPCIONES -------------------------- ");
        System.out.println("1 -- Inscribir jugador ");
        System.out.println("2 -- Añadir partido (seleccionando 2 jugadores inscritos).");
        System.out.println("3 -- Registrar resultado de un partido existente.");
        System.out.println("4 -- Mostrar lista de partidos.");
        System.out.println("5 -- Mostrar clasificación actual.");
        System.out.println("6 -- Mostrar estadisticas de jugador");
        System.out.println("7 -- Salir");
        System.out.println("--------------------------------------------------------------");
        do {
            System.out.println("Introduzca una opcion (7 para salir): ");
             opc = teclado.nextInt();
             teclado.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Introduzca el nombre del jugador: ");
                    String nombre = teclado.nextLine();

                    System.out.println("Introduzca la edad del jugador: ");
                    int edad = teclado.nextInt();

                    System.out.println("Introduzca el ranking del jugador: ");
                    int ranking = teclado.nextInt();

                    temporada.inscribirJugador(new Jugador(nombre, edad, ranking ));
                    break;

                case 2:
                    System.out.println("Introduzca el nombre del jugador1 ");
                    String jugador1 = teclado.nextLine();

                    System.out.println("Introduzca el nombre del jugador2 ");
                    String jugador2 = teclado.nextLine();

                    System.out.println("Introduzca los sets ganados por el jugador1: ");
                    int setsjugador1 = teclado.nextInt();

                    System.out.println("Introduzca los sets ganados por el jugador2: ");
                    int setsjugador2 = teclado.nextInt();

                    Jugador j1 = temporada.buscarJugador(jugador1);
                    Jugador j2 = temporada.buscarJugador(jugador2);

                    temporada.inscribirPartidos(new Partido( j1, j2, setsjugador1, setsjugador2));
                    break;
                case 3:
                    System.out.println("Introduce el numero de partido: ");
                    int idxPartido = teclado.nextInt();

                    System.out.println("Introduzca el resultado del primer set: ");
                    int s1 = teclado.nextInt();
                    
                    System.out.println("Introduzca el resultado del segundo set: ");
                    int s2 = teclado.nextInt();

                    temporada.registrarResultado(idxPartido - 1, s1, s2);

                case 4: 
                    System.out.println("-- Mostrar Lista de partidos -- ");
                    temporada.listarPartidos();

                case 6:
                    System.out.println(" -- Estadisticas Jugadores -- ");
                    System.out.println("Introduzca el nombre del jugador a buscar: ");
                    String buscarJug = teclado.next();
                    Jugador estadisticas = temporada.buscarJugador(buscarJug);

                    System.out.println(estadisticas);
                default:
                    if (opc == 7) {
                        System.out.println("Saliendo del Programa...");
                    }
                    break;
            }
        } while (opc > 0 && opc < 7);
        teclado.close();
    }
}   

