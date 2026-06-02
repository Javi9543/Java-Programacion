import java.util.ArrayList;

public class Equipo {
    private String codigo;
    private String nombre;
    private Nacionalidad nacionalidad;
    JefeEquipo jefeEquipo;
    ArrayList<Ciclista> ciclistas;
    ArrayList<PersonalTecnico> personalTecnico;
    ArrayList<PersonalAdministrativo> personalAdministrativo;

    public Equipo(String codigo, String nombre, Nacionalidad nacionalidad, JefeEquipo jefeEquipo, 
        ArrayList<Ciclista> ciclistas, 
        ArrayList<PersonalTecnico> personalTecnico,
        ArrayList<PersonalAdministrativo> personalAdministrativo) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.jefeEquipo = jefeEquipo;
        this.ciclistas = ciclistas;
        this.personalTecnico = personalTecnico;
        this.personalAdministrativo = personalAdministrativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public JefeEquipo getJefeEquipo() {
        return jefeEquipo;
    }

    public void agregarCiclista(Ciclista ciclista){
        if(ciclistas.contains(ciclista)) {
            System.out.println("No se pudo añadir al tecnico");
        } else {
            this.ciclistas.add(ciclista);
            System.out.println("Tecnico Añadido");
        }
    }    

    public void agregarPersonalTecnico(PersonalTecnico personal){
        if(personalTecnico.contains(personal)) {
            System.out.println("No se pudo añadir al tecnico");
        } else {
            this.personalTecnico.add(personal);
            System.out.println("Tecnico Añadido");
        }
    }

    public void agregarAdministrativo(PersonalAdministrativo administrativo){
        if (personalAdministrativo.contains(administrativo)) {
            System.out.println("No se pudo añadir al administrativo");
        } else {
            this.personalAdministrativo.add(administrativo);
            System.out.println("TAdministrativo Añadido");
        }
    }

    public int getTotalMiembrosDeEquipo(){

        int totCliclistas = ciclistas.size();
        int totAdmins = personalAdministrativo.size();
        int totTecnicos = personalTecnico.size();

        int total = totAdmins +  totTecnicos + totCliclistas;
        
        return total;
    }


    public void imprimirInformeCiclistas(){
        System.out.println("=== Informe Ciclistas ===");

        for (int i = 0; i < ciclistas.size(); i++) {
            Ciclista c = ciclistas.get(i);

            System.out.println((i + 1) + c.toString());
        }
    }
    
    public void imprimirInformeTecnicos(){
        System.out.println("=== Informe Ciclistas ===");

        for (int i = 0; i < personalTecnico.size(); i++) {
            PersonalTecnico pT = personalTecnico.get(i);

            System.out.println((i + 1) + pT.toString());
        }
    }

    public void imprimirInformeAdministrativos(){
        System.out.println("=== Informe Administrativos ===");

        for (int i = 0; i < personalAdministrativo.size(); i++) {
            PersonalAdministrativo pA = personalAdministrativo.get(i);

            System.out.println((i + 1) + pA.toString());
        }
    }
    
    @Override
    public String toString() {
        // 
        return "--- Datos del equipo " + getNombre() + " --- \n" + 
                "Codigo Equipo: " + getCodigo() + "\n" + 
                "Nombre Equipo: " + getNombre() + "\n" +
                "Nacionalidad: " + getNacionalidad() + "\n" +
                "Jefe Equipo: " + getJefeEquipo() + "\n" + 
                "Total Miembros del equipo " + getTotalMiembrosDeEquipo();
    }
    
}