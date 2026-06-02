public class Fisioterapeuta extends PersonalTecnico {
    //Atributos
    private static int totalFisioterapeutas = 0;
    private String tipoTratamiento;
    private int sesionesSemanales;
    

    //constructor
    public Fisioterapeuta(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email,
        String telefono, int anyosExp, String especialidadTecnica, String tipoTratamiento, int sesionesSemanales) {
        super(nomb, ape, nacionalidad, equipo, email, telefono, anyosExp, especialidadTecnica);
        this.tipoTratamiento = tipoTratamiento;
        this.sesionesSemanales = sesionesSemanales;
        totalFisioterapeutas++;
    }

    //métodos
    public String tipoTratamiento(){
        return tipoTratamiento;
    }

    public int getSesionesSemanales(){
        return sesionesSemanales;
    }

    public static int getTotalFisioterapeutas(){
        return totalFisioterapeutas;
    }

    @Override
    public String getRol() {
       return "Fisioterapeuta";
    }
}
