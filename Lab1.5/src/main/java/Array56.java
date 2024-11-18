import java.util.Scanner; // импортируем класс

 // Дан целочисленный массив A размера N (≤ 15).
 // Переписать в новый целочисленный массив B все элементы с порядковыми номерами, кратными трем (3, 6, …),
 // и вывести размер полученного массива B и его содержимое. Условный оператор не использовать.

public class Array56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите N (размер массива не больше 15 ): ");
        int N = in.nextInt();
        int[] A = new int[N]; // Массив A с N элементами
        int[] B = new int[N]; // Массив B с N элементами

        // записываем элементы в массив А
        System.out.print("Введите N элементов для массива A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }

        int count = 0; // счетчик для массива В

        //элементы массива В
        for (int i = 2; i < A.length; i += 3) {
            B[count] = A[i];
            count++;
        }

        System.out.println("Количество элементов в массиве В: " + count);

        // Выводим лементы массива В
        System.out.print("Элементы массива B: ");
        for (int i = 0; i < count; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
