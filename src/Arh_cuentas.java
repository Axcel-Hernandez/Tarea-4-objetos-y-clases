public class Arh_cuentas {

    private String DPI;
    private String Correlativo;
    private double Saldo;
    private double Interes;


    public Arh_cuentas(String DPI,String Correlativo,double Saldo, double Interes) {
        this.DPI = DPI;
        this.Correlativo = Correlativo;
        this.Saldo = Saldo;
        this.Interes = Interes;

    }

    public String getDPI() {
        return DPI;
    }
    public String getCorrelativo() {

        return Correlativo;
    }
    public double getSaldo() {

        return Saldo;
    }

    public double getInteres() {

        return Interes;
    }


    public String toString() {

        return "Cuenta:" + "DPI: "+DPI + " ,Correlativo: "+  Correlativo +" ,Saldo actual: " + Saldo + " ,Interes anual actual: " + Interes + "%";

    }

}
