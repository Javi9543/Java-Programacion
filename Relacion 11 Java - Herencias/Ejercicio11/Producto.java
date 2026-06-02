public class Producto implements Comparable<Producto>{
    //atributos
    private String nombre;
    private double precio;
    
    //metodo constructor

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //getters y setters
    public String getNombre(){
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //comparable
    @Override
    public int compareTo(Producto p) {
        if (this.getPrecio() > p.getPrecio()) {
            return 1;

        } else if (this.getPrecio() ==  p.getPrecio()) {
            return 0;

        } else {
            return -1;
        }
    }

    @Override
        public String toString() {
            return "Producto: " + getNombre() + " Precio: " + getPrecio();
        }
}

    
