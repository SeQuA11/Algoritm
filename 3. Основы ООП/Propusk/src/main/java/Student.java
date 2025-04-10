public class Student extends Ticket {
    int year;

    public Student(String surname, String name, String patronymic, String faculty, int year) {
        super(surname,name,patronymic,faculty);
        this.year = year;
    }

    @Override
    public void Conclusion() {
        super.Conclusion();
        System.out.println("\nГод: " + year);
    }
}
