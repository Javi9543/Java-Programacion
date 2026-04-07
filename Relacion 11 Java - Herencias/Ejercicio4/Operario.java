package Ejercicio4;
public class Operario extends Empleado {

    public Operario(String nomb){
        super(nomb);
    }

    @Override
    public String toString() {
        return super.toString() + "-> Operario";
    }
}
