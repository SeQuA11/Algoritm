import java.util.Scanner; // импортируем класс

 // Описать процедуру DigitCountSum(K, C, S), находящую количество C цифр целого положительного числа K,
 // а также их сумму S (K — входной, C и S — выходные параметры целого типа).
 // С помощью этой процедуры найти количество и сумму цифр для каждого из пяти данных целых чисел.

public class Proc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число K: ");
        String K = DigitCountSum(in.nextInt()); // Переменная для числа K
        System.out.println(K);
    }

    // Метод для разложения числа на цифры и для подсчета их колличества и суммы
    static String DigitCountSum(int C) {
        int S = 0;
        int sum = 0;
        while (C > 0) {
            sum += (C % 10);
            C /= 10;
            S += 1;
        }
        return "Сумма цифр числа: " + sum + "\nКолличества цифр в числе: " + S;
    }
}
