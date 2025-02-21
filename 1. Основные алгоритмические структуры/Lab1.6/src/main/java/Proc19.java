import java.text.DecimalFormat;
import java.util.Scanner; // импортируем классы

// Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R (R — вещественное).
// С помощью этой функции найти площади трех кругов с данными радиусами.
// Площадь круга радиуса R вычисляется по формуле S = π·R2. В качестве значения π использовать 3.14.


public class Proc19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        DecimalFormat rounding = new DecimalFormat("#.##"); // Формат в котором записываются вещественные числа

        System.out.print("Введите N колец: ");
        int country = in.nextInt(); // Запрашиваем у пользователя количество колец

        // Также через функцию сразу высчитывает разноость площадей с условием
        while (country > 0) {
            double ring = CircleS(Math.random() * 10, Math.random() * 10);
            if (ring > 0) {
                System.out.println(rounding.format(ring));
                country -= 1;
            }
        }
    }
    // Метод для высчитывания площади
    public static double CircleS(double r1, double r2) {
        double ring = 0;
        if (r1 > r2) {
            ring = (Math.PI * r1 * r1) - (Math.PI * r2 * r2);
        }
        return ring;
    }
}
