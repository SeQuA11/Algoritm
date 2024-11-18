import java.util.Scanner; // импортируем класс

// Дан массив A размера N.
// Вывести вначале его элементы с нечетными номерами в порядке возрастания номеров,
// а затем — элементы с четными номерами в порядке убывания номеров:
// A1,    A3,    A5,    …,    A6,    A4,    A2.
// Условный оператор не использовать.

import static java.lang.System.*;

public class Array57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите N (размер массива): ");
        int N = in.nextInt();
        int[] A = new int[N]; // Массив A с N элементами
        int[] B = new int[N]; // Массив B с N элементами


        out.print("Вывод: ");
        // записываем элементы в массив c четным порядком
        for (int j = 1; j < N; j += 2) {
            A[j] = j + 1;
            B[j] = A[j];
            out.print(B[j] + " ");
        }

        // записываем элементы в массив c нечетным порядком
        for (int i = 0; i < N; i += 2) {
            A[i] = i + 1;
            B[i] = A[i];
            out.print(B[i] + " ");
        }
    }
}
