import java.util.Scanner; // импортируем класс

public class wew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        int progress = 1;
        while (progress != 0) {
            System.out.println();
            int cases = in.nextInt();
            switch (cases) {
                case 1:
                    System.out.println();
                    double sum1 = in.nextDouble(), sum2 = in.nextDouble();
                    System.out.println(sum(sum1, sum2));
                    break;
                case 2:
                    System.out.println();
                    double diff1 = in.nextDouble(), diff2 = in.nextDouble();
                    System.out.println(sum(diff1, diff2));
                    break;
                case 3:
                    System.out.println();
                    double hypotenuse1 = in.nextDouble(), hypotenuse2 = in.nextDouble();
                    System.out.println(sum(hypotenuse1, hypotenuse2));
                    break;
                case 4:
                case 5:
                    progress -= 1;
                    break;

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
