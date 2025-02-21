import java.util.Scanner; // импортируем класс

 // Дан целочисленный массив размера N.
 // Увеличить все четные числа, содержащиеся в массиве, на исходное значение первого четного числа.
 // Если четные числа в массиве отсутствуют, то оставить массив без изменений.


public class Array66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите размер массива N: ");
        int n = in.nextInt();
        int[] A = new int[n];

        System.out.print("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        addNumbers(A);

        System.out.print("Элементы массива А: ");
        for (int j : A) {
            System.out.print(j + " ");
        }
    }


    public static void addNumbers(int[] arr) {
        // Возвращаем массив без изменений, если он пустой или null
        if (arr == null || arr.length == 0) {
            return;
        }

        // Прерываем цикл, как только найдено первое четное число
        int first = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                first = i;
                break;
            }
        }

        // Возвращаем массив без изменений, если четных чисел нет
        if (first == -1) {
            return;
        }

        int firstEven = arr[first];

        // Прибавляем к каждому четному числу firstEven
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += firstEven;
            }
        }
    }
}