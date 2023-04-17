import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_2d {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        float ingreso;// 299000
        int superficie;// 20
        int energia;// 900

        // Ingreso valores yo por teclado.

        System.out.println("Declare su nivel de ingreso: ");
        ingreso = entrada.nextFloat();

        System.out.println("Declare el valor de superficie: ");
        superficie = entrada.nextInt();

        System.out.println("Declare el consumo de energía: ");
        energia = entrada.nextInt();

        if (ingreso <= 748382.07 && superficie <= 30 && energia <= 3330){
            System.out.println("ES DE CATEGORIA A");
        }else if(ingreso <= 1112459.83 && superficie <=45 && energia <= 5000){
            System.out.println("ES DE CATEGORIA B");
        }
    }
}
