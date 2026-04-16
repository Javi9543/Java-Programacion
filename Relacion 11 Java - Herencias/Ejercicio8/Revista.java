package Ejercicio8;

public class Revista extends Publicacion implements Prestable {

    protected int numRevista;
    protected boolean estado;

    public Revista(String isbn, String titulo, int annoPub, int numRevista) {
        super(isbn, titulo, annoPub);
        estado = false;
    }

    public Revista() {
    }

    
    public int getNumRevista() {
        return numRevista;
    }

    
    @Override
    public void presta() {
        if (estado == false) {
            estado = true;
        } else {
            System.out.println("Lo siento, esa revista ya esta prestada");
        }
        
    }

    @Override
    public void devuelve() {
    
        if (estado == false) {
            System.out.println("Lo siento, esa revista ya esta prestada");
        } else {
            estado = false;
        }
        
    }

    @Override
    public boolean estaPrestado() {
        return estado;
    }


    @Override
    public String toString() {
        
        return "ISBN: " + getIsbn() + " Titulo: " + getTitulo() + "  año publicacion: " + getAnnoPub();
    }

    
    
    
}
