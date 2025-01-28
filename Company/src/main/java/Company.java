import java.util.ArrayList;
import java.util.Arrays;

class Company {
    // ОПИСАНИЯ ПОЛЕЙ И МЕТОДОВ // см. пример 3.4
    public String name; // название
    public int persons; // количество сотрудников
    public int money; // месячный фонд зарплаты
    public String work; // вид деятельности

    /*

     */
    public Company(String user_command) {}

    /*

     */
    public String getName() {
        return name;
    }

    /*

     */
    public Company(String name, String work, int persons, int money) {
        this.name = name;
        this.work = work;
        this.persons = persons;
        this.money = money;
    }

    /*

     */
    public void displayCompanyInfo() {
        System.out.println();
        System.out.println("Название компании: " + name
                + "\nОтрасль: " + work
                + "\nКоличество сотрудников: " + persons
                + "\nЗароботная плата: " + money);
    }

    /*

     */
    public void infoCompany(ArrayList<Company> company) {
        System.out.println("Все компании:");
        for (Company com : company) {
            com.displayCompanyInfo();
        }

    }

    /*
    
     */
    public static void removeCompanyByName(ArrayList<Company> company, String companyName) {
        for (int i = 0; i < company.size(); i++) {
            if (company.get(i).getName().equals(companyName)) {
                company.remove(i);
                System.out.println("Компания '" + companyName + "' удалена.");
                return; // Выходим после удаления
            }
        }
        System.out.println("Компания '" + companyName + "' не найдена.");
    }


}