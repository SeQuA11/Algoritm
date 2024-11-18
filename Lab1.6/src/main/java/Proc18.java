import java.text.DecimalFormat;
import java.util.Scanner; // импортируем классы

// Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R (R — вещественное).
// С помощью этой функции найти площади трех кругов с данными радиусами.
// Площадь круга радиуса R вычисляется по формуле S = π·R2. В качестве значения π использовать 3.14.


public class Proc18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        DecimalFormat rounding = new DecimalFormat("#.##"); // Формат в котором записываются вещественные числа

        // Запрашиваем у пользователя три радиуса,
        // присваиваем переменным эти значения,
        // а также через функцию сразу высчитывает их площадь
        System.out.print("Введите первый R: ");
        double circle1 = CircleS(in.nextDouble());
        System.out.print("Введите второй R: ");
        double circle2 = CircleS(in.nextDouble());
        System.out.print("Введите третий R: ");
        double circle3 = CircleS(in.nextDouble());

        System.out.println("Площадь первого круга: " + rounding.format(circle1) );
        System.out.println("Площадь второго круга: " + rounding.format(circle2) );
        System.out.println("Площадь третьего круга: " + rounding.format(circle3) );
    }
    // Метод для высчитывания площади
    public static double CircleS(double r) {
        return Math.PI * r * r;
    }
}