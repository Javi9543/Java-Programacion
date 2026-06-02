public class Medico extends PersonalTecnico {
    private static int totalMedicos = 0;
    private String especialidadMedica;
    private boolean licenciaMedica;

    //constructor
    public Medico(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono, int anyosExp, String especialidadTecnica, String especialidadMedica, boolean licenciaMedica) {
        super(nomb, ape, nacionalidad, equipo, email, telefono, anyosExp, especialidadTecnica);
        this.especialidadMedica = especialidadMedica;
        this.licenciaMedica = licenciaMedica;
        totalMedicos++;
    }

    //métodos

    public String getEspecialidadMedica(){
        return especialidadMedica;
    }

    public boolean isLicenciaMedica() {
        return licenciaMedica;
    }

    public static int getGetTotalMedicos() {
        return totalMedicos;
    }

    @Override
    public String getRol() {
        return "Medico";
    }
    
}
