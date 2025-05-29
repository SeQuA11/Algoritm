import java.time.LocalDate;

public class SystemIT {

    public static void main(String[] args) {
        // Создаем менеджера
        Menedger manager = new Menedger("Григорьева Надежда");

        // Создаем разработчиков
        Developer developer1 = new Developer("Шатров Иван");
        Developer developer2 = new Developer("Варнаков Степан");

        // Создаем проекты
        System.out.println("\n---------------Создание проектов-----------------\n");
        LocalDate Start1 = LocalDate.of(2023, 10, 26);
        LocalDate End1 = LocalDate.of(2023, 12, 31);
        Project project1 = manager.createProject("Интернет-магазин", "Разработка нового WoldBoris.", Start1, End1);

        LocalDate Start2 = LocalDate.of(2023, 11, 15);
        LocalDate End2 = LocalDate.of(2024, 2, 29);
        Project project2 = manager.createProject("Мобильное приложение", "Разработка мобильного приложения для Android.", Start2, End2);

        System.out.println("\n---------------Сроки реализации проектов-----------------\n");
        // Выводим информацию о проектах, включая сроки
        System.out.println("Проект: " + project1.getProjectName() + ", Срок: " + project1.getStartDate() + " - " + project1.getEndDate());
        System.out.println("Проект: " + project2.getProjectName() + ", Срок: " + project2.getStartDate() + " - " + project2.getEndDate());

        // Назначаем разработчиков на проекты
        System.out.println("\n---------------Назначение разработчиков на проект-----------------\n");
        manager.assignDeveloperToProject(developer1, project1);
        manager.assignDeveloperToProject(developer2, project1);
        manager.assignDeveloperToProject(developer2, project2);

        System.out.println("\n---------------Описание задачи-----------------\n");
        // Управляем задачами
        developer1.manageTask(project1, "Реализация интернет-магазина", false); // Создаем задачу
        developer2.manageTask(project1, "Реализация интернет-магазина", true);  // Завершаем задачу
        developer2.manageTask(project2, "Разработка пользовательского интерфейса", false); // Создание задачи для Проекта 2

        System.out.println("\n---------------Статус задачи-----------------\n");
        // Проверяем статус задач
        for (Task task : project1.getTasks()) {
            System.out.println("Задача: " + task.getDescription() + ", Завершена: " + task.isCompleted());
        }

        for (Task task : project2.getTasks()) {
            System.out.println("Задача: " + task.getDescription() + ", Завершена: " + task.isCompleted());
        }
    }
}
