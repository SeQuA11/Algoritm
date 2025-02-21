import java.util.Scanner;

public class integer17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число большее 999: ");
        int number = in.nextInt();
        var sum = number / 100 % 10;
        System.out.println("Цифра соответствующая разряду сотен в этом числе: " + sum);
        System.out.flush();
    }
}