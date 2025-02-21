import java.util.Scanner; // импортируем класс

 // Дан массив A размера N.
 // Вывести вначале его элементы с нечетными номерами в порядке возрастания номеров,
 // а затем — элементы с четными номерами в порядке убывания номеров:
 // A1,    A3,    A5,    …,    A6,    A4,    A2.
 // Условный оператор не использовать.

import static java.lang.System.*;

public class Array15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int[] mass = new int[N]; // Массив с N колличеством элементов
        int[] arr = new int[N]; // Массив с N колличеством элементов


        out.print("Вывод: ");
        // записываем элементы в массив c четным порядком
        for (int j = 0; j < N; j += 2) {
            arr[j] = j + 1;
            out.print(arr[j] + " ");
        }

        // записываем элементы в массив c нечетным порядком
        for (int i = 1; i < N; i += 2) {
            mass[i] = i + 1;
            //out.print(mass[i] + " ");
        }

        // выводим в обратном порядке
        for (int i = N - 1; i >= 1; i -= 2) {
            out.print(mass[i] + " ");
        }
    }
}
