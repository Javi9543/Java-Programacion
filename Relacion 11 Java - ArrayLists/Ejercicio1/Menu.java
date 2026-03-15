package Ejercicio1;

import java.util.ArrayList;

public class Menu{
    //Atributos de la clase
    private ArrayList<String> menu;

    //metodo constructo

    public Menu(){
        this.menu = new ArrayList<>();
    }

    public void crearOpcion(String opcion){
        menu.add(opcion); // introducir la opcion que introduzca el usuario
        System.out.println("Opcion " + opcion + "creada con exito");
    }
    
    //recorro el array y muestro las opciones del menu y las imprimo con un print 
    // y uso el get para sacar cada opcion del arrayList

    public void muestraMenu(){
        System.out.println("====== MENU DE OPCIONES ======");
        System.out.println(menu.size());
        for (int i = 0; i < menu.size(); i++) { 
            System.out.println((i + 1)+ ". " + menu.get(i));
        }
    }
    // Aqui creo un entero para acceder a la posicion del objeto en el arrayList
    // despues, le digo que a la opcion que introduzca el usuario le reste 1 para que no
    // se salga de la longitud del array, luego con el if compruebo que la opcion intro
    // ducida por el usuario, sea mayor, igual a 0 y que este en la longitud del array
    // si no se cumple, lanzará un mensaje de error en el que dice que la opcion no  existe

    public void capturaOpcion(int opcion){
        int opc = opcion - 1;
        if (opc >= 0 && opc < menu.size()) {
         System.out.println("Opcion seleccionada: " + menu.get(opc));
        } else {
            System.out.println(" - La opcion " + opc + ", no existe en el menu - ");
        }
    }
}