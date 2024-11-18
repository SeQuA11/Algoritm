import java.util.Scanner; // Библиотека для скана входящей информации

public class For10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число
        double sum = 0.0; // переменная с вещественным числом

        for(float i = 1; i <= N; i++) { // Перебор всех целых чисел от 1 до N, так как на 0 делить нельзя
            sum += (1.0 / i); // Счетчик суммы чисел
        }
        System.out.println("Сумма: " + sum); // Вывод суммы чисел
    }
}
