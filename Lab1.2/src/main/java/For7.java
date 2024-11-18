import java.util.Scanner; // Библиотека для скана входящей информации

public class For7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число
        int K = in.nextInt(); // 2 входящее число
        var counter = 0; // счетчик для суммы чисел

        for(int i = N; i <= K; i++) { // Перебор всех целых чисел от N до K
            counter += i; // Счетчик суммы чисел
        }
        System.out.println("Сумма чисел:" + counter); // Вывод суммы чисел
    }
}
