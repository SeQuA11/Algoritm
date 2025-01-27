public class Company {
    public String name; // Название компании
    public String industry; // Отрасль
    public int employeeCount; // Количество сотрудников

    // Конструктор класса Company
    public Company(String name, String industry, int employeeCount) {
        this.name = name;
        this.industry = industry;
        this.employeeCount = employeeCount;
    }

    // Геттеры (методы доступа) для полей
    public String getName() {
        return name;
    }

    // Метод для вывода информации о компании на экран
    public void displayCompanyInfo() {
        System.out.println("Название компании: " + name +
                ", Отрасль: " + industry +
                ", Количество сотрудников: " + employeeCount);
    }

    // Переопределенный метод toString для более удобного вывода
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}