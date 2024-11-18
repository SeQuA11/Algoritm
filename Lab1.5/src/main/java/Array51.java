import java.util.Scanner; // импортируем класс

// Даны массивы A и B одинакового размера N.
// Поменять местами их содержимое и вывести вначале элементы преобразованного массива A,
// а затем — элементы преобразованного массива B.

public class Array51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите N (размер массива): ");
        int N = in.nextInt();
        int[] A = new int[N]; // Массив A с N элементами
        int[] B = new int[N]; // Массив B с N элементами

        // записываем элементы в массив
        System.out.print("Введите N элементов для массива A: ");
        for (int i = 0; i < A.length; i++) {
            B[i] = in.nextInt();
        }

        // записываем элементы в массив
        System.out.print("Введите N элементов для массива B: ");
        for (int i = 0; i < B.length; i++) {
            A[i] = in.nextInt();
        }

        // Выводим лементы нового массива А
        System.out.print("Элементы нового массива А: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.print("\n");

        // Выводим лементы нового массива В
        System.out.print("Элементы нового массива B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
