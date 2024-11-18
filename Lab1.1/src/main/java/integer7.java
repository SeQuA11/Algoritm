import java.util.Scanner;

public class integer7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите двузначное число: ");
        int number = in.nextInt();
        var sum = number / 10 + number % 10;
        var composition = (number / 10) * (number % 10);
        System.out.println("Сумма цифр числа равна: " + sum + "\nПроизведение цифр числа равна: " + composition);
        System.out.flush();
    }
}
