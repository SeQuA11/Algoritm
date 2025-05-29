class Task {
    private String description; // Описание задачи
    private boolean completed;   // Статус завершения задачи

    // Конструктор класса Task
    public Task(String description) {
        this.description = description;
        this.completed = false; // По умолчанию задача не завершена
    }

    // Метод для получения описания задачи
    public String getDescription() {
        return description;
    }

    // Метод для проверки, завершена ли задача
    public boolean isCompleted() {
        return completed;
    }

    // Метод для установки статуса завершения задачи
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
