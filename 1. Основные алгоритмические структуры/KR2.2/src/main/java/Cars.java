import java.util.Random;
import java.util.Scanner; // импортируем класс

public class Cars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введите количество машин: ");
        int N = in.nextInt();
        int[] mass = new int[N];
        int[] arr = new int[N];
        int many = 0;


        System.out.print("Мощность двигателей " + N + " машин: ");
        for (int j = 0; j < N; j++) {
            arr[j] = rnd.nextInt(50, 311);
            System.out.print(arr[j] + " ");
        }

        System.out.print("\nСтоимость " + N + " машин: ");
        for (int i = 0; i < N; i++) {
            mass[i] = rnd.nextInt(5550, 50000);
            System.out.print(mass[i] + " ");
        }


        for (int i = 0; i < N; i++) {
            if (arr[i] > 100) {
                many += mass[i];
            }
        }
        System.out.println("\nСумма: " +many);
    }
}
