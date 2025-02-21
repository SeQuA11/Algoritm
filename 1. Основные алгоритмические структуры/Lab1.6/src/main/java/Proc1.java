import org.w3c.dom.ls.LSOutput;

import java.util.Scanner; // импортируем класс

 // Описать процедуру PowerA3(A, B), вычисляющую третью степень числа A и возвращающую ее в переменной B (A — входной,
 // B — выходной параметр; оба параметра являются вещественными).
 // Вычислить сумму кубов целых чисел на промежутке от x до y.

public class Proc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите у: ");
        double x = in.nextDouble(); // Переменная для начала промежутка
        System.out.print("Введите x: ");
        double y = in.nextDouble(); // Переменная для конца промежутка
        double sum = 0; // Переменная для подсчета суммы

        // Цикл с промежутком от х до у, где высчитывается сумма кубов чисел на этом промежутке
        for (double i = x; i <= y; i++) {
            sum += PowerA3(i);
        }
        System.out.println("Сумма кубов чисел на промежутке от х до у: " + sum);
    }

    // Метод для возведения в степень
    public static double PowerA3(double A) {
        return Math.pow(A, 3);
    }
}
