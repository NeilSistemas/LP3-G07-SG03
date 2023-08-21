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
<<<<<<< HEAD
            System.out.println("¡Adivinaste el numero secreto!");
            System.out.println("Felicidades te ganaste un premio: Un pasaje al caribe ");
=======
            System.out.println("Felicidades adivinaste el numero secreto!");
            String premio = Regalo.elegir(vida);
            System.out.println("Ganaste en la "+vida+" oportunidad, por lo tanto te ganaste: "+premio);

>>>>>>> rama2
        } else {
            System.out.println("Ups, perdiste. El número secreto era: " + num);
        }
        
        sc.close();
    }
}