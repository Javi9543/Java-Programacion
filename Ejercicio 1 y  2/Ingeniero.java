public class Ingeniero extends Persona {

    //métodos
    public void razonar(){
        System.out.println("Razonando Programa...");
    }

    public void trabajarEnGrupo(){
        System.out.println("Trabajando en grupo...");
    }

    @Override
    public String toString() {
        return "NIF: " + getNif() + " Altura " + getAltura() + " Edad: " + getEdad();
    }
}
