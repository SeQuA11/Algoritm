import java.rmi.registry.Registry;

public class MainRegister {
    public static void main(String[] args) {

        // Создаем массив объектов registries, содержащий инфо о пропусках преподавателей и студентов
        Ticket[] registries = new Ticket[14];
        registries[0] = new Student("Петренко", "Михаил", "Петрович", "Экономический", 2025);
        registries[1] = new Builder("Воробьев", "Иван", "Ильич", "Строительный", 2013, 2025);
        registries[2] = new Teacher("Иванов", "Алексей", "Сергеевич", "Экономический", "Экономист");
        registries[3] = new Student("Петрова", "Мария", "Владимировна", "Технологический", 2023);
        registries[4] = new Builder("Сандал", "Али", "Алиев", "ИИнформационные системы и программирование", 2024, 2025);
        registries[5] = new Teacher("Смирнов", "Дмитрий", "Александрович", "Технологический", "Инженер");
        registries[6] = new Student("Кузнецова", "Анна", "Игоревна", "Строительный", 2025);
        registries[7] = new Builder("Кардык", "Самуил", "Рамшанович", "Строительный", 2024, 2025);
        registries[8] = new Student("Васильев", "Сергей", "Николаевич", "Информационный", 2024);
        registries[9] = new Teacher("Соколова", "Екатерина", "Юрьевна", "Строительный", "Бетономешальщик");
        registries[10] = new Student("Михайлов", "Андрей", "Викторович", "Информационные системы и программирование", 2025);
        registries[11] = new Teacher("Федорова", "Ольга", "Павловна", "Информационные системы и программирование", "Программист");
        registries[12] = new Teacher("Лебедев", "Николай", "Сергеевич", "Философский", "Лирик");
        registries[13] = new Builder("Лебедева", "Ульяна", "Георгиевна", "Философский", 2023, 2024);

        // Выводим всю информацию о пропусках
        System.out.println("\n----------Инфо о пропусках преподавателей, студентов и строителей----------");
        for (Ticket reg: registries) {
            reg.Conclusion();
        }

        // Вывод инфо только о тех пропусках студентов и строителей, которые надо аннулировать
        System.out.println("\n----------Инфо о пропусках студентов и строителей, которые надо аннулировать----------");
        for (Ticket reg : registries) {
            if (reg instanceof Student) {
                Student student = (Student) reg; // Создаем объект student для доступа к полям из класса Student
                if (student.getTicket() == false) {
                    System.out.println("Пропуск студента: " + student.surname + " " + student.name + " " + student.patronymic + " аннулирован.");
                }
            }
        }

        for (Ticket reg : registries) {
            if (reg instanceof Builder) {
                Builder builder = (Builder) reg; // Создаем объект builder для доступа к полям из класса Builder
                if (builder.getTicket()) {
                    System.out.println("Пропуск строителя: " + builder.surname + " " + builder.name + " " + builder.patronymic + " аннулирован.");
                }
            }
        }

        // Вывод инфо только о пропусках преподавателей, которые надо обновить
        System.out.println("\n----------Инфо о пропусках преподавателей, которые надо обновить----------");
        for (Ticket reg : registries) {
            if (reg instanceof Teacher) {
                Teacher teacher = (Teacher) reg; // Создаем объект teacher для доступа к полям из класса Teacher
                if (teacher.getTicket()) {
                    System.out.println("Пропуск преподавателя: " + teacher.surname + " " + teacher.name + " " + teacher.patronymic + " обновлен.");
                }
            }
        }
    }
}
