import java.util.Scanner; // импортируем класс

 // Дан массив A размера N. Сформировать новый массив B того же размера, элементы которого определяются следующим образом:
   // (А-к-атое попалам)

public class Array52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите N (размер массива): ");
        int N = in.nextInt();
        double[] A = new double[N]; // Массив A с N элементами
        double[] B = new double[N]; // Массив B с N элементами

        // записываем элементы в массив с условием
        System.out.print("Введите N элементов для массива A: ");
        for (int i = 0; i < A.length; i++) {
            double digit = in.nextInt();
            if (digit < 5) {
                B[i] = 2 * digit;
            } else {
                B[i] = digit / 2;
            }
        }

        // Выводим лементы массива В
        System.out.print("Элементы массива B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
