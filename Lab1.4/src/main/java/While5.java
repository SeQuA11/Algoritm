import java.util.Scanner; // импортируем класс

public class While5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число N: ");
        int N = in.nextInt(); // переменная для числа N
        int counter = 0; // счетчик

        while (N > 0) { // пока N больше 0
            N /= 2; // делим N на 2
            counter += 1; // и прибавляем к счетчику 1
        }
        System.out.println("Показатель для степени 2 равен: " + (counter - 1)); // выводим Показатель степени
    }
}
