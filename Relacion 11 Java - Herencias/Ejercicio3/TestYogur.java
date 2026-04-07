package Ejercicio3;

public class TestYogur {
    public static void main(String[] args) {
        Yogur griego = new Yogur();
        YogurDesnatado frutas = new YogurDesnatado();

        System.out.println("Calorias de un yogur normal: " + griego.getCaloria());
        System.out.println("Las Calorias de un yogur desnatado son de: " + frutas.getCaloria());
    }
}
