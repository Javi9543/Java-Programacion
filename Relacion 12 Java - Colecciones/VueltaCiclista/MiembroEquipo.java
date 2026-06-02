public abstract class MiembroEquipo {

    //Atributos
    private static int totalMiembros = 0;
    private String nombre;
    private String apellidos;
    private Nacionalidad nacionalidad;
    private Equipo equipo;
    private String email;
    private String telefono;

    //Constructor
    public MiembroEquipo(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono){
        this.nombre = nomb;
        this.apellidos = ape;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.email = email;
        this.telefono = telefono;
        totalMiembros++;
    }

    //getters y setters

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //métodos

    @Override
    public String toString() {
        return "Nombre Completo "+ getNombreCompleto() + " Nacionalidad " + getNacionalidad() + " Email " + getEmail() + " Telefono: " + getTelefono();
    }

    public static int getTotalMiembros(){
        return totalMiembros;
    }

    public String getNombreCompleto(){
        return nombre + " "  + apellidos;
    }

    public abstract String getRol();

}
