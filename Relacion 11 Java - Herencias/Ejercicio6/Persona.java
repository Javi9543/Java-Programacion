package Ejercicio6;

import java.util.GregorianCalendar;

public abstract class Persona {
    //Atributos
    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaNacim;

    //Constructores
    public Persona(){
    }

    public Persona(String nombre, String apellidos, GregorianCalendar fechaNacim) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNacim;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public GregorianCalendar getFechaNacim() {
        return fechaNacim;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacim(GregorianCalendar fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
    
    //metodos
    protected abstract void mostrar();
}
