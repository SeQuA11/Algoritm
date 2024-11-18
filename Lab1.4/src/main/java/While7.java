import java.util.Scanner; // импортируем класс

public class While7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int K = 0; // переменная для возведения в квадрат
        int degree = 0; // переменная для числа в квадрате

        // пока N больше degree К умнажаем на К (это квадрат числа К) и потом прибавляем 1 К для следующего числа
        while (N > degree) {
            degree = K * K;
            K += 1;
        }
        System.out.println("Наименьшее целое положительное число K равно: " + ((int) ((float) Math.pow(degree, 0.5))));
        // выводим К
    }
}
