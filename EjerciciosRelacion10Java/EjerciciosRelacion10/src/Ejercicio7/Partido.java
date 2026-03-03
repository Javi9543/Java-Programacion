package Ejercicio7;

public class Partido {
    //Atributos
    private Jugador jugador1;
    private Jugador jugador2;
    public int setsjugador1;
    public int setsjugador2;
    private boolean resultadoRegistrado;

    //metodo constructor

    public Partido(Jugador jugador1, Jugador jugador2, int setsjugador1, int setsjugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.setsjugador1 = 0;
        this.setsjugador2 = 0;
    }

    public void resultadoRegistrado(int setsjugador1, int setsjugador2){
        if (resultadoRegistrado == false) {
            this.setsjugador1 = setsjugador1;
            this.setsjugador2 = setsjugador2;
            resultadoRegistrado = true;

            jugador1.actualizarSets(setsjugador1, setsjugador2);
            jugador2.actualizarSets(setsjugador2, setsjugador1);
            System.out.println("El resultado se ha guardado correctamente");
        } else {
            System.out.println("El partido aún no se ha jugado");
        }
    }

    public String descripcion(){
        return "El partido ha terminado con: " + jugador1.getNombre() + " " + setsjugador1 + " | " + jugador2.getNombre() + " " + setsjugador2;
    }
    
    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public int getSetsjugador1() {
        return setsjugador1;
    }

    public void setSetsjugador1(int setsjugador1) {
        this.setsjugador1 = setsjugador1;
    }

    public int getSetsjugador1(int setsjugador1) {
        return setsjugador1;
    }
    

    public int getSetsjugador2(int setsjugador2) {
        return setsjugador2;
    }

    public void setSetsjugador2(int setsjugador2) {
        this.setsjugador2 = setsjugador2;
    }

}
