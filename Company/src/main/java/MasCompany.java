import java.util.Scanner;
import java.util.ArrayList;

class MasCompany {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Company com1 = new Company("Computers");
        com1.addCompany(456, 146000);
        com1.getFullInfo();
        System.out.println();

        Company com2 = new Company("Boooks");
        com2.addCompany(789, 45000);
        com2.getFullInfo();
        System.out.println();

        Company com3 = new Company("ГазПром");
        com3.addCompany(1567, 98000);
        com3.getFullInfo();
        System.out.println();

        Company com4 = new Company("Door");
        com4.addCompany(345, 56000);
        com4.getFullInfo();
        System.out.println();

        Company com5 = new Company("Garden");
        com5.getFullInfo();

        Company com6 = new Company(in.next());
        com6.addCompany(in.nextInt(), in.nextInt());
        com6.getFullInfo();
        System.out.println();

    }
}