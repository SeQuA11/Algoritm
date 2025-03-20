import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Переменная, которая будет хранить команду пользователя
        var ser_command = "";

        man1 SomeMan = null;

        // Бесконечный цикл
        boolean Infinity = true;
        while (Infinity) {  // Пока Infinity равно true
            // Приглашение ввести команду
            System.out.println("Введите команду: ");
            // Получение строки (команды) от пользователя
            ser_command = sc.nextLine();

            // Обработка команды с помощью оператора ветвления
            switch (ser_command) {
                case "exit": {
                    Infinity = false;
                    // Цикл завершается, и программа завершит своё выполнение
                    break;
                }

                // Если user_command содержит строку help
                case "help": {
                    System.out.println("Список команд: ");
                    System.out.println("--------------");
                    System.out.println();
                    System.out.println("create_man: команда создаёт человека, (экземпляр класса Man)");
                    System.out.println("kill_man: команда убивает человека");
                    System.out.println("talk: команда заставляет человека говорить (если создан экземпляр класса)");
                    System.out.println("go: команда заставляет человека идти (если создан экземпляр класса)");
                    System.out.println("isalive: команда проверяет, жив ли человек (если создан экземпляр класса)");
                    System.out.println();
                    System.out.println("------------------");
                    System.out.println("------------------");
                    break;
                }

                case "create_man": {
                    // проверяем, создан ли уже какой-либо человек
                    if (SomeMan != null) {
                        SomeMan.Kill();
                    }
                    // Человек уже существует
                    // Просим ввести имя человека
                    System.out.println("Введите имя создаваемого человека: ");
                    ser_command = sc.nextLine();

                    // Создаём новый объект в памяти, в качестве параметра и передаём имя человека
                    SomeMan = new man1(ser_command);

                    // Сообщаем о создании
                    System.out.println("Человек успешно создан :) ");
                    break;
                }

                case "kill_man": {
                    // Проверяем, что объект уже существует в памяти
                    if (SomeMan != null){
                        SomeMan.Kill();
                        System.out.println("Человек умер (RIP)");
                    } else {
                        System.out.println("Человек не создан :( . Команда не может быть выполнена");
                    }
                    break;
                }

                case "talk": {
                    // Проверяем, что объект существует в памяти
                    if (SomeMan != null && SomeMan.isALive() == true) {
                        // Вызываем функцию разговора
                        SomeMan.Talk();
                    } else {
                        System.out.println("Человек не создан :( . Команда не может быть выполнена");
                    }
                    break;
                }

                case "go": {
                    // Проверяем, что объект существует в памяти
                    if (SomeMan != null && SomeMan.isALive() == true) {
                        SomeMan.Go();
                    } else {
                        System.out.println("Человек не создан :( . Команда не может быть выполнена");
                    }
                    break;
                }
                case "is_alive": {
                    // Проверяем, что объект уже существует в памяти
                    if (SomeMan != null) {
                        if (SomeMan.isALive() == true) {
                            System.out.println("Человек жив");
                        } else {
                            System.out.println("Человек мёртв");
                        }
                    } else {
                        System.out.println("Человек не создан :( . Команда не может быть выполнена");
                    }
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

