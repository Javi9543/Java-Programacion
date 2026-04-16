package Ejercicio10;

public class Coche  extends Vehiculo implements Arrancable  {
    //Atributos
    protected boolean estado; 
    
    public Coche(){
        super();
        vehiculosCreados++;
    }
    
    @Override
    public void andar(int km){
        if (estado == true){
            this.KilometrosRecorridos += km;
            KilometrosTotales += this.KilometrosRecorridos;
            System.out.println("km introducidos correctamente");
        } else {
            System.out.println("Primero debe arrancar el coche antes de andar con el.");
        }
        
    }

    public void quemaRueda(){
        System.out.println("Quemando Rueda...");
    }

    @Override
    public void arrancar() {
        if (estado == false) {
            estado = true;
            System.out.println("Coche arrancado.");
        } else {
            System.out.println("Un coche arrancado no puede arrancarse de nuevo.");
        }
        
    }

    @Override
    public void parar() {
        if (estado == true){
            estado = false;
            System.out.println("Parando vehiculo... Pase un buen dia. ");
        } else {
            System.out.println("Un vehiculo parado, no puede pararse de nuevo.");
        }
        
    }

    @Override
    public boolean estaArrancado() {
        return this.estado;
        
    }
 
    
    
}
