package Ejercicio8;

public class ObrerosProd {
    //Atributos
    private String[] nombres = new String[20];
    private int[][] produccion = new int[20][6];
    private int[] totMes = new int[6];
    private int [] totProd = new int[20];
    private int toTotProduccion;
    
    //Metodos

    public void setProduccion(int[][] produccion) {
        this.produccion = produccion;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public void calcularTotProd(){ //esto calcula la produccion total de un trabajador, inicio el toTotproducción a 0 y luego con un for voy calculando la produccion total de cada trabajador
        toTotProduccion = 0;
        for (int i = 0; i < 20; i++) {
            toTotProduccion += totProd[i];
        }
    }

    public void calcularTotMes(){ //con esto calculo el total de cada mes (por eso empieza en j y termina en i, para que lea primero por filas y al final de cada fila, añada el total de) y 
        for (int j = 0; j < 6; j++) {
            totMes[j] = 0;
            for (int i = 0; i < 20; i++) {
                totMes[j] += produccion[i][j];
            }
        }
    }

    public void calculartoTotProd(){ //con este bucle, recorro todas las producciones de cada trabajador, y en el segundo bucle, voy calculando el total de cada mes, calculo todos los totales, de cada trabajador.
        for (int i = 0; i < 20; i++) {
            totProd[i] = 0;
            for (int j = 0; j < 6; j++) {
                totProd[i] += produccion[i][j];
            }
        }
    }

    public String[] getNombres() {
        return nombres;
    }

    public int[][] getProduccion() {
        return produccion;
    }

    public int getToTotProduccion() {
        return toTotProduccion;
    }

    public int[] getTotMes() {
        return totMes;
    }

    public int[] getTotProd() {
        return totProd;
    }
}
