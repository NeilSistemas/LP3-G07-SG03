       
package lp3_lab02;

public class PerfilMedico {
    private String PrimerNombre;
    private String Apellido;
    private String Sexo;
    private int diaNaci;
    private int mesNaci;
    private int anoNaci;
    private int altura;
    private double peso;

    public PerfilMedico(String PrimerNombre, String Apellido, String Sexo, int diaNaci, int mesNaci, int anoNaci, int altura, double peso) {
        this.PrimerNombre = PrimerNombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.diaNaci = diaNaci;
        this.mesNaci = mesNaci;
        this.anoNaci = anoNaci;
        this.altura = altura;
        this.peso = peso;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getDiaNaci() {
        return diaNaci;
    }

    public void setDiaNaci(int diaNaci) {
        this.diaNaci = diaNaci;
    }

    public int getMesNaci() {
        return mesNaci;
    }

    public void setMesNaci(int mesNaci) {
        this.mesNaci = mesNaci;
    }

    public int getAnoNaci() {
        return anoNaci;
    }

    public void setAnoNaci(int anoNaci) {
        this.anoNaci = anoNaci;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "PerfilMedico{" + "PrimerNombre = " + PrimerNombre + ", Apellido = " + Apellido + ", Sexo = " + Sexo + ", Dia de Nacimiento = " + diaNaci + ", Mes de Nacimiento = " + mesNaci + ", Ano de Nacimiento = " + anoNaci + ", altura = " + altura + ", peso = " + peso + '}';
    }
        
    public int CalcularEdad(int anoNaci){
        int edad = 2023 - anoNaci;
        return edad;
    }
    
    public double CalcularFMC(){
        double FMC = 208 - 0.7 * CalcularEdad(anoNaci);
        return FMC;
    }
    
    public double CalcularIMC(){
        double IMC = this.peso / this.altura;
        return IMC;
    }
    
}
