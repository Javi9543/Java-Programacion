package Ejercicio6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Profesor extends Persona {
    //Atributos
    protected String salario;
    protected String especialidad;

    //Constructores
    public Profesor(){
    }

    public Profesor (String nombre, String Apellidos, GregorianCalendar fechaNacim, String salario, String especialidad){
        super(nombre, Apellidos, fechaNacim);
        this.salario = salario;
        this.especialidad = especialidad;
    }

    //metodos

    @Override
    public void mostrar(){
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha2 = fecha .format(this.fechaNacim.getTime());
        System.out.println("-- Datos Profesor--");
        System.out.println("Nombre: " + nombre + " Apellidos: " + apellidos + " fecha nacimiento: " + fecha2 + " Especialidad: " + especialidad + " Salario: " + salario);
    }
}
