package Ejercicio7;

public class Campeonato {
    private String nombre;
    private Jugador[] jugador;
    private Partido[] partido;
    private int maximoJugadores;
    private int maximoPartidos;
    private int numJugadores = 0;
    private int numPartidos = 0;

    public Campeonato(String nombre, int maximoJugadores){
        this.nombre = nombre;
        this.maximoJugadores = maximoJugadores;
        this.maximoPartidos = maximoJugadores * (maximoJugadores - 1) / 2;
        this.jugador = new Jugador[maximoJugadores];
        this.partido = new Partido[maximoPartidos]; 
    }

    public boolean inscribirJugador(Jugador j){
        if (numJugadores >= maximoJugadores) {
            System.out.println("Capacidad de numero de jugadores alcanzada");
            return false;
        }

         for (int i = 0; i < jugador.length; i++) {
            if (jugador[i] != null && jugador[i].getNombre().equalsIgnoreCase(j.getNombre())) {
                System.out.println("El jugador" + j.getNombre() + " ya esta dentro del campeonato");
            }
        }
        jugador[numJugadores++] = j;
        System.out.println("El jugador ha sido añadido al campeonato " + nombre);
        return true;
    }

    public boolean inscribirPartidos(Partido p){
        if (numPartidos >= maximoPartidos) {
            System.out.println("Se ha llegado al maximo de partidos");
            return false;
        }

        for (int i = 0; i < numPartidos; i++) 
            if (partido[i].equals(p)) {
                System.out.println("El partido introducido, ya está registrado");
                return false;
            }           
        
        partido[numPartidos++] = p;
            System.out.println("El partido ha sido añadido al campeonato: " + nombre);
        return true;
    }

    public void registrarResultado (int indicePartido, int s1, int s2){
        if (indicePartido < 0| indicePartido >= numPartidos) {
            System.out.println("Indice de partido erroneo");
        } else {
            Partido p = partido[indicePartido];
            if (p == null) {
                System.out.println("No hay partido registrado en el indice introducido");
            } else {
                p.resultadoRegistrado(s1, s2);
                System.out.println("Resultado registrado" + p.descripcion());
            }
        }
        
    }

    public void listarPartidos(){
        for (int i = 0; i < numPartidos; i++) {
            System.out.println(i + ": " + partido[i].descripcion());
        }
    }

    public Jugador buscarJugador(String nombre){
        for (int i = 0; i < numJugadores; i++) {
            if (jugador[i].getNombre().equals(nombre)) {
                return jugador[i];
            } 
        }
        System.out.println("El jugador no existe");
        return null;
    }
}