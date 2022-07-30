import java.util.Scanner;

public class Centa_1 {

    Scanner lec = new Scanner(System.in);

    public Centa_1() {



    }



public double getIngreso (double Saldo){
        System.out.println ("Saldo: " + Saldo);
        double Ingresar = 1500.50 ;
        System.out.println ("Valor actual a ingresar: " + Ingresar);
        double total = Saldo + Ingresar;
        System.out.println ("Saldo actual: " + total );
        int valor = (int) total;

        return valor;
}

    public double getInteres (double Saldo){
        double Interes = 5.5;
        System.out.println ("Saldo: " + Saldo + " Interes anual: " + Interes );
        Interes = Interes /100;
        double CalculoI = (Saldo*Interes*365)/360 ;
        System.out.println("Valor del interes: " + CalculoI);
        double actualizarSaldo = Saldo + CalculoI;
        System.out.println ("Saldo actual con intereses: " + actualizarSaldo );
        int valor = (int) actualizarSaldo;

        return valor;
    }

    public double getRetiro (double Saldo){

        System.out.println ("Saldo: " + Saldo);
        double retirar = 15000 ;
        System.out.println ("Valor actual a retirar: " + retirar);
        if (Saldo > retirar){
            double total = Saldo - retirar;
            System.out.println ("Saldo actual: " + total );
            int valor = (int) total;
            return valor;

        }
        else  {
                System.out.println ("Saldo insuficiente");
            }

        return Saldo;
    }


}




