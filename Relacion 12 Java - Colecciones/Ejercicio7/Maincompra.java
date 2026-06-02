package Ejercicio7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Maincompra {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Double> productos = new HashMap<>();
        ArrayList<Compra> carrito = new ArrayList<>();

        String elemento; 
        double tot = 0d;
        double descuento = 0d;
        double precio = 0d;
        boolean encontrado = false;
        
        productos.put( "avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        do {
            System.out.println("Producto: ");
            elemento = teclado.next().toLowerCase();

            if (elemento.equals("fin")) {
                break;
            }

            System.out.println("Cantidad del producto: ");
            int cantidad = teclado.nextInt();
            teclado.nextLine();

            for (Compra c : carrito) {
                if (c.getNombre().equals(elemento)) {
                    c.setCantidad(c.getCantidad() + cantidad);
                    encontrado = true;
                }
            }              
            if (!encontrado) {
                precio = productos.get(elemento);
                carrito.add(new Compra(elemento, precio, cantidad));
            }

        } while (!elemento.equals("fin"));

        System.out.println("Introduzca un codigo de descuento (INTRO si no dispone de ninguno): ");
        elemento = teclado.nextLine();

        if (elemento.equals("ECODTO")) {
            descuento = tot * 0.10d;
        }
        
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
        
        for (Compra compra : carrito) {
            tot += compra.subtot();
            System.out.printf("%-5s %5.2f %8d %10.2f\n", compra.getNombre(), compra.getPrecio(), compra.getCantidad(), compra.subtot());
        }
        System.out.println("---------------------------------");
        System.out.printf("Descuento %-5.2f \n", descuento );
        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %-5.2f", tot - descuento);

        teclado.close();
    }
}