import java.util.Scanner;

/**
 * Известно два натуральных числа и надо выяснить в каком из них больше всего цифр.
 */
public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Выделяем место в памяти и создаем объект для метода Scanner
        System.out.print("Введите первое число: ");
        int numbersOne = in.nextInt(); // Создаем переменную и присваиваем ей вписанное пользователем значение
        System.out.print("Введите второе число: ");
        int numbersTwo = in.nextInt(); // Создаем переменную и присваиваем ей вписанное пользователем значение

        /**
         * Проверяем длина какого из двух чисел больше, если длина numbersOne больше, чем у numbersTwo,
         * то выводим numbersOne, в противном случае выводим numbersTwo
         */
        if (getCountOfDigits(numbersOne) > getCountOfDigits(numbersTwo)) {
            System.out.println("Длина числа "+ numbersOne + " больше и равна: " + getCountOfDigits(numbersOne));
        } else {
            System.out.println("Длина числа "+ numbersTwo + " больше и равна: " + getCountOfDigits(numbersTwo));
        }
    }

    /**
     * Метод принимающий натуральное число и высчитывающий его длину
     */
    public static int getCountOfDigits(int x) {
        int count = 0;
        int gigit = 0;
        while (x > 0) {
            gigit = x % 10;
            count += 1;
            x /= 10;
        }
        return count;
    }
}
