public class EvenOdd {

    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int number = Integer.parseInt(args[0]);
                if (number % 2 == 0) {
                    System.out.println(number + " - четное число.");
                } else {
                    System.out.println(number + " - нечетное число.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Пожалуйста, введите целое число.");
            }
        } else {
            System.out.println("Использование: EvenOdd <число>");
        }
    }
}
