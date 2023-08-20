public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número secreto: ");
        int num = sc.nextInt();
        
        int vida, rp;
        boolean fl = false;
        vida = 0;
        do {
            vida++;
            System.out.println("Vida:" + vida + "\t¿Cuál es el número?");
            rp = sc.nextInt();
            if (rp == num) {
                fl = true;
                break;
            }

        } while (vida < 3 && !fl);
        
        if (fl) {
            System.out.println("¡Adivinaste el número secreto!");
        } else {
            System.out.println("Ups, perdiste. El número secreto era: " + numeroSecreto);
        }
        
        sc.close();
    }
}