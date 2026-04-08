package Ejercicio3;
public class YogurDesnatado extends Yogur {

    public YogurDesnatado(){
        setCaloria(getCaloria() / 2);
    }

    @Override
    public String toString() {
        return "El yogur desnatado tiene " + getCaloria();
    }
}
