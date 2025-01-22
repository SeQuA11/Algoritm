import java.util.Scanner;
import java.util.ArrayList;

class MasCompany {
    public static void main(String[] args) {
        Company com1 = new Company("Computers");
        Company com1 = new Company(456, 146000);
        Company com2 = new Company("Boooks");
        Company com2 = new Company(789, 45000);
        Company com3 = new Company("ГазПром");
        Company com3 = new Company(1567, 98000);
        Company com4 = new Company("Door");
        Company com4 = new Company(345, 56000);
        Company com5 = new Company("Garden");
        Company com5 = new Company(56, 30000);

        com1.getFullInfo();
        com2.getFullInfo();
        com3.getFullInfo();
        com4.getFullInfo();
        com5.getFullInfo();




    }
}