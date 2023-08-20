public class Principal {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        rp = sc.nextInt();
        do {
            vida++;
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;

        } while (vida < 3 && !fl);
        
        if (fl)
            System.out.println("Adivinaste!!!!! ");
        else
            System.out.println("Ups, perdiste...");
        
        sc.close();
    }
}