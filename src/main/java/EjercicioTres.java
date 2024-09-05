import java.util.Scanner;

public class EjercicioTres {
    // Arreglos para almacenar las representaciones romanas y sus valores correspondientes
    private static final int[] values = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    private static final String[] romanNumerals = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    // Método que convierte un entero en número romano
    public static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        // Iteramos a través de los valores romanos más altos a los más bajos
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(romanNumerals[i]);
                num -= values[i]; // Restamos el valor romano a num
            }
        }
        return roman.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Bucle para asegurar que el usuario ingrese un número válido
        do {
            System.out.print("Ingrese un número entre 1 y 3000: ");
            while (!scanner.hasNextInt()) { // Verifica que el usuario ingrese un número entero
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next(); // Descartar la entrada inválida
                System.out.print("Ingrese un número entre 1 y 3000: ");
            }
            number = scanner.nextInt();

            if (number < 1 || number > 3000) {
                System.out.println("El número debe estar entre 1 y 3000. Inténtelo de nuevo.");
            }
        } while (number < 1 || number > 3000); // Repetir hasta que se ingrese un número válido


        // Convertimos el número entero a romano
        String roman = intToRoman(number);
        System.out.println("El número romano equivalente es: " + roman);
    }









//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingrese un número entre 1 y 3000: ");
//
//        try {
//            int number = scanner.nextInt();
//            // Validamos que el número esté en el rango permitido
//
//            if (number < 1 || number > 3000) {
//                System.out.println("El número debe estar entre 1 y 3000.");
//            } else {
//                String roman = intToRoman(number);
//                System.out.println("El número romano equivalente es: " + roman);
//            }
//        }catch (Exception e){
//            System.out.println("Digito invalido");
//        }finally {
//            scanner.close();
//        }
//
//    }
}
