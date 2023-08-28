public class CuentaBanco {
    private String titular;
    private double cantidad;

    public CuentaBanco(String titular){
        this.titular = titular;
        this.cantidad = 0; 
    }

    public CuentaBanco(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void setTitu(String Titu){
        this.titular = Titu;
    }

    public String getTitu(){
        return titular;
    }

    public void setCanti(double Canti){
        this.cantidad = Canti;
    }

    public double getCanti(){
        return cantidad;
    }

    public String toString() {
        return "Titular: "+titular+" , Cantidad: "+cantidad;
    }

    public void IngreCanti(double InCan){
        if(InCan > 0){
            this.cantidad += InCan;
        }else{
            System.out.println("Cantidad Incorrecta");
        }
    }

    public void RetiCanti(double ReCan){
        if(ReCan > 0){
            if(this.cantidad - cantidad < 0){
                this.cantidad = 0;
            }else{
            this.cantidad -= ReCan;
            }
        }
    }
}

