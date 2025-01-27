import java.util.Scanner;
import java.util.ArrayList;

class MasCompany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean bool = true;
        var user_command = "";
        ArrayList<Company> company = new ArrayList<>();
        Company comp = new Company(user_command);

        company.add(new Company("RotFish","Туризм", 115, 34000));
        company.add(new Company("Genesis","Геодезия", 1567, 68000));
        company.add(new Company("ITHome","Серверная", 789, 115000));
        company.add(new Company("CoffeTime","Кофейня", 24, 53000));
        comp.infoCompany(company);

        while (bool) {
            // Приглашение ввести команду
            System.out.println("Введите команду: ");
            user_command = in.nextLine();

            // Обработка команды с помощью оператора ветвления
            switch (user_command) {
                // Если user_command содержит строку help
                case "1": {
                    System.out.println("Список команд: ");
                    System.out.println("////////////////////////////////////////////////////////////");
                    System.out.println("create_pers: команда для создания персонажа.");
                    System.out.println("remove: команда для изменения одной из характеристик.");
                    System.out.println("Har_pers: перечень характеристик персонажа");
                    System.out.println("exit: команда для выхода.");
                    System.out.println("////////////////////////////////////////////////////////////");
                    break;
                }

                case "2": {
                    comp.infoCompany(company);
                    break;
                }

                case "3": {
                    
                    company.add(new Company("CoffeTime","Кофейня", 24, 53000));
                    break;
                }

                case "4": {

                }


                case "5": {
                    bool = false;
                    // Цикл завершается, и программа завершит своё выполнение
                    break;
                }

                // Если команду не удалось определить
                default: {
                    System.out.println("Ваша команда не определена, пожалуйста, повторите снова");
                    System.out.println("Для вывода списка команд введите команду help");
                    System.out.println("Для завершения программы введите команду exit");
                    break;
                }
            }
        }
    }
}


