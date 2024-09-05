import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjercicioCuatro {



    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Leer y validar la primera cadena
            String cadena1;
            do {
                System.out.print("Ingresa la primera cadena (debe contener un número): ");
                cadena1 = reader.readLine();
            } while (!contieneNumeros(cadena1));

            // Leer y validar la segunda cadena
            String cadena2;
            do {
                System.out.print("Ingresa la segunda cadena (debe contener un número): ");
                cadena2 = reader.readLine();
            } while (!contieneNumeros(cadena2));

            // Mostrar las cadenas ingresadas
            System.out.println("Primera cadena: " + cadena1);
            System.out.println("Segunda cadena: " + cadena2);
            System.out.println("******************************************");


            // Extraer y mostrar los números de las cadenas
            String numerosCadena1 = extraerNumeros(cadena1);
            String numerosCadena2 = extraerNumeros(cadena2);

            System.out.println("Números en la primera cadena: " + numerosCadena1);
            System.out.println("Números en la segunda cadena: " + numerosCadena2);
            System.out.println("******************************************");



            // Verificar si los números extraídos son narcisistas
            int num1 = Integer.parseInt(numerosCadena1);
            int num2 = Integer.parseInt(numerosCadena2);

            boolean esNarcisista1 = esNumeroNarcisista(num1);
            boolean esNarcisista2 = esNumeroNarcisista(num2);

            // Mostrar los resultados
            if (esNarcisista1 && esNarcisista2) {
                int sumaNarcisistas = num1 + num2;
                System.out.println("Ambos números son narcisistas.");
                System.out.println("La suma de los números narcisistas es: " + sumaNarcisistas);
            } else if (!esNarcisista1 && !esNarcisista2){
                System.out.println("Los números " + num1 + " " + num2 + " no son narcisistas.");
//                if (!esNarcisista1) {
//                    System.out.println("El número " + num1 + " no es narcisista.");
//                }
//                if (!esNarcisista2) {
//                    System.out.println("El número " + num2 + " no es narcisista.");
//                }
            } else {
                if (!esNarcisista1){
                    System.out.println("El número " + num1 + " no es narcisista.");
                    System.out.println("Pero el número " + num2 + " si es narcisista.");
                }
                if (!esNarcisista2){
                    System.out.println("El número " + num2 + " no es narcisista.");
                    System.out.println("Pero el número " + num1 + " si es narcisista.");
                }

            }


        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer las cadenas.");
            e.printStackTrace();
        }  catch (NumberFormatException e) {
            System.out.println("No se pudieron convertir los números extraídos.");
        }
    }


        // Método para verificar si una cadena contiene al menos un número
        public static boolean contieneNumeros(String cadena) {
            for (char c : cadena.toCharArray()) {
                if (Character.isDigit(c)) {
                    return true; // La cadena contiene al menos un número
                }
            }
            System.out.println("La cadena no contiene números. Intenta nuevamente.");
            return false;
        }


    // Método para extraer los números de una cadena
    public static String extraerNumeros(String cadena) {
        StringBuilder numeros = new StringBuilder();

        for (char c : cadena.toCharArray()) {
            if (Character.isDigit(c)) {
                numeros.append(c); // Agregar el dígito a la cadena de números
            }
        }

        return numeros.toString(); // Devolver los números como una cadena
    }

    // Método para verificar si un número es narcisista
    public static boolean esNumeroNarcisista(int numero) {
        String numStr = Integer.toString(numero);
        int numeroDeDigitos = numStr.length();
        int suma = 0;

        for (char c : numStr.toCharArray()) {
            int digito = Character.getNumericValue(c);
            suma += Math.pow(digito, numeroDeDigitos); // Elevar cada dígito a la potencia del número de dígitos
        }

        return suma == numero;
    }





}
