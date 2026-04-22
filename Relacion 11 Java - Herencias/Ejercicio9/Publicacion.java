public abstract class Publicacion implements Comparable <Publicacion>{
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

    /* Este metodo compareTo, sirve para comparar el titulo de la clase con el titulo
    del objeto */
    @Override
    public int compareTo(Publicacion p) {
       return this.titulo.compareTo(p.getTitulo());
    }

    
    
}
