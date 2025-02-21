import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner; // импортируем классы

// Описать процедуру ShiftRight3(A, B, C),
// выполняющую правый циклический сдвиг: значение A переходит в B, значение B — в C, значение C — в A
// (A, B, C — вещественные параметры, являющиеся одновременно входными и выходными).
// С помощью этой процедуры выполнить правый циклический сдвиг для двух данных наборов из трех чисел:
// (A1, B1, C1) и (A2, B2, C2).

public class Proc14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        DecimalFormat rounding = new DecimalFormat("#.#"); // Формат в котором записываются вещественные числа
        ArrayList<Double> numbers = new ArrayList<>(); // Создаем коолекцию

        System.out.print("Введите размер коллекции: ");
        int quantity = in.nextInt() + 1; // Переменная для числа A

        // Записываем в коллекцию рандомные вещественные числа
        for (int i = 0; i < quantity - 1; i++) {
            numbers.add(i, (Math.random() * 100));
        }

        // Выводим изначальную коллекцию
        System.out.println("Изначальная коллекция: ");
        for(double j : numbers){
            System.out.print(rounding.format(j) + " ");
        }

        System.out.println();
        // Через цикл и с помощью класса shiftRight записываем в коллекцию числа с циклическим сдвигом
        for (int i = quantity; i >= 0; i--) {
            shiftRight(numbers, i + 1, i);
        }

        // Выводим новую коллекцию
        System.out.println("Коллекция с циклическим сдвигом: ");
        for(double j : numbers){
            System.out.print(rounding.format(j) + " ");
        }
    }

    // Метод циклически сдвигает числа
    public static void shiftRight(ArrayList<Double> list, int X, int Y) {
        if (X >= list.size() || Y >= list.size()) {
            return;
        }
        double temp = list.get(Y); // Сохраняем значение Y
        list.set(Y, list.get(X)); // Сдвигаем значения вправо
        list.set(X, temp); // Записываем сохраненное значение Y в позицию X

    }
}
