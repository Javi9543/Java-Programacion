import Ejercicio4.Empleado;

public abstract class Operario extends Empleado {
    //Atributos

    //constructor por defecto
    public Operario(){
    }
    
    //constructor con parámetros
    public Operario(String nombre) {
        super(nombre);
    }

    //metodos
    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> Operario";
    }
    
    
}
