import java.util.Scanner; // импортируем класс

 // Дан целочисленный массив размера N.
 // Вывести все содержащиеся в данном массиве нечетные числа в порядке возрастания их индексов, а также их количество K.

public class Array8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int[] mass = new int[N]; // Массив с N колличеством элементов
        int sum = 0;
        // записываем элементы в массив
        for (int i = 0; i < N; i++) {
            mass[i] = i + 1;
            sum += 1;
        }

        // выводим в обратном порядке
        System.out.println("Все нечетные элементы:");
        for (int i = 0; i < mass.length + 1; i += 2) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("\nКоличество элементов: " + sum);
    }
}
