public class MatrixOperations {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        Matrix matrixA = new Matrix(rows, cols);
        matrixA.fillRandom();
        Matrix matrixB = new Matrix(rows, cols);
        matrixB.fillRandom();

        System.out.println("Матрица A:");
        matrixA.print();
        System.out.println("\nМатрица B:");
        matrixB.print();

        System.out.println("\nСумма матриц A и B:");
        Matrix sumMatrix = matrixA.add(matrixB);
        sumMatrix.print();

        System.out.println("\nОтражение матрицы A:");
        Matrix reflectedMatrix = matrixA.reflect();
        reflectedMatrix.print();

        System.out.println("\nПроизведение матриц A и B:");
        Matrix productMatrix = matrixA.multiply(matrixB);
        productMatrix.print();
    }
}
