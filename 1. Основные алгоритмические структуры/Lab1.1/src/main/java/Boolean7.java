import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = in.nextInt(); //считываем число 1
        System.out.println("Введите второе число: ");
        int b = in.nextInt(); //считываем число 2
        System.out.println("Введите третие число: ");
        int c = in.nextInt(); //считываем число 3
        boolean bool = true;
        boolean bools = false;
        if(a < b && b < c) {
            System.out.println(bool);
        }
        else{
            System.out.println(bools);
        }
    }
}
