public class Builder extends Ticket implements TrueFalseTicket {
    protected int beginningYear; // год
    protected int endYear;

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
}
