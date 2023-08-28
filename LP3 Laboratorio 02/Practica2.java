import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Perro Fido = new Perro();
        Fido.setRaza("Chihuahua");
        Fido.setColor("Marron");

        System.out.println(Fido.getRaza());
        System.out.println(Fido.getColor());

        Perro Fido1 = new Perro("Chihuahua","Marron", 37, 1, 0.5);

        System.out.println(Fido);

        Fido.increEdad(2);

        Perro Pelusa = new Perro();
        Pelusa.setRaza("Pequines");
        Pelusa.setColor("Blanco");

        System.out.println(Pelusa.getRaza());
        System.out.println(Pelusa.getColor());

        Perro Pelusa1 = new Perro("Pequines","Blanco", 37, 1, 0.5);

        Pelusa.increEdad(5);

        System.out.println(Pelusa);

        Diagnostico D1 = new Diagnostico();
        D1.aptopVacunaA(Fido);
        
        Diagnostico D2 = new Diagnostico();
        D2.aptopVacunaA(Pelusa);

        Diagnostico D3 = new Diagnostico();
        D3.aptopVacunaB(4, 10, 41);

        Scanner Ingresar = new Scanner(System.in);

        System.out.println("Ingresar la temperatura: ");
        double temperatura = Ingresar.nextDouble();
        Fido.setTemp(temperatura);

        System.out.println("Ingresar la edad: ");
        int edad = Ingresar.nextInt();
        Fido.setEdad(edad);

        System.out.println("Ingresar el peso: ");
        double peso = Ingresar.nextDouble();
        Fido.peso = peso;

        Diagnostico P1 = new Diagnostico();
        P1.aptopVacunaA(Fido);

        System.out.println("Ingresar la temperatura: ");
        double temperatura2 = Ingresar.nextDouble();
        Pelusa.setTemp(temperatura2);

        System.out.println("Ingresar la edad: ");
        int edad2 = Ingresar.nextInt();
        Pelusa.setEdad(edad2);

        System.out.println("Ingresar el peso: ");
        double peso2 = Ingresar.nextDouble();
        Pelusa.peso = peso2;

        Diagnostico P2 = new Diagnostico();
        P2.aptopVacunaA(Pelusa);

    }
}
