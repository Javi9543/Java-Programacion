package Ejercicio5;
public class Restaurante{
    public static void main(String[] args) {
        //Crear Pedido tipo Pizza
        Pedido pedido1 = new Pedido(TipoComida.PIZZA);
        pedido1.agregarIngrediente("Peperoni");
        pedido1.agregarIngrediente("Champiñones");
        pedido1.mostrarPedido();

        //Crear Pedido tipo HAMBURGUESA
        Pedido pedido2 = new Pedido(TipoComida.HAMBURGUESA);
        pedido2.agregarIngrediente("Queso");
        pedido2.mostrarPedido();

        //Crear Pedido tipo ENSALADA
        Pedido pedido3 = new Pedido(TipoComida.ENSALADA);
        pedido3.mostrarPedido();

        //Crear Pedido tipo PASTA
        Pedido pedido4 = new Pedido(TipoComida.PASTA);
        pedido4.agregarIngrediente("Albahaca");
        pedido4.mostrarPedido();

        //Mostrar numero total de pedidos realizados

        System.out.println("Numero Total de pedidos realizados: " + Pedido.getNumeroPedidos());
    }
}