package Ejercicio5;

import java.util.HashSet;

public class Pedido {
    private static int numPedido;
    private TipoComida tipo;
    HashSet<String> ingredientes = new HashSet<String>();

    public Pedido(TipoComida tipo){
        this.tipo = tipo;
        numPedido++;
    }

    public void mostrarPedido(){
        System.out.println("Pedido: " + getTipo());
        System.out.println("ID del pedido: " + getNumeroPedidos());
        if (ingredientes.isEmpty()) {
            System.out.println("Ingredientes extra: Ninguno");
        } else {
            System.out.println("Ingredientes extra: " + getIngredientes());
        }

    }

    public void agregarIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
    }


    public static int getNumeroPedidos() {
        return numPedido;
    }



    public static void setNumPedido(int numPedido) {
        Pedido.numPedido = numPedido;
    }



    public TipoComida getTipo() {
        return tipo;
    }



    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }



    public HashSet<String> getIngredientes() {
        return ingredientes;
    }



    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    

}
