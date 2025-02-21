import java.util.Scanner; // импортируем класс

 // Дан целочисленный массив A размера 10.
 // Вывести порядковый номер последнего из тех его элементов AK, которые удовлетворяют двойному неравенству A1 < AK < A10.
 // Если таких элементов нет, то вывести 0.

public class Array19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.println("Введите 10 ненулевых целых чисел: ");
        int[] A = new int[10]; // Массив с 10 элементами

        // записываем элементы в массив
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }

        // Вывод метода с проверкой
        int firstElement = oneelement(A);
        if (firstElement != 0) {
            System.out.println("Значение первого элемента, меньшего A10: " + firstElement + 1);
        } else {
            System.out.println("Таких элементов нет");
        }
    }

    // Метод для поиска числа A1 < AK < A10
    private static int oneelement(int[] A) {
        int lastindex = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i] < A[9]) && (A[0] < A[i])) {
                lastindex = i;
            }
        }
        return lastindex; // Если таких элементов нет
    }
}
