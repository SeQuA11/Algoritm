import java.util.ArrayList;

class Company {
    // ОПИСАНИЯ ПОЛЕЙ И МЕТОДОВ
    public String name; // название
    public int persons; // количество сотрудников
    public int money; // месячный фонд зарплаты
    public String work; // вид деятельности

    /**
    Конструктор класса Company, для  
     */
    public Company(String user_command) {}

    /**
    Метод возвращающий поле name
     */
    public String getName() {
        return name;
    }

    /**
    Конструктор класса Company, принимающий значения из класса MasCompany и присваивающий значения полей переменным
     */
    public Company(String name, String work, int persons, int money) {
        this.name = name;
        this.work = work;
        this.persons = persons;
        this.money = money;
    }

    /**
    Метод для оформления данных о компании
     */
    public void displayCompanyInfo() {
        System.out.println();
        System.out.println("Название компании: " + name
                + "\nОтрасль: " + work
                + "\nКоличество сотрудников: " + persons
                + "\nЗароботная плата: " + money);
    }

    /**
    Метод, принимающий за аргумент список из класса MasCompany и возвращающий
    оформленные(с помощью метода displayCompanyInfo()) данные о каждой компании по отдельности с помощью цикла
     */
    public void infoCompany(ArrayList<Company> company) {
        System.out.println("Все компании:");
        for (Company com : company) {
            com.displayCompanyInfo();
        }

    }

    /**
    Метод, принимающий за аргумент список из класса MasCompany и аргумент с названием компании
     */
    public static void removeCompanyByName(ArrayList<Company> company, String companyName) {
        // Цикл от 0 до длинны списка
        for (int i = 0; i < company.size(); i++) {
            // Условие, если в списке есть объект с переданным названием, то этот объект удаляется
            if (company.get(i).getName().equals(companyName)) {
                company.remove(i);
                System.out.println("Компания '" + companyName + "' удалена.");
                return; // Выходим после удаления
            }
        }
        System.out.println("Компания '" + companyName + "' не найдена.");
    }


}