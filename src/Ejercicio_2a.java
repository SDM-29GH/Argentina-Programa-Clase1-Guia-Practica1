import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_2a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        float ingresoTotalMensual;
        int cantVehiculos;
        int cantInmuebles;
        int cantEmbarcaciones;
        int cantAeronaves;
        int cantActivoSocietario;

        //Categorías: Ingresos Altos, Ingresos Medios, Ingresos Menores

        System.out.println("Ingrese su Ingreso Total Mensual");
        ingresoTotalMensual = entrada.nextFloat();
        System.out.println("Ingrese cantidad de vehículos: ");
        cantVehiculos = entrada.nextInt();
        System.out.println("Ingrese cantidad de Inmuebles: ");
        cantInmuebles = entrada.nextInt();
        System.out.println("Ingrese cantidad de embarcaciones: ");
        cantEmbarcaciones = entrada.nextInt();
        System.out.println("Ingrese cantidad de Aeronaves: ");
        cantAeronaves = entrada.nextInt();
        System.out.println("Ingrese cantidad de Activos Societarios");
        cantActivoSocietario = entrada.nextInt();


        if (ingresoTotalMensual >= 572386.50 && cantVehiculos >= 3 && cantInmuebles >= 3 && cantEmbarcaciones <= 1 && cantAeronaves <= 1 && cantActivoSocietario >= 1){
            System.out.println("Está dentro de la categoría de INGRESO ALTO");
        }else if (ingresoTotalMensual > 177063 && ingresoTotalMensual < 572386.50 && cantVehiculos <= 1 && cantInmuebles <= 2 && cantEmbarcaciones == 0 && cantAeronaves == 0){
            System.out.println("Está dentro de la categoría de INGRESO MEDIO");
        }else if (ingresoTotalMensual < 177063 && cantInmuebles <= 1 && cantVehiculos <= 1){
            System.out.println("Está dentro de la categoría de MENOR INGRESO");
        }

    }
}
