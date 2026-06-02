import java.time.Duration;

public class ResultadoEtapa {
    private Ciclista ciclista;
    private Duration tiempo;

    public ResultadoEtapa(Ciclista ciclista, Duration tiempo){
        this.ciclista = ciclista;
        this.tiempo = tiempo;
    }

    public Ciclista getCiclista() {
        return ciclista;
    }

    public Duration getTiempo() {
        return tiempo;
    }

    public String getTiempoFormateado(){
        long horas = tiempo.toHours();
        long minutos = tiempo.toMinutes();
        long segundos = tiempo.toSeconds();

       return horas + ":" + minutos + ":" + segundos ;
    }

    public int compareTo(ResultadoEtapa resultado){
        long tiempoCiclista1 = this.tiempo.toSeconds();
        long tiempoCliclista2 = this.tiempo.toSeconds();

        if (tiempoCiclista1 > tiempoCliclista2) {
            return -1;
        } else if (tiempoCliclista2 > tiempoCiclista1) {
            return 1;
        } else {
            return 0;
        }
    }


}
