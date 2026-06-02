import java.time.LocalDate;
import java.util.ArrayList;

public class Vuelta {
    //atributos
    private String nombreVuelta;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double distanciaTotal;
    private Ciclista mejorGeneral;
    private Ciclista mejorMontaña;
    private Ciclista mejorJoven;
    private Ciclista mejorPuntos;
    private int posicionEquipo;
    private ArrayList<Etapa> etapas;

    
    //constructor
    public Vuelta(String nombreVuelta, LocalDate fechaInicio, LocalDate fechaFin, double distanciaTotal, Ciclista mejorGeneral, Ciclista mejorMontaña, Ciclista mejorJoven, Ciclista mejorPuntos, int posicionEquipo,
        ArrayList<Etapa> etapas) {
        this.nombreVuelta = nombreVuelta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.distanciaTotal = distanciaTotal;
        this.mejorGeneral = mejorGeneral;
        this.mejorMontaña = mejorMontaña;
        this.mejorJoven = mejorJoven;
        this.mejorPuntos = mejorPuntos;
        this.posicionEquipo = posicionEquipo;
        this.etapas = etapas;
    }

   
    
    //métodos
    public void agregarEtapa(Etapa e){
        if (etapas.contains(e)) {
            System.out.println("La etapa ya existe");
        } else {
            etapas.add(e);
            System.out.println("Etapa añadida con exito");
        }
    }

    public double calcularDistanciaTotal(){
        double dist = 0.0;

        for (int i = 0; i < etapas.size(); i++) {
            Etapa etapa = etapas.get(i);
            dist += etapa.getDistanca();
        }

        return dist;
    }

    public void imprimirInformeGeneral() {
        System.out.println("--- Informe General de la Vuelta ---");
        System.out.println("Vuelta: " + nombreVuelta);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println("Distancia total: " + distanciaTotal + " km");
        
        System.out.println("Mejor general: " + mejorGeneral.getNombreCompleto());
        System.out.println("Mejor montaña: " + mejorMontaña.getNombreCompleto());
        System.out.println("Mejor joven: " + mejorJoven.getNombreCompleto());
        System.out.println("Mejor puntos: " + mejorPuntos.getNombreCompleto());
    }



    public String getNombreVuelta() {
        return nombreVuelta;
    }



    public void setNombreVuelta(String nombreVuelta) {
        this.nombreVuelta = nombreVuelta;
    }



    public LocalDate getFechaInicio() {
        return fechaInicio;
    }



    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }



    public LocalDate getFechaFin() {
        return fechaFin;
    }



    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }



    public double getDistanciaTotal() {
        return distanciaTotal;
    }



    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }



    public Ciclista getMejorGeneral() {
        return mejorGeneral;
    }



    public void setMejorGeneral(Ciclista mejorGeneral) {
        this.mejorGeneral = mejorGeneral;
    }



    public Ciclista getMejorMontaña() {
        return mejorMontaña;
    }



    public void setMejorMontaña(Ciclista mejorMontaña) {
        this.mejorMontaña = mejorMontaña;
    }



    public Ciclista getMejorJoven() {
        return mejorJoven;
    }



    public void setMejorJoven(Ciclista mejorJoven) {
        this.mejorJoven = mejorJoven;
    }



    public Ciclista getMejorPuntos() {
        return mejorPuntos;
    }



    public void setMejorPuntos(Ciclista mejorPuntos) {
        this.mejorPuntos = mejorPuntos;
    }



    public int getPosicionEquipo() {
        return posicionEquipo;
    }



    public void setPosicionEquipo(int posicionEquipo) {
        this.posicionEquipo = posicionEquipo;
    }



    public ArrayList<Etapa> getEtapas() {
        return etapas;
    }



    public void setEtapas(ArrayList<Etapa> etapas) {
        this.etapas = etapas;
    }

    

}
