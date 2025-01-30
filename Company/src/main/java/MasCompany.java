import java.util.Scanner;
import java.util.ArrayList;

class MasCompany {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Выделяем место в памяти и создаем объект для метода Scanner
        boolean bool = true; // Булевое значение bool для завершения цикла
        var user_command = "";
        ArrayList<Company> company = new ArrayList<>(); // Список company
        Company comp = new Company(user_command); // Объект comp с пустым значением user_command

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

        /**
        Создаём объекты посредством передачи данных о компаниях конструктору Company и добавляем их в список company
         */
        company.add(new Company("RotFish","Туризм", 115, 34000));
        company.add(new Company("Genesis","Геодезия", 1567, 68000));
        company.add(new Company("ITHome","Серверная", 789, 115000));
        company.add(new Company("CoffeTime","Кофейня", 24, 53000));

        // Метод из класса Company, позволяющий выводить данные о компаниях из списка
        comp.infoCompany(company);

        /**
        Цикл принимающий переменную bool в качестве аргумента и обработкой команд с помощью оператора switch case
         */
        while (bool) {
            // Приглашение ввести команду
            System.out.println();
            System.out.print("Введите команду: ");
            user_command = in.nextLine(); // Присваиваем переменной user_command значение in.nextLine() для возможности
                                          // вписывать команды пользователем
            /**
             Оператор switch case, который принимает строку из переменной user_command
             и выполняет case с заданным пользователем значением
             */
            switch (user_command) {
                // Если user_command содержит строку 1, то выводится Список команд
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
                // Если user_command содержит строку 2, то выводится информация о компаниях
                case "2": {
                    // Метод из класса Company, позволяющий выводить данные о компаниях из списка
                    comp.infoCompany(company);
                    break;
                }
                // Если user_command содержит строку 2, то в список company можно добавить данные о новой компании
                case "3": {
                    System.out.print("Введите название компании: ");
                    String name = in.nextLine();
                    System.out.print("Введите деятельность компании: ");
                    String work = in.nextLine();
                    System.out.print("Введите количество сотрудников в компании: ");
                    int persons = Integer.parseInt(in.nextLine());
                    System.out.print("Введите размер з/п компании: ");
                    int money = Integer.parseInt(in.nextLine());
                    // Метод из класса Company, позволяющий добавлять данные о компании в список
                    company.add(new Company(name,work, persons, money));
                    break;
                }
                // Если user_command содержит строку 2, то из списка можно удалить данные о компании с заданным названием
                case "4": {
                    System.out.print("Введите название компании для удаления: ");
                    String name = in.nextLine();
                    // Метод из класса Company, позволяющий удалять данные о компании из списка
                    Company.removeCompanyByName(company, name);
                    break;
                }
                /**
                Если выбрать этот кейс, то переменная bool = true примет значение false,
                после чего цикл завершиться как и программа
                 */
                case "5": {
                    bool = false;
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


