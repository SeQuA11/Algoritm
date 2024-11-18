import java.util.Scanner; // импортируем класс

public class While21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int digit = 0;
        boolean trfals = false;

        // Пока N больше 0,
        // присваиваем digit значение последней цифры числа,
        // проверяем ее на нечестность и присылаем переменной trfals значение true
        // и потом из исходного числа удаляем последнюю цифру
        while (N > 0) {
            digit = N % 10;
            if (digit % 2 != 0) {
                trfals = true;
            }
            N /= 10;
        }
        // Делаем проверку
        if (trfals == true) {
            System.out.println("true"); //
        } else {
            System.out.println("false"); //
        }
    }
}
