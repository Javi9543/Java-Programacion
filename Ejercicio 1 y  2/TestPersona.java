
public class TestPersona {
    public static void main(String[] args) {
        System.out.println("- Elementos Clase persona -");
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("22222B", 172, 18);
        Ingeniero ingeniero1 = new Ingeniero();
        Ingeniero ingeniero2 = new Ingeniero();
        Iiformatico ingeniero3 = new Iiformatico();


        System.out.println(persona1);
        persona1.comer();
        
        System.out.println(" ");

        
        System.out.println(persona2);
        persona2.hablar();
        
        System.out.println(" ");
        System.out.println(" - Elementos Clase Ingeniero - ");

        System.out.println(ingeniero1);
        ingeniero1.razonar();

        System.out.println(" ");

        System.out.println(ingeniero2);
        ingeniero1.trabajarEnGrupo();

        System.out.println(" ");
        System.out.println("Elementos Clase Ingeniero Informatico");

        System.out.println(ingeniero3);
        ingeniero3.crearPrograma();
    }
}
