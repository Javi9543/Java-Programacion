import Ejercicio4.Empleado;

public class Directivo extends Empleado{

    public Directivo(){
    }

    public Directivo(String nombre) {
        super(nombre);
    }  

    @Override
    public String toString() {
        return "Empleado" + getNombre() + " -> Directivo";
    }
}
