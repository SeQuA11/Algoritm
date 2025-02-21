import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int onenumber = in.nextInt();
        System.out.println("Введите второе число: ");
        int twonumber = in.nextInt();
        System.out.println("Среднее геометрическое равно: " + Math.sqrt(onenumber * twonumber));
        System.out.flush();
    }
}
