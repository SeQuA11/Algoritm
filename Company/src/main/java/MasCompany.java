import java.util.Scanner;
import java.util.ArrayList;

class MasCompany {
    public static void main(String[] args) {
        Company com1 = new Company("Computers", 456, 78000);
        Company com2 = new Company("Boooks", 789, 45000);
        Company com3 = new Company("ГазПром", 1567, 98000);
        Company com4 = new Company("Door", 345, 56000);
        Company com5 = new Company("Garden", 56, 30000);

        com1.getFullInfo(); // Выводит информацию об аптеке

    }
}