package Ejercicio6;

import java.util.GregorianCalendar;

public class testPersona {
    public static void main(String[] args) {
       Alumno al1 = new Alumno("Javier", "Muñoz Parra", new GregorianCalendar(2007, 7, 13), "1º A", 5);
       Profesor pr1 = new Profesor("Raul", "Muñoz Parra", new GregorianCalendar(2002, 2, 19), "2500", "Abogado");

       al1.mostrar();
       pr1.mostrar();
    }
}
