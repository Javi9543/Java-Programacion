package Ejercicio2;
import java.util.ArrayList;

public class GestSimAlm {
    private ArrayList<Articulo> almacen = new ArrayList<>();

    public void entradaAutomatizada() {
        almacen.add(new Articulo("001", "LLantas BBS", 1500, 2000, 0));
        almacen.add(new Articulo("002", "Volante MOMO", 500, 600,0));
        almacen.add(new Articulo("003", "Caja de cambios 5 velocidades BMW", 800, 900, 0));
        almacen.add(new Articulo("004", "Bucket Momo", 300 , 500, 0));
    }

    public void lista(){
        for (int i = 0; i < almacen.size(); i++) {
            System.out.println(almacen.get(i));
        }
    }

    public void altaArticulo(Articulo nuevArticlo){
        almacen.add(nuevArticlo);
    }

    public void bajaArticulo (String codArticulo){
        almacen.removeIf(a -> a.getCodigo().equals(codArticulo));
        System.out.println("Articulo eliminado de la lista");
    }

    public boolean altaMercancia(String codArticulo, int cantidad){
        for (Articulo art : almacen) {
            if (art.getCodigo().equals(codArticulo)) {
                art.setStock(art.getStock() + cantidad);
                return true;
            }
        }
        return false;
    }

    public String bajaMercancia(String codArticulo, int cantidad){
        for (Articulo art : almacen) {
            if (art.getCodigo().equals(codArticulo)) {
                if (art.getStock()>= cantidad) {
                    art.setStock(art.getStock() - cantidad);
                }
                System.out.println("Cantidad a eliminar de stock aceptada");
                
                return "Se a eliminado el stock introducido correctamente";
            }
            return "No se puede eliminar el stock introducido";
        }
        return "No se ha encontrado el articulo";
    }
}   
