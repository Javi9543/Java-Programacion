public abstract class PersonalAdministrativo extends MiembroEquipo {
    //atributos
    private static int totalPersonalAdministrativo;
    private String puesto;
    private String departamento;
    
    //constructor

    public PersonalAdministrativo(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono, String puesto, String departamento) {
        super(nomb, ape, nacionalidad, equipo, email, telefono);
        this.puesto = puesto;
        this.departamento = departamento;
        totalPersonalAdministrativo++;
    }

    //métodos
    public String getPuesto() {
        return puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public static int getTotalPersonalAdministrativo() {
        return totalPersonalAdministrativo;
    }
}
