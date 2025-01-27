import java.util.ArrayList;
import java.util.Arrays;

class Company {
    // ОПИСАНИЯ ПОЛЕЙ И МЕТОДОВ // см. пример 3.4
    public String name; // название
    public int persons; // количество сотрудников
    public int money; // месячный фонд зарплаты
    public String work;
//    ArrayList<Company> company = new ArrayList<>();

    public Company(String user_command) {

    }

    public Company(String name, String work, int persons, int money) {
        this.name = name;
        this.work = work;
        this.persons = persons;
        this.money = money;
    }

//    public void listCompany(String name, String work, int persons, int money) {
//        company.add(new Company(name, work, persons, money));
//    }

    public void displayCompanyInfo() {
        System.out.println("Название компании: " + name +
                ", Отрасль: " + work +
                ", Количество сотрудников: " + persons + " Money" + money);
    }

    public void infoCompany(ArrayList<Company> company) {
        System.out.println("Все компании:");
        for (Company com : company) {
            com.displayCompanyInfo();
        }

    }


}