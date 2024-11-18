import java.util.Scanner; // Библиотека для скана входящей информации

public class For2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число
        int K = in.nextInt(); // 2 входящее число
        var counter = 0; // счетчик для количества чисел

        for(int i = N; i <= K; i++) { // Перебор всех целых чисел от N до K
            counter += 1; // Счетчик количества чисел
            System.out.print(i + " "); // Вывод чисел через пробел
        }
        System.out.println("\nКоличество чисел:" + counter); // Вывод количества чисел
    }
}
