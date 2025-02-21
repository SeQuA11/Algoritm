import java.util.Scanner; // импортируем класс

public class While2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число A: ");
        int A = in.nextInt(); // переменная для числа А
        System.out.print("Введите число B: ");
        int B = in.nextInt(); // переменная для числа В
        int counter = 0; // счетчик

        while (A >= 0) { // пока А больше равно нулю
            A -= B; // из А вычитаем В
            counter += 1; // и прибавляем к счетчику 1
        }
        System.out.println("Количество отрезков: " + (counter - 1)); // выводим количество отрезков
    }
}
