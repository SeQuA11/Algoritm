import java.util.ArrayList;
import java.util.List;

public class Developer {

    private String name;             // Имя разработчика
    private List<Project> assignedProjects; // Список проектов, к которым прикреплен разработчик

    // Конструктор класса Developer
    public Developer(String name) {
        this.name = name;
        this.assignedProjects = new ArrayList<>(); // Инициализация списка проектов
    }

    // Метод для назначения разработчика на проект
    public void aProject(Project project) {
        assignedProjects.add(project); // Добавление проекта в список
        System.out.println("Разработчик '" + name + "' назначен на проект '" + project.getProjectName() + "'.");
    }

    // Метод для управления задачами (создание и завершение)
    public void manageTask(Project project, String taskDescription, boolean complete) {
        if (assignedProjects.contains(project)) { // Проверка, прикреплен ли разработчик к проекту
            if (complete) {
                project.completeTask(taskDescription); // Завершение задачи
            } else {
                project.createTask(taskDescription); // Создание задачи
            }
        } else {
            System.out.println("Разработчик '" + name + "' не назначен на проект '" + project.getProjectName() + "'.");
        }
    }
}
