import java.time.LocalDate;

public class Student extends Ticket implements TrueFalseTicket {
    protected int year; // год

    LocalDate currentDate = LocalDate.now(); // Получаем текущую дату
    int currentYear = currentDate.getYear(); // Извлекаем текущий год

    /**
     * Конструктор класса, инициализирует поля с переданными значениями
     * @param surname
     * @param name
     * @param patronymic
     * @param faculty
     * @param year
     */
    public Student(String surname, String name, String patronymic, String faculty, int year) {
        super(surname,name,patronymic,faculty);
        this.year = year;
    }

    /**
     * Метод наследник с доп инфо о студенте
     */
    @Override
    public void Conclusion() {
        super.Conclusion();
        System.out.println("Год: " + year);
    }

    /**
     * Метод интерфейса для вывода инфо о том, аннулировать пропуск или обновить
     * @return
     */
    @Override
    public boolean getTicket() {
        if (year != currentYear) {
            return false;
        }
        return true;
    }
}
