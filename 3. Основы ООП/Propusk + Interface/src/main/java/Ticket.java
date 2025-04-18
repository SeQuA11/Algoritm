public class Ticket {
    protected String surname; // Фамилия
    protected String name; // Имя
    protected String patronymic; // Отчество
    protected String faculty; // Факультет

    /**
     * Конструктор класса, инициализирует поля с переданными значениями
     * @param surname
     * @param name
     * @param patronymic
     * @param faculty
     */
    public Ticket(String surname, String name, String patronymic, String faculty) {
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.patronymic = patronymic;
    }

    /**
     * Метод для вывода полной информации о человеке
     */
    public void Conclusion() {
        System.out.println("\nФИО: " + surname + " " + name + " " + patronymic + "\nФакультет: " + faculty);
    }
}
