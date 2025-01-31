import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 1.  найти разность между максимальным и минимальным элементами массива.
 * 2.  поменять местами макс и мин массива
 * 3.  *отсортировать массив
 */
public class ReleaseProgramm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Выделяем место в памяти и создаем объект для метода Scanner
        Random rnd = new Random(); // Выделяем место в памяти и создаем объект для метода Random
        int countmin = 0; // Создаем переменную равную 0, для подсчета количества минимальных элементов
        int numbersMin = 0; // Создаем переменную равную 0, для приравнивания к индексу минимального элемента в массиве
        int countmax = 0; // Создаем переменную равную 0, для подсчета количества максимальных элементов
        int numbersMax = 0; // Создаем переменную равную 0, для приравнивания к индексу максимального элемента в массиве


        System.out.print("Задайте длину массива: ");
        int langArrays = in.nextInt(); // Создаем переменную и присваиваем ей вписанное пользователем значение
        int[] prog = new int[langArrays]; // создаем массив с задаваемым размером

        System.out.print("\n[");
        // Добавляем в массив рандомные значения с помощью модуля Random и выводим эти значения
        for (int i = 0; i < langArrays; i++) {
            prog[i] = rnd.nextInt(-10000, 10001);
            System.out.print(prog[i] + "; ");
        }
        System.out.println("]");

        System.out.println("\n*****************************************************************************************\n");

        // Находим индекс максимального элемента
        for (int i = 0; i < prog.length; i++) {
            if (prog[i] == maxNumbers(prog)) {
                countmax += 1;
                numbersMax = i;
            }
        }

        System.out.println("Индекс максимального числа " + maxNumbers(prog) + " равен: " + numbersMax);
        System.out.println("Количество максимальных элементов: " + countmax + "\n");

        // Находим индекс минимального элемента
        for (int i = 0; i < prog.length; i++) {
            if (prog[i] == minNumbers(prog)) {
                countmin += 1;
                numbersMin = i;
            }
        }

        System.out.println("Индекс максимального числа " + minNumbers(prog) + " равен: " + numbersMin);
        System.out.println("Количество максимальных элементов: " + countmin + "\n");

        // Меняем местами минимальный и максимальный элементы
        int Minnumbers = minNumbers(prog);
        int Maxnumbers = maxNumbers(prog);
        prog[numbersMin] = Maxnumbers;
        prog[numbersMax] = Minnumbers;

        System.out.println("*****************************************************************************************\n");

        System.out.print("Измененный массив: ");
        // Выводим элементы массива с поменяными местами минимальными и максимальными элементами
        System.out.print("[");
        for (int i : prog) {
            System.out.print(i + ";");
        }
        System.out.println("]");

        System.out.println("Разность между максимальным и минимальным элементами массива: " + (maxNumbers(prog) - minNumbers(prog)));

        System.out.println("\n*****************************************************************************************\n");
        bubbleSort(prog); // обращаемся к методу bubbleSort и отсортировываем массив

        // Выводим элементы отсортированного массива
        System.out.print("Отсортированный массив: ");
        System.out.print("[");
        for (int i : prog) {
            System.out.print(i + ";");
        }
        System.out.println("]");
    }

    /**
     * Метод для поиска минимального элемента
     */
    public  static int minNumbers(int[] prog) {return Arrays.stream(prog).min().getAsInt();}

    /**
     * Метод для поиска максимального элемента
     */
    public  static int maxNumbers(int[] prog) {return Arrays.stream(prog).max().getAsInt();}

    /**
     * Метод для сортировки массива способом BubbleSort
     */
    public static void bubbleSort(int[] prog) {
        int n = prog.length;
        IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
            if (prog[j - 1] > prog[j]) {
                int temp = prog[j];
                prog[j] = prog[j - 1];
                prog[j - 1] = temp;
            }
        });
    }
}
