import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner; // импортируем классы

 // Описать процедуру Swap(X, Y), меняющую содержимое переменных X и Y (X и Y — вещественные параметры,
 // являющиеся одновременно входными и выходными).
 // С ее помощью для данных переменных A, B, C, D последовательно поменять содержимое следующих пар:
 // A и B, C и D, B и C и вывести новые значения A, B, C, D.

public class Proc10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        DecimalFormat rounding = new DecimalFormat("#.#"); // Формат в котором записываются вещественные числа
        ArrayList<Double> numbers = new ArrayList<>(); // Создаем коолекцию

        System.out.print("Введите размер коллекции: ");
        int quantity = in.nextInt() - 1; // Переменная для числа A

        // Записываем в коллекцию рандомные вещественные числа
        for (int i = 0; i < quantity + 1; i++) {
            numbers.add(i, (Math.random() * 100));
        }

        // Выводим изначальную коллекцию
        System.out.println("Изначальная коллекция: ");
        for(double j : numbers){
            System.out.print(rounding.format(j) + " ");
        }

        System.out.println();
        // Через цикл и с помощью класса swap записываем в коллекцию попарно поменяные числа
        for (int i = 0; i <= quantity; i += 2) {
            swap(numbers, i, i + 1);
        }

        // Выводим новую коллекцию
        System.out.println("Коллекция с попарно поменяными числа: ");
        for(double j : numbers){
            System.out.print(rounding.format(j) + " ");
        }
    }

    // Метод меняющий попарно стоящие числа
    public static void swap(ArrayList<Double> list, int X, int Y) {
        double temp = list.get(X);
        if (Y < list.size()) {
            list.set(X, list.get(Y));
            list.set(Y, temp);
        } else {
            list.set(X,temp);
        }
    }
}
