import java.util.Scanner; // импортируем класс

public class wew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        int progress = 1;
        while (progress != 0) {
            System.out.println();
            double cases = in.nextDouble();
            switch (progress) {
                case 1:

            }

        }
    }

    static double sum(double A, double B) {
        return A + B;
    }

    static double diff(double A, double B) {
        return A - B;
    }

    static double hypotenuse(double A, double B) {
        return Math.sqrt(A * A + B * B);
    }
    
    static void time(int A) {

    }
}
