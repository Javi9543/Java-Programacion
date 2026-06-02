public class JefeEquipo extends PersonalAdministrativo {
    //Atributos
    private static int totaJefesEquipo;
    private int aniosJefe;
    private String filosofiaEquipo;

    //constructor
    public JefeEquipo(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono,
        String puesto, String departamento, int aniosJefe, String filosofiaEquipo) {
        super(nomb, ape, nacionalidad, equipo, email, telefono, puesto, departamento);
        this.aniosJefe = aniosJefe;
        this.filosofiaEquipo = filosofiaEquipo;
        totaJefesEquipo++;
    }

    //metodos
    public int getAniosJefe() {
        return aniosJefe;
    }
    public String getFilosofiaEquipo() {
        return filosofiaEquipo;
    }

    public static int getTotaJefesEquipo() {
        return totaJefesEquipo;
    }

    @Override
    public String getRol() {
        return "JefeEquipo";
    }
    
    
}
