public class Student extends Ticket implements TrueFalseTicket {
    protected int year; // год

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
}
