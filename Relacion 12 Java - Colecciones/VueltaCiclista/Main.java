import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ciclista> ciclistasEq1 = new ArrayList<>();
        ArrayList<PersonalTecnico> tecnicoEq1 = new ArrayList<>();
        ArrayList<PersonalAdministrativo> adminEq1 = new ArrayList<>();

        JefeEquipo jefe1 = new JefeEquipo("Jefe 1", "Lopez", Nacionalidad.ESPANA, null, "jefe1@iberia.com", "600111222", null, null, 5, "Ganar siempre");

        Equipo eq1 = new Equipo("ESP1", "Team Iberia", Nacionalidad.ESPANA, jefe1, ciclistasEq1, tecnicoEq1, adminEq1);

        Ciclista c1 = new Ciclista("Carlos", "Rodriguez", Nacionalidad.ESPANA, eq1, "carlos@iberia.com", "600123456", 44, Categoria.SENIOR, "Escalador", 2001);
        ciclistasEq1.add(c1);

        ArrayList<Ciclista> ciclistasEq2 = new ArrayList<>();
        ArrayList<PersonalTecnico> tecnicoEq2 = new ArrayList<>();
        ArrayList<PersonalAdministrativo> adminEq2 = new ArrayList<>();

        JefeEquipo jefe2 = new JefeEquipo("Paco", "Hernandez", Nacionalidad.ESPANA, null, "paco@euskadi.com", "600333444", null, null, 10, "Formacion y ataque");

        Equipo eq2 = new Equipo("ESP2", "Euskadi Ciclismo", Nacionalidad.ESPANA, jefe2, ciclistasEq2, tecnicoEq2, adminEq2);

        Ciclista c2 = new Ciclista("Juan", "Ayuso", Nacionalidad.ESPANA, eq2, "juan@euskadi.com", "600654321", 12, Categoria.SENIOR, "Contrarrelojista", 2002);
        ciclistasEq2.add(c2);

        Etapa etapa1 = new Etapa(1, LocalDate.of(2026, 8, 22), "Madrid", "Guadalajara", 145.2);

        ResultadoEtapa r1 = new ResultadoEtapa(c1, Duration.ofHours(3).plusMinutes(42).plusSeconds(10));
        ResultadoEtapa r2 = new ResultadoEtapa(c2, Duration.ofHours(3).plusMinutes(42).plusSeconds(25));

        etapa1.agregarResultado(r1);
        etapa1.agregarResultado(r2);

        ArrayList<Etapa> listaEtapas = new ArrayList<>();
        listaEtapas.add(etapa1);

        Vuelta vuelta = new Vuelta("Vuelta a Espana", LocalDate.of(2026, 8, 22), LocalDate.of(2026, 9, 13), 145.2, c1, c2, c1, c2, 1, listaEtapas);

        System.out.println("Kilometros totales calculados: " + vuelta.calcularDistanciaTotal());
        System.out.println();

        etapa1.imprimirInforme();
        System.out.println();

        vuelta.imprimirInformeGeneral();
    }
}