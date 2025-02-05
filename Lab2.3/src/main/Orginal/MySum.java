public class MySum {

    public static void main(String[] args) {
        if (args.length == 3) {
            try {
                String mysum = args[0];
                int num1 = Integer.parseInt(args[1]);
                int num2 = Integer.parseInt(args[2]);
                int sum = num1 + num2;
                System.out.println(sum);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Пожалуйста, введите целые числа.");
            }
        } else {
            System.out.println("Использование: MySum <число1> <число2>");
        }
    }
}
