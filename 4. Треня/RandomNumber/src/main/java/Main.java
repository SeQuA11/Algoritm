
import java.io.IOError;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Запуск программы
 * Переменной number присваивается рандомное значение
 * Цикл while принимает пременную  bool = true
 * Программа запрашивает у пользователя число
 * Пользователь вводит свое число
 * Программа проверяет больше, меньше или равно число пользователя загаданному числу
 * Если равно присваиваем переменной bool значение false
 * программа завершается
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int number = rnd.nextInt(0,51);
        boolean bool = true;

        while (bool) {
            try {
                System.out.print("Введите натуральное число от 0 до 50 включительно: ");
                int numberUser = in.nextInt();
                if (numberUser > number && 0 <= numberUser && numberUser <= 50) {
                    System.out.println("Загаданное число меньше");
                } else if (numberUser < number && 0 <= numberUser && numberUser <= 50) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Молодец, ты угадал число");
                    bool = false;
                }
            } catch (IOError error){
                System.out.println("Упс... Ошибка!!! Введите натуральное число от 0 до 50 включительно.");
            }
        }
    }
}