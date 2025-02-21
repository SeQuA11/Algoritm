import java.util.Scanner; // Библиотека для скана входящей информации

public class For27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        System.out.print("Введите значение X: ");
        double x = in.nextDouble();
        System.out.print("Введите значение N: ");
        int n = in.nextInt();

        double sum = x;
        double term = x;
        int factorial = 1;

        // Цикл for выполняется N раз (от 1 до N).
        //factorial умножается на (2 * i - 1), чтобы вычислить факториал (1 * 3 * 5 * … * (2 * i - 1)).
        //term умножается на x * x * factorial и делится на (2 * i) * (2 * i + 1), чтобы получить текущий член ряда.
        //term добавляется к sum, чтобы получить сумму всех членов ряда.
        for (int i = 1; i <= n; i++) {
            factorial *= (2 * i - 1); // Вычисляем факториал (1 * 3 * 5 * ... * (2 * i - 1))
            term = term * x * x * factorial / ((2 * i) * (2 * i + 1)); // Вычисляем текущий член ряда
            sum += term;
        }

        System.out.println("Приближенное значение arcsin(X) = " + sum);
    }
}
