public class T5ejemplo3 {

    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] matrizC = new int[3][3];

        // Multiplicación fila por columna usando 3 bucles for
        for (int i = 0; i < 3; i++) {         // Filas de A y C
            for (int j = 0; j < 3; j++) {     // Columnas de B y C
                for (int k = 0; k < 3; k++) { // Elementos comunes (fila A / columna B)
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Imprimir matriz resultante
        System.out.println("Matriz resultante (A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
