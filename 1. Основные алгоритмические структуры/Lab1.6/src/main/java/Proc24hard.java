import java.util.Random;
import java.util.Scanner; // импортируем классы

// Описать метод Even(K) логического типа, возвращающую True, если целый параметр K является четным, и False в противном случае.
// С ее помощью найти количество четных чисел в наборе из 10 целых чисел. Числа


public class Proc24hard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        Random GenIntNumber = new Random();// Метод для генерации рандомных чисел

        System.out.print("Введите размер массива: ");
        int N = in.nextInt(); // Запрашиваем у пользователя количество колец
        int[] mass = new int[N];

        // Записываем в массив числа
        System.out.print("Изначальный массив: ");
        for (int i = 0; i < N; i++) {
            mass[i] = GenIntNumber.nextInt(1, 101);
            System.out.print(mass[i] + " ");
        }

        // Выводим количество четных чисел
        System.out.println("\nСумма четных чисел: " + GetSumEvenNumberInArray(mass));
    }

    // Метод для определения четных чисел
    public static int GetSumEvenNumberInArray(int[] arr) {
        int country = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                country += j;
            }
        }
        return country;
    }
}
