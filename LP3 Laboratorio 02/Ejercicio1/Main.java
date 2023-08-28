import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Ingrese el nombre del titular: ");
        String RegTi = sc.nextLine();
        
        System.out.println("Ingrese la cantidad a ingresar(opcional): ");
        double RegCa = sc.nextDouble();

        CuentaBanco cuenta1 = new CuentaBanco(RegTi, RegCa);

        System.out.println("Informacion de la Cuenta: ");
        System.out.println(cuenta1);

        int opc;

        do{
            System.out.println("MENU CUENTA BANCO ");
            System.out.println("1: Ingresar Dinero ");
            System.out.println("2: Retirar Dinero ");
            System.out.println("3: Mostrar Saldo Actual ");
            System.out.println("4: Salir ");
            System.out.println("Selecciones una opcion: ");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Selecciono la opcion 1 ");
                    System.out.println("Escribra la cantidad a ingresar");
                    double CanIng = sc.nextDouble();
                    cuenta1.IngreCanti(CanIng);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Selecciono la opcion 2 ");
                    System.out.println("Escribra la cantidad a retirar");
                    double CanRe = sc.nextDouble();
                    cuenta1.RetiCanti(CanRe);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Selecciono la opcion 3 ");
                    System.out.println("Su saldo Actual es: "+cuenta1.getCanti());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Selecciono la opcion 4 ");
                    System.out.println("Adios!"); 
                    break;
                default:
                    System.out.println("Opcion Invalida, vuelva a ingrear"); 
            }

        }while(opc != 4);

        sc.close();

    }
}
