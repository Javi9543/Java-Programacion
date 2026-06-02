public class Mecanico extends PersonalTecnico {
    //Atributos
    private static int totalMecanicos = 0;
    private String especialidadBicicleta;
    private boolean certificadoUCI;

    //constructor

    public Mecanico(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono,
        int anyosExp, String especialidadTecnica, String especialidadBicicleta, boolean certificadoUCI) {
        super(nomb, ape, nacionalidad, equipo, email, telefono, anyosExp, especialidadTecnica);
        this.especialidadBicicleta = especialidadBicicleta;
        this.certificadoUCI = certificadoUCI;
        totalMecanicos++;
    }
      
    //metodos
    public String getEspecialidadBicileta(){
        return especialidadBicicleta;
    }

    public boolean isCertificadoUCI(){
        if (certificadoUCI) {
            return true;
        }

        return false;
    }

    public static int getTotalMecanicos(){
        return totalMecanicos;
    }

    @Override
    public String getRol() {
        return "Mecanico";
    }
}

