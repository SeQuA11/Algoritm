import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Klient {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<Bank> klient = new ArrayList<>();
        var appeal = "";
        Bank bank = new Bank(appeal);
        boolean bool = true;
        int number = 5;

        Bank kli1 = new Bank("Варнаков Степан Максимович", rnd.nextInt(100000000, 999999999));
        for (int i = 0; i < number; i++) {
            kli1.addScore();
        }

        kli1.infoMedication();
        while (bool) {
            appeal = scr.nextLine();
            switch (appeal) {
                case "1":
                case "2":
                case "3":
                case "4":

            }
        }
    }
}
