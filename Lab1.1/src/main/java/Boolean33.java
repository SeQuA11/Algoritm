import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите значение 1 стороны: ");
        int a = in.nextInt(); //считываем число 1, 1 сторона
        System.out.println("Введите значение 2 стороны: ");
        int b = in.nextInt(); //считываем число 2, 2 сторона
        System.out.println("Введите значение 3 стороны: ");
        int c = in.nextInt(); //считываем число 3, 3 сторона
        boolean bool = true;
        boolean bools = false;
        if(a + b > c && a + c > b && c + b > a) {
            System.out.println(bool);
        }
        else{
            System.out.println(bools);
        }
    }
}
