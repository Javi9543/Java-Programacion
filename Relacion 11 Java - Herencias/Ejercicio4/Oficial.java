package Ejercicio4;

public class Oficial extends Operario {
    public Oficial(String nomb){
        super(nomb);
    }

    @Override
    public String toString() {
        return super.toString() + "-> Oficial";
    }
}

