import java.util.Scanner;

public class Centa_2 {




    Scanner lec = new Scanner(System.in);

    public Centa_2() {



    }



    public double getIngreso (double Saldo){
        System.out.println ("Saldo: " + Saldo);
        double Ingresar = 3000 ;
        System.out.println ("Valor actual a ingresar: " + Ingresar);
        double total = Saldo + Ingresar;
        System.out.println ("Saldo actual: " + total );
        int valor = (int) total;

        return valor;
    }

    public double getInteres (double Saldo){
        double Interes = 50;
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
        double retirar = 9000 ;
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
