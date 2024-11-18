import java.util.Scanner; // импортируем класс

public class While1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число A: ");
        int A = in.nextInt(); // переменная для числа А
        System.out.print("Введите число B: ");
        int B = in.nextInt(); // переменная для числа В

        while (A >= 0) { // пока А больше равно 0
            A -= B; // из А вычитаем В
        }
        System.out.println("Остаток: " + (A + B)); // выводим остаток
    }
}
