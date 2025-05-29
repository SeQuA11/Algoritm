import java.time.LocalDate;

public class Menedger {
    private String name; // Имя менеджера

    // Конструктор класса Manager
    public Menedger(String name) {
        this.name = name;
    }

    // Метод для создания нового проекта
    public Project createProject(String projectName, String description, LocalDate startDate, LocalDate endDate) {
        Project newProject = new Project(projectName, description, startDate, endDate); // Создание проекта
        System.out.println("Менеджер '" + name + "' создал проект '" + projectName + "'.");
        return newProject; // Возврат созданного проекта
    }

    // Метод для назначения разработчика на проект
    public void assignDeveloperToProject(Developer developer, Project project) {
        developer.aProject(project); // Назначение разработчика на проект
    }



}
