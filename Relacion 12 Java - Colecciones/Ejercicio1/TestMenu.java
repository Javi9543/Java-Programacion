package Ejercicio1;

public class TestMenu {
    public static void main(String[] args) {
        Menu juego = new Menu();

        juego.crearOpcion("Iniciar Partida");
        juego.crearOpcion("Cargar Partida");
        juego.crearOpcion("Salir");

        juego.muestraMenu();

        juego.capturaOpcion(1);
        juego.capturaOpcion(2);
        juego.capturaOpcion(3);
        juego.capturaOpcion(4);
    }
}
