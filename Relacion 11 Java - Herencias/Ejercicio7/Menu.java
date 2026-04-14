package Ejercicio7;

import java.util.ArrayList;

public class Menu{
    //atributos
    private ArrayList<String> menu = new ArrayList<String>();

    //constructor
    public Menu(){
        menu.add("Anda con la bicicleta");
        menu.add("Haz el caballito con la bicileta");
        menu.add("Anda con el coche");
        menu.add("Quema rueda con el coche");
        menu.add("Ver kilometraje bicicleta");
        menu.add("Ver kilometraje coche");
        menu.add("Ver kilometraje total");
        menu.add("Salir");
    }


    public void mostrarMenu(){
        System.out.println("Vehiculos");
        System.out.println("==========");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1 + "." + menu.get(i)));
        }

        System.out.println("Elige una opcion 1 - 8");
    }

}
