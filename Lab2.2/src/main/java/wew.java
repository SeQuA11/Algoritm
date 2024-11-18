import java.util.Scanner; // импортируем класс

// Описать процедуру PowerA3(A, B), вычисляющую третью степень числа A и возвращающую ее в переменной B (A — входной,
// B — выходной параметр; оба параметра являются вещественными).
// Вычислить сумму кубов целых чисел на промежутке от x до y.

public class wew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        double x = in.nextDouble();
        double y = in.nextDouble();
        double sum = 0;
        for (double i = x; i <= y; i++) {
            sum += PowerA3(i);
        }
    }

    public static double PowerA3(double A) {
        return Math.pow(A, 3);
    }
}
