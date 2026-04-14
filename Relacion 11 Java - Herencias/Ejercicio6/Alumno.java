package Ejercicio6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Alumno extends Persona {
    //Atributos
    protected String grupo;
    protected double notaMedia;

    //Constructores
    public Alumno(){
    }

    public Alumno(String nombre, String apellidos, GregorianCalendar fechaNacim, String grupo, double notaMedia){
        super(nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    //metodos
    @Override
    public void mostrar(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formatoFecha.format(this.fechaNacim.getTime());

        System.out.println("-- Datos Alumno --");
        System.out.println("Nombre: " + nombre + " Apellidos: " + apellidos + " fecha nacimiento: " + fecha + " grupo: " + grupo + " Nota Media: " + notaMedia);
    }



    
}
