import java.util.Scanner; // импортируем класс

public class While23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число B: ");
        int b = in.nextInt();

        // Цикл while выполняется, пока b не станет равным 0.
        // Временная переменная temp сохраняет значение b.
        // b обновляется значением остатка от деления a на b (a % b).
        // a обновляется значением temp (предыдущее значение b).
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("НОД(" + a + ", " + b + ") = " + a);
    }
}
