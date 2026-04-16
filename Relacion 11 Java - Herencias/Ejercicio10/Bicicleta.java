package Ejercicio10;

public class Bicicleta extends Vehiculo{
    
    public Bicicleta(){
        super();
        vehiculosCreados++;
    }

    public void hacerCaballito(){
        System.out.println("La bicileta hace el caballito");
    }

    @Override
    public void andar(int km) {
        this.KilometrosRecorridos += km;
        KilometrosTotales += KilometrosRecorridos;
    }
}
