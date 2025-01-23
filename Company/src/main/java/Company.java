import java.util.ArrayList;

class Company {
    // ОПИСАНИЯ ПОЛЕЙ И МЕТОДОВ // см. пример 3.4
    public String name; // название
    public int persons; // количество сотрудников
    public int money; // месячный фонд зарплаты
    ArrayList<Company> company;

    // конструктор
    public Company(String name) {
        this.name = name;
        this.company = new ArrayList<>();
    }

    public Company(int persons, int money) {
        this.persons = persons;
        this.money = money;
    }

    public String toString() {
        return "Колличество сотрудников: " + persons + "\nМесячный фонд зарплаты: " + money;
    }

    public void addCompany(int employee, int money) {
        company.add(new Company(employee, money));
    }

    public void getFullInfo() {
        System.out.println("Компания: " + name);
        if (company.isEmpty()) {
            System.out.println("Нет данных");
            return;
        }

        // Выводим список
        for (Company com : company) {
            System.out.println(com);
        }
    }
}