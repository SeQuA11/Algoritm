import java.util.Scanner; // импортируем класс

public class wew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        double x = in.nextDouble();
        double y = in.nextDouble();
        double sum = 0;
        for (double i = x; i <= y; i++) {
            sum += PowerA3(i);
        }
    }

    public static double PowerA3(double A) {
        return Math.pow(A, 3);
    }
}
