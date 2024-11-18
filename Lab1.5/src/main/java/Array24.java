import java.util.Arrays;
import java.util.Scanner; // импортируем класс

 // Дан целочисленный массив размера N, не содержащий одинаковых чисел.
 // Проверить, образуют ли его элементы арифметическую прогрессию (см. задание Array3).
 // Если образуют, то вывести разность прогрессии, если нет — вывести 0.

public class Array24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.println("Введите N (размер массива): ");
        int N = in.nextInt();
        int[] A = new int[N]; // Массив с N элементами
        int[] mass = new int[N]; // Массив для проверки
        int sum; //

        // записываем элементы в массив
        System.out.println("Введите N элементов массива: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }

        // создаем массив с арифметической прогрессией для проверки
        for (int i = 0; i < N; i++) {
            sum = A[0] + i * (A[1] - A[0]);
            mass[i] = sum;
        }

        // Метод для проверки схожести двух массивов
        boolean comparison = Arrays.equals(A, mass);

        // Выводим разность массива или 0
        if (comparison) {
            System.out.println((A[1] - A[0]));
        } else {
            System.out.println(0);
        }
    }
}
