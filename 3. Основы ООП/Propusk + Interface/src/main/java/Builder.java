import java.time.LocalDate;

public class Builder extends Ticket implements TrueFalseTicket {
    protected int beginningYear; // год
    protected int endYear;

    LocalDate currentDate = LocalDate.now(); // Получаем текущую дату
    int currentYear = currentDate.getYear(); // Извлекаем текущий год

    /**
     * Конструктор класса, инициализирует поля с переданными значениями
     * @param surname
     * @param name
     * @param patronymic
     * @param faculty
     * @param beginningYear
     * @param endYear
     */
    public Builder(String surname, String name, String patronymic, String faculty, int beginningYear, int endYear) {
        super(surname,name,patronymic,faculty);
        this.beginningYear = beginningYear;
        this.endYear = endYear;
    }

    /**
     * Метод наследник с доп инфо о студенте
     */
    @Override
    public void Conclusion() {
        super.Conclusion();
        System.out.println("Год начала: " + beginningYear + "\nГод конца: " + endYear);
    }

    /**
     * Метод интерфейса для вывода инфо о том, аннулировать пропуск или обновить
     * @return
     */
    @Override
    public boolean getTicket() {
        if ((currentYear - 1) <= beginningYear && endYear <= currentYear) {
            return true;
        }
        return false;
    }
}
