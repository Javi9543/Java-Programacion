package Ejercicio3;

public class Yogur {

    protected double caloria = 120.5;

    public double getCaloria() {
        return caloria;
    }

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }

    @Override
    public String toString() {
        return "Las calorias del yogur normal son de: " + getCaloria();
    }
    

    
}