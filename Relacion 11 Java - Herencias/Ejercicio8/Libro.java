package Ejercicio8;

public class Libro extends Publicacion implements Prestable{

    protected boolean prestado;
    protected String estado;
    public Libro(String isbn, String titulo, int annoPub) {
        super(isbn, titulo, annoPub);
        prestado = false;
    }

    public Libro() {
    }
    
    @Override
    public void presta() {
        if (prestado == false){
            prestado = true;
        } else{
            System.out.println("Lo siento ese libro ya esta prestado");
        }
        
    }

    @Override
    public void devuelve() {
        if (prestado == true) {
            prestado = false;
        }
        
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }


    @Override
    public String toString() {
        String cadena;

        if ( prestado == true) {
            cadena = "(prestado)";
        } else {
            cadena = "(no prestado)";
        }

        return "ISBN: " + getIsbn() + " Titulo: " + getTitulo() + ", " + " Año publicacion: " + getAnnoPub() + cadena;
    }



    
}
