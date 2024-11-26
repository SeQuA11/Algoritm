import java.util.Scanner; // импортируем класс
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeParseException;


public class SQA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // Настраиваемый формат
        System.out.println("Выберете один пункт из списка: " +
                "\n1. Сумма двух действительных чисел." +
                "\n2. Разность двух действительных чисел" +
                "\n3. Длинна гипотенузы по двум катетам." +
                "\n4. Количество дней (полных дней) между двумя датами вводимой и текущей(авто)" +
                "\n5. Выход");
        int progress = 1;
        while (progress != 0) {
            System.out.print("\nВвод: ");
            String cases = in.next();
            switch (cases) {
                case "1":
                    System.out.print("\nВведите два числа: ");
                    String sum1 = String.valueOf(inputNumber(in.next())), sum2 = String.valueOf(inputNumber(in.next()));
                    System.out.println("Сумма двух действительных чисел: " + sum(Double.valueOf(sum1), Double.valueOf(sum2)));
                    break;
                case "2":
                    System.out.print("\nВведите два числа: ");
                    String diff1 = String.valueOf(inputNumber(in.next())), diff2 = String.valueOf(inputNumber(in.next()));
                    System.out.println("Разность двух действительных чисел: " + diff(Double.valueOf(diff1), Double.valueOf(diff2)));
                    break;
                case "3":
                    System.out.println("\nВведите два числа: ");
                    String hypotenuse1 = String.valueOf(inputNumber(in.next())), hypotenuse2 = String.valueOf(inputNumber(in.next()));
                    System.out.println("Длинна гипотенузы по двум катетам: " + hypotenuse(Double.valueOf(hypotenuse1), Double.valueOf(hypotenuse2)));
                    break;
                case "4":
                    System.out.print("\nВведите дату в таком формате (дд.мм.гггг): ");
                    String date = in.next();
                    try {
                        LocalDate inputDate = LocalDate.parse(date, format);
                        long days = daysBetween(LocalDate.parse(inputDate.toString()));
                        System.out.println("Количество дней между сегодняшним днем и " + date + ": " + days);
                    } catch (DateTimeParseException e) {
                        System.err.println("Неверный формат даты. Пожалуйста, используйте (дд.мм.гггг)");
                    }
                    break;
                case "5":
                    System.out.println("\nВы вышли :0");
                    progress -= 1;
                    break;
                default:
                    System.err.println("\nНеверный ввод");
            }
        }
    }

    static double sum(double A, double B) {
        return A + B;
    }

    static double diff(double A, double B) {
        return A - B;
    }

    static double hypotenuse(double A, double B) {
        return Math.sqrt(A * A + B * B);
    }

    public static long daysBetween(LocalDate Date) {
        LocalDate Date1 = LocalDate.now();
        return Math.abs(ChronoUnit.DAYS.between(Date1, Date));
    }

    public static boolean inputNumber(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e){
            System.out.println("Неверный ввод. Введите вещественное число!!!");
            return false;
        }
    }
    public static String inNumber(boolean inputNumber) {
        if ()
    }
}
