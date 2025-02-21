import java.util.Scanner; // импортируем класс

 // Дан массив A ненулевых целых чисел размера 10.
 // Вывести значение первого из тех его элементов AK, которые удовлетворяют неравенству AK < A10.
 // Если таких элементов нет, то вывести 0.

public class Array18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.println("Введите 10 ненулевых целых чисел: ");
        int[] A = new int[10]; // Массив с 10 элементами

        // записываем элементы в массив
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }

        // Вызываем метод
        int firstElement = oneelement(A);
        System.out.println("Значение первого элемента, меньшего A10: " + firstElement);
    }

    // Метод для поиска числа AK < A10
    private static int oneelement(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[9]) {
                return A[i];
            }
        }
        return 0; // Если таких элементов нет
    }
}
