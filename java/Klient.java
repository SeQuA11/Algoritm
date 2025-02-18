import java.util.ArrayList;
import java.util.Scanner;

public class Klient {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<Bank> klient = new ArrayList<>();
        var appeal = "";
        Bank bank = new Bank(appeal);
        boolean bool = true;

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
