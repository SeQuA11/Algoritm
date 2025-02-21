import java.time.LocalDate;

public class Metod {
    public static void main(String[] args) {

        //Вызываем методы в нужном порядке
        System.out.println(separator());
        System.out.println(theGreetig());
        System.out.println(separator());
        System.out.println(calculatePi());
        System.out.println(separator());
        System.out.println(thePresentTime());
        System.out.print(theColorDelete());
        System.out.println(separator());
        System.out.println(nonPrimeTimes());
    }

    // метод для вывода приветствия
    public static String theGreetig() {
        return "Привет, пользователь";
    }

    // Метод для вывода разделителя
    public static String separator() { return "*****************************************"; }

    // Метод для вывода актуальной даты и изменения цвета на желтый
    public static String thePresentTime() {
        LocalDate date = LocalDate.now();
        return "\u001B[33m" + date;
    }

    // Метод для перекрашивания текста обратно
    public static String theColorDelete() {
        return "\u001B[39m";
    }

    // Метод для вывода 10 рандомных чисел
    public static String nonPrimeTimes() {
        int counter = 0;
        while (counter <= 10) {
            int numbers = (int) (Math.random() * 100);
            if (numbers % 2 != 0) {
                counter += 1;
                System.out.println(numbers);
            }
        }
        return "";
    }

    // Метод для вывода числа pi
    public static float calculatePi() {
        float numbers = 1;
        float numbersMinus = 0;
        float numbersPlus = 0;
        for (float i = 3; i <= 1500; i += 4) {
            numbersMinus += numbers / i;

        }
        for (float i = 5; i <= 1500; i += 4) {
            numbersPlus += numbers / i;
        }
        return (numbers - numbersMinus + numbersPlus) * 4;
    }
}
