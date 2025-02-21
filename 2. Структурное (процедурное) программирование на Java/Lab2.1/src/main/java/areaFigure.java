import java.util.Scanner; // импортируем класс

public class areaFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        // Запрашиваем у пользователя три радиуса, детали и трёх дырок,
        // присваиваем переменным эти значения,
        // а также через функцию сразу высчитывает их площадь
        System.out.print("Введите R детали: ");
        double circle = areaCircle(in.nextDouble());
        System.out.print("Введите R первой дырки: ");
        double circle1 = areaCircle(in.nextDouble());
        System.out.print("Введите R второй дырки: ");
        double circle2 = areaCircle(in.nextDouble());
        System.out.print("Введите R третьей дырки: ");
        double circle3 = areaCircle(in.nextDouble());

        double sum = circle1 + circle2 + circle3;

        // Проверяем правильность детали
        if (sum < circle) {
            circle -= sum;
            System.out.println(circle);
        } else {
            System.out.println("Деталь не получится :(");
        }
    }
    // Метод для высчитывания площади
    public static double areaCircle(double r) {
        return Math.PI * r * r;
    }
}
