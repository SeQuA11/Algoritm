import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Project implements Developable {
    private String projectName;  // Название проекта
    private String description;  // Описание проекта
    private List<Task> tasks;      // Список задач в проекте
    private LocalDate startDate;   // Дата начала проекта
    private LocalDate endDate;     // Дата окончания проекта

    // Конструктор класса Project
    public Project(String projectName, String description, LocalDate startDate, LocalDate endDate) {
        this.projectName = projectName;
        this.description = description;
        this.tasks = new ArrayList<>(); // Инициализация списка задач
        this.startDate = startDate;     // Установка даты начала
        this.endDate = endDate;         // Установка даты окончания
    }

    // Метод для получения названия проекта
    public String getProjectName() {
        return projectName;
    }

    // Метод для получения описания проекта
    public String getDescription() {
        return description;
    }

    // Метод для получения списка задач
    public List<Task> getTasks() {
        return tasks;
    }

    // Метод для получения даты начала проекта
    public LocalDate getStartDate() {
        return startDate;
    }

    // Метод для получения даты окончания проекта
    public LocalDate getEndDate() {
        return endDate;
    }

    // Реализация метода createTask из интерфейса Developable
    @Override
    public void createTask(String taskDescription) {
        Task newTask = new Task(taskDescription); // Создание новой задачи
        tasks.add(newTask); // Добавление задачи в список
        System.out.println("Задача '" + taskDescription + "' создана для проекта '" + projectName + "'.");
    }

    // Реализация метода completeTask из интерфейса Developable
    @Override
    public void completeTask(String taskDescription) {
        for (Task task : tasks) {
            if (task.getDescription().equals(taskDescription)) { // Поиск задачи по описанию
                task.setCompleted(true); // Отметка задачи как завершенной
                System.out.println("Задача '" + taskDescription + "' завершена для проекта '" + projectName + "'.");
                return; // Выход из цикла после нахождения и завершения задачи
            }
        }
        System.out.println("Задача '" + taskDescription + "' не найдена в проекте '" + projectName + "'.");
    }

}
