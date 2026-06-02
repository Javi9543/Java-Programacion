    import java.time.Duration;
    import java.time.LocalDate;
    import java.util.ArrayList;

    public class Etapa {
        private int numero;
        private LocalDate fecha;
        private String salida;
        private String llegada;
        private double kilometros;
        private static ArrayList<ResultadoEtapa> resultados;

        public Etapa(int numero, LocalDate fecha, String salida, String llegada, double kilometros) {
            this.numero = numero;
            this.fecha = fecha;
            this.salida = salida;
            this.llegada = llegada;
            this.kilometros = kilometros;
            this.resultados = new ArrayList<>();
        }

        public int getNumero() {
            return numero;
        }

        public double getDistanca(){
            return kilometros;
        }
        
        public void agregarResultado(ResultadoEtapa result){
            if (resultados.contains(result)) {
                System.out.println("El resultado ya se ha añadido.");
            } else {
                resultados.add(result);
                System.out.println("Resultado añadido correctamente");
            }
        }

        public void imprimirInforme(){
            System.out.println("--- Resultados --- ");
            System.out.println("Hora de salida: " + salida);
            System.out.println("Hora de llegada: " + llegada);
            System.out.println("Fecha de la etapa: " + fecha);

            for (int i = 0; i < resultados.size(); i++) {
            ResultadoEtapa res = resultados.get(i);
            System.out.println((i + 1) + ". " + res.getCiclista().getNombreCompleto() + " tiempo empleado: " + res.getTiempoFormateado());
            }
        }

        public void formatearDiferencia (Duration d1, Duration d2){
            Duration diferecia = d1.minus(d2);
            long horas = diferecia.toHours();
            long minutos = diferecia.toMinutes();
            long segundos = diferecia.toSeconds();

            System.out.printf("%10d:%10d:%10d", horas, minutos, segundos);
        }
    }
