import java.util.Scanner; // импортируем класс

 // Дано целое число N (> 1), а также первый член A и разность D арифметической прогрессии.
 // Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии:
 // A,    A + D,    A + 2·D,    A + 3·D,    … .

public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int[] mass = new int[N]; // Массив с N колличеством элементов

        System.out.print("Введите число A: ");
        int A = in.nextInt(); // переменная для числа A
        System.out.print("Введите число D: ");
        int D = in.nextInt(); // переменная для числа D
        int sum; // переменная для суммы

        // Цикл от 2 до N, выполняем действие и каждому индексу со значением i присваиваем значение sum
        // и выводим результат
        for (int i = 0; i < N; i++) {
            sum = A + i * D;
            mass[i] = sum;
            System.out.print(mass[i] + " ");
        }
    }
}
