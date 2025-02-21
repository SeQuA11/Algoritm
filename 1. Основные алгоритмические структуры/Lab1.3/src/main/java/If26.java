import java.util.Scanner; // импортируем класс

public class If26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        float x = in.nextFloat(); // входящее вещественное число

        if (x <= 0) { // если х больше равен нулю
            System.out.println(-1 * x); // то выполняется действие
        }
        else if (0 < x && x < 2) { // если х больше нуля  и меньше 2
            System.out.println(x * x); // то выполняется действие
        } else { // В противном случае
            System.out.println(4); // выполняется это действие
        }
    }
}
