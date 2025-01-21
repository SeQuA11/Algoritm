import java.util.Scanner;
import java.util.ArrayList;

class Company {
    // ОПИСАНИЯ ПОЛЕЙ И МЕТОДОВ // см. пример 3.4
    public String name; // название
    public int persons; // количество сотрудников
    public int money; // месячный фонд зарплаты
    ArrayList<Company> company;

    // конструктор
    public Company(String name, int persons, int money) {
        this.name = name;
        this.persons = persons;
        this.money = money;
        this.company = new ArrayList<>();
    }

    /**
     * вывод инфо о компании
     */
    public void show() {
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников");
        System.out.println("Фонд зарплаты: " + money);
    }

    public int averageSalary() {
        return money / persons;
    }

    public void getFullInfo() {
    }
}