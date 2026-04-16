package Ejercicio8;

public abstract class Publicacion {
    protected String isbn; 
    protected String titulo;
    protected int annoPub;

    public Publicacion(String isbn, String titulo, int annoPub){
        this.isbn = isbn;
        this.titulo = titulo;
        this.annoPub = annoPub;
    }

    public Publicacion() {
        
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnnoPub() {
        return annoPub;
    }

    
}
