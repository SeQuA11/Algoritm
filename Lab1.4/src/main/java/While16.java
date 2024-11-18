import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите процентную ставку P: ");
        double P = input.nextDouble();

        int months = 0;
        double deposit = 1000;

        while (deposit <= 1100) {
            deposit += deposit * (P / 100);
            months++;
        }

        System.out.println("Через " + months + " месяцев размер вклада превысит 1100 рублей");
        System.out.println("Итоговый размер вклада: " + deposit + " рублей");
    }
}

