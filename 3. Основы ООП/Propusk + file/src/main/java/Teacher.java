public class Teacher extends Ticket {
    protected String department; // Кафедра

    /**
     * Конструктор класса, инициализирует поля с переданными значениями
     * @param surname
     * @param name
     * @param patronymic
     * @param faculty
     * @param department
     */
    public Teacher(String surname, String name, String patronymic, String faculty, String department) {
        super(surname,name,patronymic,faculty);
        this.department = department;
    }

    /**
     * Метод наследник с доп инфо об учителе
     */
    @Override
    public void Conclusion() {
        super.Conclusion();
        System.out.println("Кафедра: " + department);
    }
}
