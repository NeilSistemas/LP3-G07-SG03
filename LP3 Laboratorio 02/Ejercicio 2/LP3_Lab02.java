package lp3_lab02;

import java.util.Scanner;

public class LP3_Lab02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PERFIL MEDICO, INGRESE SUS DATOS");
        System.out.println("Ingrese su Primer nombre:");
        String Pnombre = sc.nextLine();
        
        System.out.println("Ingrese su Apellido:");
        String Apellido = sc.nextLine();
        
        System.out.println("Ingrese su Sexo:");
        String Sexo = sc.nextLine();
                
        System.out.println("Ingrese su Dia de Nacimiento:");
        int Dnaci = sc.nextInt();
        
        System.out.println("Ingrese su Mes de Nacimiento:");
        int Mnaci = sc.nextInt();
        
        System.out.println("Ingrese su Ano de Nacimiento:");
        int Anaci = sc.nextInt();
        
        System.out.println("Ingrese su Altura(cm):");
        int Altura = sc.nextInt();
        
        System.out.println("Ingrese su Peso(kg):");
        double Peso = sc.nextDouble();
        
        
        PerfilMedico Perfil1 = new PerfilMedico(Pnombre,Apellido,Sexo,Dnaci,Mnaci,Anaci,Altura,Peso);
        
        System.out.println("Informacion del Paciente");
        System.out.println(Perfil1);
        
        System.out.println("\nEdad: " + Perfil1.CalcularEdad(Anaci) + " anos");
        System.out.println("IMC: " + Perfil1.CalcularIMC());
        System.out.println("Frecuencia Cardiaca Maxima: " + Perfil1.CalcularFMC() + " bpm");
        
        sc.close();
    }
    
}
