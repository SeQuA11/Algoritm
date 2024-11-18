import java.util.Scanner; // импортируем класс

 // Даны целые числа N (> 2), A и B.
 // Сформировать и вывести целочисленный массив размера N, первый элемент которого равен A, второй равен B,
 // а каждый последующий элемент равен сумме всех предыдущих.

public class Array6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int[] mass = new int[N]; // Массив с N колличеством элементов
        System.out.print("Введите число A: ");
        int A = in.nextInt(); // переменная для числа A
        System.out.print("Введите число B: ");
        int B = in.nextInt(); // переменная для числа B
        int sum = A + B; // переменная для суммы

        // Выводим первые символы последовательности
        System.out.print(A + " " + B + " " + sum + " ");

        // Цикл от 0 до N, выполняем действие и каждому индексу со значением i присваиваем значение sum
        // и выводим результат
        for (int i = 0; i < (N - 3); i++) {
            sum += sum;
            mass[i] = sum;
            System.out.print(mass[i] + " ");
        }
    }
}
