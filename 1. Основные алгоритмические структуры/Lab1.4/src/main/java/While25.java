import java.util.Scanner; // импортируем класс

public class While25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int digit = 0;
        int digit1 = 1;
        int sum = 0;

        //
        while (N > digit) {
            sum = digit + digit1;
            digit = digit1;
            digit1 = sum;
        }
        System.out.println(digit);
    }
}
