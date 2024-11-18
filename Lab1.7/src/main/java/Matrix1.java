import java.util.Arrays;
import java.util.Random;

public class Matrix1 {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        // 1. Создаем матрицы
        int[][] matrixA = createMatrix(rows, cols);
        int[][] matrixB = createMatrix(rows, cols);

        // 2. Выводим матрицы
        System.out.println("Матрица A:");
        printMatrix(matrixA);
        System.out.println("\nМатрица B:");
        printMatrix(matrixB);

        // 3. Преобразования
        System.out.println("\nСумма матриц A и B:");
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        printMatrix(sumMatrix);

        System.out.println("\nОтражение матрицы A относительно главной диагонали:");
        int[][] reflectedMatrix = reflectMatrix(matrixA);
        printMatrix(reflectedMatrix);

        System.out.println("\nПроизведение матриц A и B:");
        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
        printMatrix(productMatrix);
    }

    // Создаем матрицу с случайными значениями
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt() * 10; // Значения от 0 до 10
            }
        }
        return matrix;
    }

    // Выводим матрицу на консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Складываем две матрицы
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Отражаем квадратную матрицу относительно главной диагонали
    public static int[][] reflectMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    // Перемножаем две матрицы
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы.");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
