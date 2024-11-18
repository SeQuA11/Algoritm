import java.util.Scanner; // импортируем класс

public class While3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число A: ");
        int N = in.nextInt(); // переменная для числа N
        System.out.print("Введите число B: ");
        int K = in.nextInt(); // переменная для числа K
        int counter = 0; //

        while (N >= 0) { // пока N больше равно нулю
            N -= K; // из N вычитаем K
            counter += 1; // и прибавляем к счетчику 1
        }
        System.out.println("Целочисленное деление: " + (counter - 1) + "\nДеление с остатком: " + (N + K));
        // выводим сколько раз делится нацело и сколько остаток
    }
}
