import java.util.Scanner;

public class Boolea16n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt(); //считываем число
        boolean bool = true;
        boolean bools = false;
        if(a % 2 == 0 && a / 10 != 0) {
            System.out.println(bool);
        }
        else{
            System.out.println(bools);
        }
    }
}
