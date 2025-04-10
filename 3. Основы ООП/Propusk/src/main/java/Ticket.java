public class Ticket {
    public String surname; // Фамилия
    public String name; // Имя
    public String patronymic; // Отчество
    public String faculty;

    public Ticket(String surname, String name, String patronymic, String faculty) {
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.patronymic = patronymic;
    }

    public void Conclusion() {
        System.out.println("\nФамилия: " + surname +
                           "\nИмя: " + name +
                           "\nОтчество: " + patronymic +
                           "\nФакультет: " + faculty);
    }
}
