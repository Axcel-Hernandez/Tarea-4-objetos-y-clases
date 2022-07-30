
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        System.out.println("Escoga una opción de cuenta para gestionar");

        int exit = 0;
        int opcion = 0;

        Centa_1 in = new Centa_1();
        Scanner entrada = new Scanner(System.in);
        while (exit != 1) {
            System.out.println(" Menu:");
            System.out.println(" 1. Cuenta de 1. ");
            System.out.println(" 2. Cuenta de 2. ");
            System.out.println(" 3. Cuenta de 3.");
            System.out.println(" 4. Salir.");
            System.out.println("Ingrese opcion:");
            try {
                opcion = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
                entrada = new Scanner(System.in);
            }
            switch (opcion) {
                case 1 -> {
                    String DPI = ("5321690874235");
                    String Correlativo = ("100012");
                    double Saldo= 8000;
                    double Interes = 5.5;
                    Arh_cuentas a = new Arh_cuentas(DPI, Correlativo, Saldo, Interes);
                    System.out.println(a.toString());
                    Interes = in.getInteres(Saldo);
                    Saldo = Interes;
                    double Ingresar = in.getIngreso(Saldo);
                    Saldo =Ingresar;
                    double retiro = in.getRetiro(Saldo);
                    Saldo = retiro;
                    Interes = 5.5;
                    Arh_cuentas b = new Arh_cuentas(DPI, Correlativo, Saldo, Interes);
                    System.out.println(b.toString());




                }
                case 2 -> {
                    String DPI = ("8934251038764");
                    String Correlativo = ("100025");
                    double Saldo= 25000;
                    double Interes = 50;
                    Arh_cuentas a = new Arh_cuentas(DPI, Correlativo, Saldo, Interes);
                    System.out.println(a.toString());
                    Interes = in.getInteres(Saldo);
                    Saldo = Interes;
                    double Ingresar = in.getIngreso(Saldo);
                    Saldo =Ingresar;
                    double retiro = in.getRetiro(Saldo);
                    Saldo = retiro;
                    Interes = 50;
                    Arh_cuentas b = new Arh_cuentas(DPI, Correlativo, Saldo, Interes);
                    System.out.println(b.toString());

                }
                case 3 -> {
                    String DPI = ("741235682310256");
                    String Correlativo = ("100034");
                    double Saldo= 10000;
                    double Interes = 10;
                    Arh_cuentas a = new Arh_cuentas(DPI, Correlativo, Saldo, Interes);
                    System.out.println(a.toString());
                    Interes = in.getInteres(Saldo);
                    Saldo = Interes;
                    double Ingresar = in.getIngreso(Saldo);
                    Saldo =Ingresar;
                    double retiro = in.getRetiro(Saldo);
                    Saldo = retiro;
                    Interes = 10;
                    Arh_cuentas b = new Arh_cuentas(DPI, Correlativo, Saldo, Interes);
                    System.out.println(b.toString());
                }
                case 4 -> {
                    System.out.println("Hasta la proxima");
                    exit = 1;
                }

            }





        }
    }
}

