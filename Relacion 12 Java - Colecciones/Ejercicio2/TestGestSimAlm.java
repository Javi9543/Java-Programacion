package Ejercicio2;

import java.util.Scanner;

public class TestGestSimAlm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestSimAlm almacen = new GestSimAlm();
        int opc = 0;
        
        System.out.println("== ALMACEN DE ARTICULOS ==");
        System.out.println("1. Entrada Automatizada");
        System.out.println("2. Alta Articulo");
        System.out.println("3. Baja Articulo");
        System.out.println("4. Entrada Mercancia");
        System.out.println("5. Salida Mercancia");
        System.out.println("6. Salir del programa");

        do {

            System.out.println("Introduzca una opcion: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("== Entrada Automatizada ==");
                    almacen.entradaAutomatizada();
                    System.out.println("Entrada automatizada completada");
                    break;
                case 1:
                    System.out.println("== Listar Almacen ==");
                    almacen.lista();
                    break;

                case 2:
                    System.out.println(" == Alta Articulo ==");
                    System.out.println(" ");

                    System.out.println("Introduzca el codigo del articulo: ");
                    String cod = teclado.nextLine();
                    teclado.next();

                    System.out.println(" ");
                    System.out.println("Introduzca el nombre del articulo: ");
                    String desc = teclado.nextLine();
                    teclado.next();


                    System.out.println(" ");
                    System.out.println("Introduzca el precio de compra: ");
                    float pCompra = teclado.nextFloat();

                    System.out.println(" ");
                    System.out.println("Introduzca el precio de venta: ");
                    float pVenta = teclado.nextFloat();

                    System.out.println(" ");
                    System.out.println("Introduzca el stock del articulo (opcional)");
                    int stock = teclado.nextInt();

                    almacen.altaArticulo(new Articulo(cod, desc, pCompra, pVenta, stock));
                    break;
                case 3: 
                    System.out.println("== Baja Articulo ==");
                    System.out.println("Introduzca el codigo del articulo a eliminar: ");
                    cod = teclado.next();

                    System.out.println("");
                    almacen.bajaArticulo(cod);
                    break;
                case 4: 
                    System.out.println("== Entrada mercancia ==");
                    System.out.println("Introduzca el codigo del articulo: ");
                    cod = teclado.next();

                    System.out.println("");
                    System.out.println("Introduzca la cantidad a añadir: ");
                    int cantidad = teclado.nextInt();
                    almacen.altaMercancia(cod, cantidad);
                    break;
                
                case 5:
                    System.out.println("== Salida de mercancia ==");
                    System.out.println("Introduzca el codigo del articulo: ");
                    cod = teclado.next();

                    System.out.println("");
                    System.out.println("Introduzca la cantidad a eliminar");
                    cantidad = teclado.nextInt();
                    almacen.bajaMercancia(cod, cantidad);

                default:
                    if (opc == 6) {
                        System.out.println("Saliendo del programa...");
                        break;
                    }
            }
        } while (opc < 6);
        teclado.close();
    }
}
