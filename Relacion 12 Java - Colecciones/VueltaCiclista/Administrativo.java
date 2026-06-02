public class Administrativo extends MiembroEquipo{
    //atributos
    private static int totalAdministrativos = 0;
    private String funcion;
    private String horario;
        
    //constructor

    public Administrativo(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono, String funcion, String horario) {
        super(nomb, ape, nacionalidad, equipo, email, telefono);
        this.funcion = funcion;
        this.horario = horario;
        totalAdministrativos++;
    }
    
    //métodos

    public String getFuncion() {
        return funcion;
    }

    public String getHorario() {
        return horario;
    }

    public static int getTotalAdministrativos() {
        return totalAdministrativos;
    }

    @Override
    public String getRol() {
        return "Administratvo";
    }

}
