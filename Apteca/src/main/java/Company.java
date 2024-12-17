import java.util.Scanner;

class Company {
    // ОПИСАНИЯ ПОЛЕЙ И МЕТОДОВ // см. пример 3.4
    public String name; // название
    public int persons; // количество сотрудников
    public int money; // месячный фонд зарплаты

    // конструктор
    public Company(String name, int persons, int money) {
        this.name = name;
        this.persons = persons;
        this.money = money;
    }

    public void show() {
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников");
        System.out.println("Фонд зарплаты: " + money);
    }

    public int averageSalary() {
        return money / persons;
    }

    // ... (другие методы)
};

class MasCompany {
    public static void main(String[] args) {
        int i;

        // 1) объявляем ссылку на массив объектов
        // класса Company;
        // 2) выделяем память для массива ссылок
        // на объекты и сохраняем адрес выделенной
        // памяти в ссылочной переменной
        Company[] CityCompany = new Company[5];

        // 3) создаём объекты и записываем ссылки
        // на эти объекты в соответствующие
        // элементы массива
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.println("Информация о компании: \n");
            CityCompany[i] = new Company(
                    scanner.nextLine(),
                    Integer.parseInt(scanner.nextLine()),
                    Integer.parseInt(scanner.nextLine())
            );
        }

        // печать информации о компаниях, в которых
        // средняя зарплата превышает 10000
        for (i = 0; i < 5; i++)
            if (CityCompany[i].averageSalary() > 10000)
                CityCompany[i].show();
    }
} // конец описания класса MasCompany


