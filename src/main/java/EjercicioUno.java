import java.util.Random;

public class EjercicioUno {
    public static void main(String[] args) {
        // Inicializar el vector de tamaño 100 con números aleatorios entre 1 y 500
        int[] vector = new int[100];
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(500) + 1;
            System.out.println("VECTOR, espacio "+i+ " dato: "+ vector[i]); // imprime vector
        }



        // Crear la matriz de tamaño 35x11
        int[][] matriz = new int[35][11];

        // Colocar en los primeros 100 lugares los datos del vector multiplicados por 3
        for (int i = 0; i < 100; i++) {
            matriz[i / 11][i % 11] = vector[i] * 3;
        }

        // En los siguientes 50 lugares, agregar los datos del vector en forma inversa
        // y sumar las posiciones pares con las impares
        for (int i = 0; i < 50; i++) {
            int sum = vector[99 - (2 * i)] + vector[99 - (2 * i + 1)];
            matriz[(i + 100) / 11][(i + 100) % 11] = sum;
        }

        // En los últimos 150 lugares, agregar los primeros 150 celdas de la matriz pero en forma invertida

        int[] tempArray = new int[150]; // se crea arreglo temporal

        // Se llena el arreglo temporal
        for (int i = 0; i < 150; i++) {
            tempArray[i] = matriz[i / 11][i % 11];
        }

        int totalRows = 35; // Número de filas en la matriz
        int totalCols = 11; // Número de columnas en la matriz
        int totalCells = totalRows * totalCols; // Total de celdas en la matriz
        int startIndex = totalCells - 1; // Índice de la última celda de la matriz (384)

        // Asignar los valores del arreglo temporal en orden inverso a los últimos 150 lugares de la matriz usando i-- (disminuir)
        for (int i = 149; i >= 0; i--) {
            int row = (startIndex - (149 - i)) / totalCols;
            int col = (startIndex - (149 - i)) % totalCols;
            matriz[row][col] = tempArray[i];
        }


        // Mostrar la matriz
        for (int i = 0; i < 35; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

