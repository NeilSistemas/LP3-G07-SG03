import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero secreto: ");
        int num = sc.nextInt();
        
        int vida, rp;
        boolean fl = false;
        vida = 0;
        do {
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cuál es el numero?: ");
            rp = sc.nextInt();
            if (rp == num) {
                fl = true;
                break;
            }

        } while (vida < 3 && !fl);
        
        if (fl) {
            System.out.println("¡Adivinaste el numero secreto!");
            System.out.println("Felicidades te ganaste un premio: Un pasaje al caribe ");
        } else {
            System.out.println("Ups, perdiste. El número secreto era: " + num);
        }
        
        sc.close();
    }
}