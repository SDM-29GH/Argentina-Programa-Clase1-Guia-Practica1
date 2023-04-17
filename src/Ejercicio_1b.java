// 1. Vamos a practicar operaciones básicas con números
//b. A lo anterior, solo muestre números pares

public class Ejercicio_1b {

    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        System.out.println("***** NUMERO PAR EN LA CONSOLA ****");
        while (numeroInicio <= numeroFin){
            if (numeroInicio % 2 == 0){
                System.out.println("El número "+numeroInicio+ " es PAR");
            }
            numeroInicio++;
        }
    }
}
