import java.rmi.registry.Registry;
import java.time.LocalDate;

public class MainRegister {
    public static void main(String[] args) {

        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();
        // Извлекаем текущий год
        int currentYear = currentDate.getYear();

        Ticket[] registries = new Ticket[10];
        registries[0] = new Student("Петренко", "", "", "", 2024);
        
    }
}
