package Ejercicio4;

public class Empleado {
    private String nombre;

    public Empleado(){
        //Esto sirve para que los demás clases hijas no den fallos
    }

    public Empleado(String nomb){
        this.nombre = nomb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre();
    }
    
}
