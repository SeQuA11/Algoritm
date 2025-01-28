import java.util.Scanner;
import java.util.ArrayList;

class MasCompany {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //
        boolean bool = true; //
        var user_command = ""; //
        ArrayList<Company> company = new ArrayList<>(); //
        Company comp = new Company(user_command); //

        System.out.println("Список команд: ");
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("1. Help - меню помощи.");
        System.out.println("2. Info - информация о компаниях.");
        System.out.println("3. Add - добавление данных о компании.");
        System.out.println("4. Remove - удаление данных о компании.");
        System.out.println("5. Exit - выход из программы.");
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println();

        /*

         */
        company.add(new Company("RotFish","Туризм", 115, 34000));
        company.add(new Company("Genesis","Геодезия", 1567, 68000));
        company.add(new Company("ITHome","Серверная", 789, 115000));
        company.add(new Company("CoffeTime","Кофейня", 24, 53000));
        //
        comp.infoCompany(company);

        /*

         */
        while (bool) {
            // Приглашение ввести команду
            System.out.println();
            System.out.print("Введите команду: ");
            user_command = in.nextLine(); //

            // Обработка команды с помощью оператора ветвления
            switch (user_command) {
                // Если user_command содержит строку help
                case "1": {
                    System.out.println("Список команд: ");
                    System.out.println("////////////////////////////////////////////////////////////");
                    System.out.println("1. Help - меню помощи.");
                    System.out.println("2. Info - информация о компаниях.");
                    System.out.println("3. Add - добавление данных о компании.");
                    System.out.println("4. Remove - удаление данных о компании.");
                    System.out.println("5. Exit - выход из программы.");
                    System.out.println("////////////////////////////////////////////////////////////");
                    break;
                }
                //
                case "2": {
                    //
                    comp.infoCompany(company);
                    break;
                }
                //
                case "3": {
                    System.out.print("Введите название компании: ");
                    String name = in.nextLine();
                    System.out.print("Введите деятельность компании: ");
                    String work = in.nextLine();
                    System.out.print("Введите количество сотрудников в компании: ");
                    int persons = Integer.parseInt(in.nextLine());
                    System.out.print("Введите размер з/п компании: ");
                    int money = Integer.parseInt(in.nextLine());
                    //
                    company.add(new Company(name,work, persons, money));
                    break;
                }
                //
                case "4": {
                    System.out.print("Введите название компании для удаления: ");
                    String name = in.nextLine();
                    //
                    Company.removeCompanyByName(company, name);
                    break;
                }
                //
                case "5": {
                    bool = false;
                    // Цикл завершается, и программа завершит своё выполнение
                    break;
                }
                // Если команду не удалось определить
                default: {
                    System.out.println("Ваша команда не определена, пожалуйста, повторите снова");
                    System.out.println("Для вывода списка команд введите команду 1");
                    System.out.println("Для завершения программы введите команду 5");
                    break;
                }
            }
        }
    }
}


