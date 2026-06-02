public class DirectorDeportivo {
    //atributos
    private static int totalDirectoresDeportivos = 0;
    private int numVictorias;
    private String areaCompetitiva;

    public DirectorDeportivo(int numVictorias, String areaCompetitiva) {
        this.numVictorias = numVictorias;
        this.areaCompetitiva = areaCompetitiva;
        totalDirectoresDeportivos++;
    }

    public int getNumVictorias() {
        return numVictorias;
    }
    
    public String getAreaCompetitiva() {
        return areaCompetitiva;
    }

    public static int getTotalDirectoresDeportivos() {
        return totalDirectoresDeportivos;
    }
}
