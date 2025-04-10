public class Teacher extends Ticket {
    protected String department; // Кафедра

    public Teacher(String surname, String name, String patronymic, String faculty, String department) {
        super(surname,name,patronymic,faculty);
        this.department = department;
    }

    @Override
    public void Conclusion() {
        super.Conclusion();
        System.out.println("\nКафедра: " + department);
    }
}
