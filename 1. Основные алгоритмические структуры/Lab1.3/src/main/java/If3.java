import java.util.Scanner; // импортируем класс

public class If3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.println("Введите число: ");
        int A = in.nextInt(); // само число
        if (A == 0) { // если равно 0
            System.out.println(10); // то вывести 6
        }
        else if (A % 2 == 0) { // если четное
            System.out.println(A - 8); // то вычесть 8
        }
        else if (A % 2 != 0) { // если не четное
            System.out.println(A + 6); // то прибавить 6
        }
    }
}
