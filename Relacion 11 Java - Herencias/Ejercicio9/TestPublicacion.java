import java.util.ArrayList;

public class TestPublicacion {
    public static void main(String[] args) {
        System.out.println( " - Nuestros Libros y Revistas - ");

        /* Defino el arraylist para añadir los objetos que creo */
        ArrayList <Publicacion> publicaciones = new ArrayList<Publicacion>();

        /* Creo los objetos */
        Publicacion libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
        Publicacion libro2 = new Libro("112233", "Los Otros", 2016);
        Publicacion libro3 = new Libro("456789", "La rosa del mundo", 1995);
        Publicacion revista1 = new Revista("444555", "Año Cero", 2019, 344);
        Publicacion revista2 = new Revista("002244", "National Geographic", 2003, 255);
        
        /* Añado los objetos al arraylist de manera desordenada */
        publicaciones.add(libro1);
        publicaciones.add(libro2);
        publicaciones.add(libro3);
        publicaciones.add(revista1);
        publicaciones.add(revista2);

        /*  
        Con el siguiente metodo, ordeno el arraylist con este metodo que al poner null,
        se encarga de ordenar los elementos de un arraylist usando el compareTo
        de la superclase "publicacion" 
        */

        publicaciones.sort(null); 
                        
        /* Muestro el arraylist ordenado */
        for (Publicacion p : publicaciones) {
            System.out.println(" ");
            System.out.println(p);
        }

    }
}
