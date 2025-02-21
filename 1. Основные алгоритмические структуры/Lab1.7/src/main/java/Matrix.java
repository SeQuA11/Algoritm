import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private double[][] data;

    public Matrix(int rows, int cols) {
        data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this.data = data;
    }

    public int getRows() {
        return data.length;
    }

    public int getCols() {
        return data[0].length;
    }

    public double[][] getData() {
        return data;
    }

    public void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = random.nextInt(-101, 101);
            }
        }
    }


    public void print() {
        for (double[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }

    public Matrix add(Matrix other) {
        if (this.getRows() != other.getRows() || this.getCols() != other.getCols()) {
            throw new IllegalArgumentException("Матрицы должны быть одинакового размера.");
        }
        int rows = this.getRows();
        int cols = this.getCols();
        double[][] resultData = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(resultData);
    }

    public Matrix reflect() {
        if (this.getRows() != this.getCols()) {
            throw new IllegalArgumentException("Матрица должна быть квадратной.");
        }
        int size = this.getRows();
        double[][] resultData = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultData[i][j] = this.data[j][i];
            }
        }
        return new Matrix(resultData);
    }

    public Matrix multiply(Matrix other) {
        if (this.getCols() != other.getRows()) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы.");
        }
        int rowsA = this.getRows();
        int colsA = this.getCols();
        int colsB = other.getCols();
        double[][] resultData = new double[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultData[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(resultData);
    }
}
