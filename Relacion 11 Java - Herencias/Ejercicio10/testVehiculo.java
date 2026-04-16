package Ejercicio10;

import java.util.Scanner;

public class testVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int km;
        Menu menu = new Menu();
        Coche coche = new Coche();
        Bicicleta bici = new Bicicleta();

        int opc;

        do {
            menu.mostrarMenu();
            opc = teclado.nextInt();
            if (opc > 12 || opc < 0){
                System.out.println("Opcion invalida elija una opcion entre 1 y 11.");
                opc = teclado.nextInt();
            }
            switch (opc) {
                case 1:
                    System.out.println("Introduzca los km que ha andado con la bicicleta: ");
                    km = teclado.nextInt();
                    teclado.nextLine();
                    bici.andar(km);
                    System.out.println("km introducidos correctamente");
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    

                    break;
                case 2: 
                    bici.hacerCaballito();
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    
                    break;
                case 3:
                    System.out.println("Introduzca los km que ha andado con el coche: ");
                    km = teclado.nextInt();
                    teclado.nextLine();
                    coche.andar(km);
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    break;
                case 4:
                    coche.quemaRueda();
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                case 5: 
                    coche.arrancar();
                    System.out.println("Enter para continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;

                case 6:
                    coche.parar();
                    System.out.println("Enter para continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                
                case 8: 
                    System.out.println("Kilometros de la bicicleta: ");
                    System.out.println(bici.getKilometrosRecorridos());
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                
                case 9:
                   System.out.println("Kilometros del coche");
                   System.out.println(coche.getKilometrosRecorridos());
                   System.out.println("Enter Para Continuar");
                   teclado.nextLine();
                   teclado.nextLine();
                   break;

                case 10: 
                    System.out.println(Vehiculo.getKilometrosTotales());
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;

                case 11:
                    System.out.println("Estado del vehiculo: ");

                    if (coche.estaArrancado() == true){
                        System.out.println("El coche está arrancado.");
                    }

                    if (coche.estaArrancado() == false){
                        System.out.println("El coche está parado.");
                    }
                    
                    System.out.println("Enter Para Continuar");
                    break;

                default:
                    if (opc == 12) {
                        System.out.println("Saliendo del programa...");
                        break;
                    }
            }
        } while (opc > 0 && opc < 11);  
        teclado.close();
    }
}
