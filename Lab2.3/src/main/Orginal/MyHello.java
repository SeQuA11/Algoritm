import  java.util.Scanner;

public class MyHello {
    public static void main(String[] args) {
        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Пожалуйста, введите ваше имя: ");
            name = scanner.nextLine();
            scanner.close();
        }

        System.out.println("Привет, " + name);
    }
}
