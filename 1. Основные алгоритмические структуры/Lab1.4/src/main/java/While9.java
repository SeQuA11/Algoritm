import java.util.Scanner; // импортируем класс

public class While9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int K = 0; // переменная для счета количества перемножений 3
        int degree = 3; // переменная для перемножения

        // пока N больше degree, degree умножаем на 3 и прибавляем к К 1 для счета количества перемножений 3
        while (N >= degree) {
            degree *= 3;
            K += 1;
        }
        System.out.println("Наименьшее целое число K равно: " + (K + 1)); // выводим К
    }
}
