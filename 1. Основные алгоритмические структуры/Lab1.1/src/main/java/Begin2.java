import java.util.Scanner;

public class Begin2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину стороны: ");
        int side = in.nextInt();
        System.out.println("Площадь квадрата равна: " + side * side);
        System.out.flush();
    }
}
