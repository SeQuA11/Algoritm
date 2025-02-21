import java.util.Scanner;

/**
 * Нахождение периметров треугольников ABC и BCD, с помощью известных сторон AC, AB и CD и данной фигуры
 */
public class Figure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Выделяем место в памяти и создаем объект для метода Scanner
        System.out.print("Введите длину стороны AB: ");
        double AB = in.nextDouble(); // Создаем переменную и присваиваем ей вписанное пользователем значение
        System.out.print("Введите длину стороны AC: ");
        double AC = in.nextDouble(); // Создаем переменную и присваиваем ей вписанное пользователем значение
        System.out.print("Введите длину стороны CD: ");
        double CD = in.nextDouble(); // Создаем переменную и присваиваем ей вписанное пользователем значение

        double BC = getHypotenuse(AB, AC); // Создаем переменную и присваиваем значение полученное из метода getHypotenuse
        double BD = getHypotenuse(BC, CD); // Создаем переменную и присваиваем значение полученное из метода getHypotenuse

        System.out.print("Периметр треугольника ABC равен: ");
        System.out.println(getPerimeterTriangle(AB, BC, AC)); // Выводим значения полученные из метода getPerimeterTriangle
        System.out.print("Периметр треугольника BCD равен: ");
        System.out.println(getPerimeterTriangle(BD, BC, CD)); // Выводим значения полученные из метода getPerimeterTriangle
    }

    /**
     * Метод принимающий два вещественных числа, являющимися катетами прямоугольного треугольника,
     * и высчитывающий гипотенузу этого треугольника с помощью формулы и оператора Math
     */
    public static double getHypotenuse(double x, double y) {return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));}

    /**
     * Метод принимающий три вещественных числа, являющимися сторонами прямоугольного треугольника,
     * и высчитывающий периметр этого треугольника путем сложения этих сторон
     */
    public static double getPerimeterTriangle(double x, double y, double z) {return x + y + z;}
}
