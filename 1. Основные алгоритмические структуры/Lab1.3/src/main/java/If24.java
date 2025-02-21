import java.util.Scanner; // импортируем класс

public class If24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        float x = in.nextFloat(); // входящее вещественное число

        if (x > 0) { // Если х больше 0
            System.out.println(2 * Math.sin(x)); // то выполняется действие
        }
        else { // В противном случае
            System.out.println(6 - x); // выполняется это действие
        }
    }
}
