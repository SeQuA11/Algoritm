import java.util.Scanner; // импортируем класс

public class While4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int K = 1; // счетчик для степени

        while (N > K) { // пока N больше K
            K *= 3; // умножаем К на 3
        }
        if (N == K) {
            System.out.println("true"); // выводим true если степень совпадает
        } else {
            System.out.println("false"); // выводим false если степень не совпадает
        }
    }
}
