import java.util.Scanner; // импортируем класс

 // Дан массив A размера N и целое число K (1 ≤ K ≤ N).
 // Преобразовать массив, увеличив каждый его элемент на исходное значение элемента AK.

public class Array65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите N (размер массива): ");
        int N = in.nextInt();
        System.out.print("Введите K: ");
        int K = in.nextInt();
        int[] A = new int[N]; // Массив A с N элементами


        // Записываем элементы в массив А с условием
        System.out.print("Введите N элементов для массива A: ");
        for (int i = 0; i < A.length; i++) {
            if ((1 <= K) && (K <= N)) {
                A[i] = in.nextInt() * K;
            }
        }

        // Выводим лементы массива А
        System.out.print("Элементы массива А: ");
        for (int j : A) {
            System.out.print(j + " ");
        }
    }
}