package Ejercicio2;

public class Articulo {
    //Atributos
    private String codigo;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private int stock;

    //metodo constructor
    public Articulo(String cod, String desc, float pCompra, float pVenta, int stock){
        this.codigo = cod;
        this.descripcion = desc;
        this.precioCompra = pCompra;
        this.precioVenta = pVenta;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Codigo de articulo: " + getCodigo() + " Articulo: " + getDescripcion() + " Precio Compra: " + getPrecioCompra() + " Precio Venta: " + getPrecioVenta() + " Stock del articulo: " + getStock();
    }
}
