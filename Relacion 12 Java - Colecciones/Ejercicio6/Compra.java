public class Compra {
    //Atributos
    private String nombre;
    private double precio;
    private int cantidad;

    //Método constructor

    public Compra(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    //Métodos de la clase
    public double subtot(){
        return precio * cantidad;
    }

    //metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    
}
