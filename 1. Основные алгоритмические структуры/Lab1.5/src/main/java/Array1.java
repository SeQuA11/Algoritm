import java.util.Scanner; // импортируем класс

 // Дано целое число N (> 0).
 // Сформировать и вывести целочисленный массив размера N,
 // содержащий N первых положительных нечетных чисел: 1, 3, 5, … .

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        byte N = in.nextByte(); // переменная для числа N
        byte[] mass = new byte[N]; // Массив с N колличеством элементов

        // Цикл от 1 до N c шагом 2, каждому индексу со значением i присваиваем значение i
        // и выводим результат
        for (byte i = 1; i < (N + 1); i += 2) {
            mass[i] = i;
            System.out.print(mass[i] + " ");
        }
    }
}

