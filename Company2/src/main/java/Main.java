import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения объектов Company
        ArrayList<Company> companyList = new ArrayList<>();

        // Добавляем компании в список
        companyList.add(new Company("Acme Corp", "Технологии", 500));
        companyList.add(new Company("Beta Industries", "Производство", 250));
        companyList.add(new Company("Gamma Inc.", "Финансы", 1000));

        // Выводим все компании в списке
        System.out.println("Все компании:");
        for (Company company : companyList) {
            company.displayCompanyInfo();
        }

        //Выводим все компании, используя toString
        System.out.println("\nВсе компании используя toString:");
        for (Company company : companyList) {
            System.out.println(company);
        }

        // Удаляем компанию по названию
        removeCompanyByName(companyList, "Beta Industries");

        // Выводим компании после удаления
        System.out.println("\nКомпании после удаления:");
        for (Company company : companyList) {
            company.displayCompanyInfo();
        }

        //Добавляем еще одну компанию
        companyList.add(new Company("Delta Corp", "Программное обеспечение", 800));

        // Выводим компании после добавления
        System.out.println("\nКомпании после добавления:");
        for (Company company : companyList) {
            company.displayCompanyInfo();
        }

    }

    // Метод для удаления компании из списка по названию
    public static void removeCompanyByName(ArrayList<Company> companyList, String companyName) {
        for (int i = 0; i < companyList.size(); i++) {
            if (companyList.get(i).getName().equals(companyName)) {
                companyList.remove(i);
                System.out.println("Компания '" + companyName + "' удалена.");
                return; // Выходим после удаления
            }
        }
        System.out.println("Компания '" + companyName + "' не найдена.");
    }
}
