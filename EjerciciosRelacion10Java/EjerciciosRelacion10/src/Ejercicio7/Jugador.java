package Ejercicio7;

public class Jugador {
    //Atributos
    private String nombre;
    private int edad;
    public  int ranking;
    private int victorias;
    private int derrotas;
    private int setsGanados;
    private int setsPerdidos;
    private static int numJugadores;

    //metodo constructor
    public Jugador(String nombre, int edad, int ranking){
        this.nombre = nombre;
        this.edad = edad;
        this.ranking = ranking;
        this.victorias = 0;
        this.derrotas = 0;
        numJugadores++;
    }

    //metodos: 

    public void actualizarSets(int setsGanados, int setsPerdidos){
        this.setsGanados += setsGanados;
        this.setsPerdidos += setsPerdidos;

        if (setsGanados > setsPerdidos){
            this.victorias++;
        } else {
            this.derrotas++;
        }
        
    }

    public void añadirRanking(int ranking){
        this.ranking = ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getSetsGanados() {
        return setsGanados;
    }

    public void setSetsGanados(int setsGanados) {
        this.setsGanados = setsGanados;
    }

    public int getSetsPerdidos() {
        return setsPerdidos;
    }

    public void setSetsPerdidos(int setsPerdidos) {
        this.setsPerdidos = setsPerdidos;
    }

    public int getRanking() {
        return ranking;
    }

    public static int getNumJugadores() {
        return numJugadores;
    }

    @Override
    public String toString(){
        return " Nombre " + getNombre() + " edad: " + getEdad() + " Victorias:  " + getVictorias() + " Derrotas: " + getDerrotas() + " ranking: " + getRanking() + "º";
    }
}
