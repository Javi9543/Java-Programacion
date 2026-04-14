import Ejercicio4.Operario;

public class Tecnico extends Operario {
    //Atributos

    //Constructor por defecto
    public Tecnico() {
    }

    //Constructor con parámetros
    public Tecnico(String nombre) {
        super(nombre);
    }  
    
    //metodos
    @Override
    public String toString() {
        return super.toString() + "-> Tecnico";
    }

}
