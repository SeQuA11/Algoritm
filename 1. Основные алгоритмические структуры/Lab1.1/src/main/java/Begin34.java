import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите кол-во шоколадных конфет в кг: ");
        int Chocolateinkg = in.nextInt();
        System.out.println("Введите стоимость шоколадных конфет в руб. : ");
        int BuyChocolate = in.nextInt();
        System.out.println("Введите кол-во ирисок в кг: ");
        int Irisinkg= in.nextInt();
        System.out.println("Введите стоимость ирисок в руб. : ");
        int BuyIris = in.nextInt();
        var BuyChocolateinkg = BuyChocolate / Chocolateinkg;
        var BuyIrisinkg = BuyIris / Irisinkg;
        System.out.println("Цена шоколадных конфет за 1 кг: " + BuyChocolateinkg + "\nЦена ирисок за 1 кг: " + BuyIrisinkg + "\nШоколадные конфеты дороже ирисок в " + BuyChocolateinkg / BuyIrisinkg + "раз.");
        System.out.flush();
    }
}
