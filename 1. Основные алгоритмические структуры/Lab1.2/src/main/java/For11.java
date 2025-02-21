import java.util.Scanner; // Библиотека для скана входящей информации

public class For11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число
        int sum = 0; // переменная для сложения чисел

        for(int i = 0; i <= N; i++) { // Перебор всех целых чисел от 0 до N
            sum += (int) Math.pow(N + i, 2); // Счетчик суммы N и i возведенных во 2 степень чисел
        }
        System.out.println("Сумма: " + (int) (sum + Math.pow(2*N, 2))); // Вывод суммы чисел
    }
}
