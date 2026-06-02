public abstract class PersonalTecnico extends MiembroEquipo {

    //atributos
    private static int totalPersonalTecnico = 0;
    private int anyosExp;
    private String especialidadTecnica;

    //constructor
    public PersonalTecnico(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono, int anyosExp, String especialidadTecnica) {
        super(nomb, ape, nacionalidad, equipo, email, telefono);

        this.anyosExp = anyosExp;
        this.especialidadTecnica = especialidadTecnica;
        totalPersonalTecnico++;
    }
    
    //métodos
    public int getAnyosExp(){
        return anyosExp;
    }

    public String getEspecialidad(){
        return especialidadTecnica;
    }

    public static int getTotalPersonalTecnico(){
        return totalPersonalTecnico;
    }

    public abstract String getRol();
}

