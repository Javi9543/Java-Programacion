package Ejercicio4;

public class Tecnico extends Operario {

    public Tecnico(String nomb) {
        super(nomb);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
    
}
