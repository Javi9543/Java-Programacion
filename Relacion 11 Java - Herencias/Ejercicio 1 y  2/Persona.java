public class Persona{
    private String nif;
    private int altura;
    private int edad;

    // Constructor por defecto

    public Persona() {
        this.nif = "11111111A";
        this.altura = 175;
        this.edad = 25;
    }
    
    // Constructor para el main
    public Persona (String nif,  int altura, int edad) {
        this.nif = nif;
        this.altura = altura;
        this.edad = edad;
    }

    public void hablar(){
        System.out.println("Hablando...");
    }

    public void comer(){
        System.out.println("Comiendo...");
    }

    //getters y setters 
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return getEdad() + " Años, " + "NIF: " +  getNif() + " " +  getAltura() + " cm de altura" ;
    }
    
}