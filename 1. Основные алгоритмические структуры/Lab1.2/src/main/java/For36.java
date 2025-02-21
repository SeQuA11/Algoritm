import java.util.Scanner; // Библиотека для скана входящей информации

public class For36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        double N = in.nextInt(); // 1 входящее число
        double K = in.nextInt(); // 2 входящее число
        double sum = 0.0; // переменная для сложения чисел

        for(int i = 1; i <= N; i++) { // Перебор всех целых чисел от 0 до N
            sum += (int) Math.pow(i, K); // Счетчик суммы N и i возведенных во 2 степень
        }
        System.out.println("Сумма: " + sum); // Вывод суммы чисел
    }
}
