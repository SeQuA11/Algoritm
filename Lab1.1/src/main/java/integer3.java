import java.util.Scanner;

public class integer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер файла в байтах: ");
        int size = in.nextInt();
        System.out.println("Размер файла в килобайтах: " + size / 1024);
        System.out.flush();
    }
}
