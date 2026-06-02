import java.util.Arrays;

public class ProductoMain {
    public static void main(String[] args) {

        Producto[] tienda = new Producto[5];
        tienda[0] = new Producto("Filtro Cónico K&N", 45.99);
        tienda[1] = new Producto("Escape Deportivo Magnaflow", 350.00);
        tienda[2] = new Producto("Suspensión Roscada Tein", 850.50);
        tienda[3] = new Producto("Válvula de Descarga Blow-Off HKS", 120.00);
        tienda[4] = new Producto("Turbo Garret GT35", 1250.00);

        /* 
        System.out.println("-- Array original --");
        for (int i = 0; i < tienda.length; i++) {
            System.out.println(tienda[i]);
        }

        System.out.println(" ");
        */

        System.out.println(" -- Array Ordenado -- ");

        Arrays.sort(tienda);

        for (int i = 0; i < tienda.length; i++) {
            System.out.println(tienda[i]);
        }
    }
}
