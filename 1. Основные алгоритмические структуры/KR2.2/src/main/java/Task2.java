import java.util.Random;
import java.util.Scanner; // импортируем класс


public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введите N (размер массива): ");
        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        System.out.print("Элементы массива A: ");
        for (int j = 0; j < N; j++) {
            A[j] = rnd.nextInt(0, 50);
            System.out.print(A[j] + " ");
        }
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                B[i] = A[i] * A[i];
            } else {
                B[i] = 2 * A[i];
            }
        }

        System.out.print("\nЭлементы массива B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
