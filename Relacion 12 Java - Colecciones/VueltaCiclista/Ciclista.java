public class Ciclista extends MiembroEquipo {
    //Atributos
    private static int totalCiclistas = 0;
    private int dorsal;
    private Categoria categoria;
    private String especialidad;
    private int anoNacimiento;


    //constructor
        public Ciclista(String nomb, String ape, Nacionalidad nacionalidad, Equipo equipo, String email, String telefono,
        int dorsal, Categoria categoria, String especialidad, int anoNacimiento) {
        super(nomb, ape, nacionalidad, equipo, email, telefono);
        this.dorsal = dorsal;
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.anoNacimiento = anoNacimiento;
        totalCiclistas++;
    }

    //metodos
    public int getDorsal() {
        return dorsal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public static int getTotalCiclistas() {
        return totalCiclistas;
    }

    @Override
    public String getRol() {
        return "Ciclista";
    }
}
