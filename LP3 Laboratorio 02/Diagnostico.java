
public class Diagnostico {

    public void aptopVacunaA(Perro Fido){
        double Temp = Fido.getTemp();
        double peso = Fido.peso;
        int edad = Fido.getEdad();

        if (Temp >= 37 && Temp < 40 && peso > 5 && edad > 1){
            System.out.println("Perro Sano");
        } else {
            System.out.println("Perro Enfermo");
        }
    }

    public void aptopVacunaB(int edad, double peso, double temp){
        
        if (edad > 1){
            System.out.println("Edad correcta");
        }else {
            System.out.println("Perro no apto para la vacuna B");}
        if ( peso > 5){
            System.out.println("Peso Correcto");
        } else {
            System.out.println("Perro no apto para la vacuna B");}
        if ( temp >= 37 && temp < 40){
            System.out.println("Perro apto para la vacuna B");
        }else {
            System.out.println("Perro no apto para la vacuna B");

        }
    }
}

