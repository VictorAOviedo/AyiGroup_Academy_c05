import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioDos {

    public static int deRomanoAEntero(String romano) {

        Map<Character, Integer> numerosRomanos = new HashMap<>();

        numerosRomanos.put('I', 1);
        numerosRomanos.put('V', 5);
        numerosRomanos.put('X', 10);
        numerosRomanos.put('L', 50);
        numerosRomanos.put('C', 100);
        numerosRomanos.put('D', 500);
        numerosRomanos.put('M', 1000);


        int resultado = 0;
        int longitud = romano.length();

        for (int i = 0; i < longitud; i++) {
            // Valor del símbolo actual
            int valorActual = numerosRomanos.get(romano.charAt(i));

            // Valor del siguiente símbolo (si existe)
            if (i + 1 < longitud) {
                int valorSiguiente = numerosRomanos.get(romano.charAt(i + 1));

                // Si el valor actual es menor que el siguiente, restamos, sino sumamos
                if (valorActual < valorSiguiente) {
                    resultado -= valorActual;
                } else {
                    resultado += valorActual; // resulktado = resu + actual
                }
            } else {
                resultado += valorActual;
            }
        }

        return resultado;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número romano
        System.out.print("Ingrese un número romano: ");
        String numeroRomano = scanner.nextLine().toUpperCase();

        // Convertir el número romano a entero y mostrar el resultado
        try {
            int numeroEntero = deRomanoAEntero(numeroRomano);
            System.out.println("El número en entero es: " + numeroEntero);
        } catch (Exception e ){
            System.out.println("Entrada invalida");
        }finally {
            scanner.close();
        }



    }
}
