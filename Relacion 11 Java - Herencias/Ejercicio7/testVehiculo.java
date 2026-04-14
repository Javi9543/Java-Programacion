package Ejercicio7;

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
                    System.out.println("km introducidos correctamente");
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    break;
                case 4:
                    coche.quemaRueda();
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                case 5: 
                    System.out.println(bici.getKilometrosRecorridos());
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                
                case 6:
                   System.out.println(coche.getKilometrosRecorridos());
                   System.out.println("Enter Para Continuar");
                   teclado.nextLine();
                   teclado.nextLine();
                   break;

                case 7: 
                    System.out.println(Vehiculo.getKilometrosTotales());
                    System.out.println("Enter Para Continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                default:
                    if (opc == 8) {
                        System.out.println("Saliendo del programa...");
                        break;
                    }
            }
        } while (opc > 0 && opc < 8);  
        teclado.close();
    }
}
