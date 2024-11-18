import java.util.Scanner; // импортируем класс

 // Дан массив размера N. Вывести его элементы в обратном порядке.

public class Array7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int[] mass = new int[N]; // Массив с N колличеством элементов

        // записываем элементы в массив
        for (int i = 1; i < N; i++) {
            mass[i] = i + 1;
        }

        // выводим в обратном порядке
        System.out.println("Все элементы в обратном порядке:");
        for (int i = N - 1; i >= 1; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.print("1");
    }
}
