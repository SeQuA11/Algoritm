import java.rmi.registry.Registry;
import java.time.LocalDate;

public class MainRegister {
    public static void main(String[] args) {

        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();
        // Извлекаем текущий год
        int currentYear = currentDate.getYear();
        int digit = 0;

        // Создаем массив объектов registries, содержащий инфо о пропусках преподавателей и студентов
        Ticket[] registries = new Ticket[10];
        registries[0] = new Student("Петренко", "Михаил", "Петрович", "Экономический", 2025);
        registries[1] = new Teacher("Иванов", "Алексей", "Сергеевич", "Экономический", "Экономист");
        registries[2] = new Student("Петрова", "Мария", "Владимировна", "Технологический", 2023);
        registries[3] = new Teacher("Смирнов", "Дмитрий", "Александрович", "Технологический", "Инженер");
        registries[4] = new Student("Кузнецова", "Анна", "Игоревна", "Строительный", 2025);
        registries[5] = new Student("Васильев", "Сергей", "Николаевич", "Информационный", 2024);
        registries[6] = new Teacher("Соколова", "Екатерина", "Юрьевна", "Строительный", "Бетономешальщик");
        registries[7] = new Student("Михайлов", "Андрей", "Викторович", "Информационные системы и программирование", 2025);
        registries[8] = new Teacher("Федорова", "Ольга", "Павловна", "Информационные системы и программирование", "Программист");
        registries[9] = new Teacher("Лебедев", "Николай", "Сергеевич", "Филосовский", "Лирик");

        // Выводим всю информацию о пропусках
        System.out.println("\n----------Инфо о пропусках преподавателей и студентов----------");
        for (Ticket reg: registries) {
            reg.Conclusion();
        }

        // Выводим информацию о студентах
        System.out.println("\n----------Инфо о пропусках студентов----------");
        for (Ticket reg: registries) {
            if (reg instanceof Student) // Присваиваем переменной reg только инфо из класса Student
                reg.Conclusion();
        }

        // Выводим информацию об аннулированных пропусках студентов и их количестве
        System.out.println("\n----------Инфо об аннулированных пропусках студентов----------");
        for (Ticket reg: registries) {
            if (reg instanceof Student) {
                Student student = (Student) reg; // Создаем объект student для доступа к полям из класса Student
                if (currentYear != student.year) {
                    System.out.println("Пропуск студента: " + student.surname + " " + student.name + " " + student.patronymic + " аннулирован.");
                    digit += 1;
                }
            }
        }
        System.out.println("Количество аннулированных пропусков:" + digit);
    }
}
