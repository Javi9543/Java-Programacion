public class Asistente extends PersonalTecnico {
    //Atributos
    private static int totalAsistentes = 0;
    private String responsabilidad;
    private boolean puedeViajar;
    //Constructor
    
    public Asistente(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono,
        int anyosExp, String especialidadTecnica, String responsabilidad, boolean puedeViajar) {
        super(nomb, ape, nacionalidad, equipo, email, telefono, anyosExp, especialidadTecnica);
        this.responsabilidad = responsabilidad;
        this.puedeViajar = puedeViajar;
        totalAsistentes++;
    }

    //métodos
    
    public String getResponsabilidad(){
        return responsabilidad;
    }

    public boolean isPuedeViajar(){
        if (puedeViajar) {
            return true;
        }

        return false;
    }

    public static int getTotalAsistentes(){
        return totalAsistentes;
    }

    @Override
    public String getRol() {
        return "Asistente";
    }
}
