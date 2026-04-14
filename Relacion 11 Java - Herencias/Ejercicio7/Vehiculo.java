package Ejercicio7;

public abstract class Vehiculo {
    //Atributos
    protected int KilometrosRecorridos;
    protected static int KilometrosTotales;
    protected static int vehiculosCreados;

    public Vehiculo(){
        this.KilometrosRecorridos = 0;
    }

    //getters y setters

    public int getKilometrosRecorridos() {
        return KilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        KilometrosRecorridos = kilometrosRecorridos;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        KilometrosTotales = kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        vehiculosCreados += vehiculosCreados;
    }

    //metodos
    public static int getKilometrosTotales() {
        return KilometrosTotales;
    }

    public void andar(int km){
        this.KilometrosRecorridos += km;
        KilometrosTotales += KilometrosRecorridos;
    }

    
}
