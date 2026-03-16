package Ejercicio2;

import java.util.ArrayList;

public class AlmArticulo {
    //Atributos de la clase
    ArrayList<Articulo> almacen;
    //metodo constructor
    public AlmArticulo(){ //en este caso el constructor sirve para inicializar el arrayList
        this.almacen = new ArrayList<>();
    }

    //metodos
    public void almacena(Articulo articulo){
        if (articulo != null) {
             this.almacen.add(articulo);
        } else {
            System.out.println("No se pueden almacenar articulos sin un nombre");
        }
       
    }

    public int totalArticulos(){
        return almacen.size();
    }
    
}
