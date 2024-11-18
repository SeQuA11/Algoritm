import java.util.Scanner; // импортируем класс

 // Описать процедуру Mean(X, Y, AMean, GMean), вычисляющую среднее арифметическое AMean = (X+Y)/2
 // и среднее геометрическое GMean = (X·Y)1/2 двух положительных чисел X и Y (X и Y — входные,
 // AMean и GMean — выходные параметры вещественного типа). С помощью этой процедуры найти среднее арифметическое и
 // среднее геометрическое для пар (A, B), (A, C), (A, D), если даны A, B, C, D.

public class Proc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите A: ");
        double A = in.nextByte(); // Переменная для числа А
        System.out.print("Введите B: ");
        double B = in.nextByte(); // Переменная для числа В
        System.out.print("Введите C: ");
        double C = in.nextByte(); // Переменная для числа С
        System.out.print("Введите D: ");
        double D = in.nextByte(); // Переменная для числа D

        System.out.println("Cреднее арифметическое и среднее геометрическое для (A, B): ");
        System.out.println(Mean(A, B));
        System.out.println("Cреднее арифметическое и среднее геометрическое для (A, C): ");
        System.out.println(Mean(A, C));
        System.out.println("Cреднее арифметическое и среднее геометрическое для (A, D): ");
        System.out.println(Mean(A, D));
    }

    // Метод высчитывающий среднее арифметическое и среднее геометрическое для чисел
    public static String Mean(double X, double Y) {
        double AMean = 0.5 * (X + Y);
        double BMean = Math.sqrt(X + Y);
        return "Cреднее арифметическое: " + AMean + "\nCреднее геометрическое: " + BMean;
    }
}
