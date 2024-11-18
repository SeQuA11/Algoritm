import java.util.Scanner; // импортируем класс

public class While22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        System.out.print("Введите число N: ");
        int n = in.nextInt();

        boolean isPrime = true;
        int i = 2;

        // Цикл while выполняется, пока i * i меньше или равно N.
        // Если N делится на i без остатка, то N не является простым числом, поэтому isPrime устанавливается в false и цикл прерывается с помощью break.
        // Если N не делится на i, i увеличивается на 1, чтобы проверить следующий делитель.
        while (i * i <= n) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        System.out.println(isPrime);
    }
}

