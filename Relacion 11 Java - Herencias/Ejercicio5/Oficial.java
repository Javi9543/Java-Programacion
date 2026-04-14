import Ejercicio4.Operario;

public class Oficial extends Operario {
    //Atributos

    //constructor por defecto
    public Oficial() {
    }
    
    //Constructor con parámetros
    public Oficial(String nombre) {
        super(nombre);
    }  
    
    //métodos
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
    
 
}
