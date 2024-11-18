import java.util.Scanner; // Библиотека для скана входящей информации

public class For8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число
        int K = in.nextInt(); // 2 входящее число
        var counter = 1; // счетчик для произведения чисел

        for(int i = N; i <= K; i++) { // Перебор всех целых чисел от N до K
            counter *= i; // Счетчик произведения чисел
        }
        System.out.println("Произведение чисел:" + counter); // Вывод произведения чисел
    }
}