import java.util.Scanner; // импортируем класс

public class If4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int A = in.nextInt(); // 1 входящее число
        int B = in.nextInt(); // 2 входящее число
        int C = in.nextInt(); // 3 входящее число
        int counter = 0; // счетчик для количества четных чисел

        if (A % 2 == 0) { // если А четное
            counter += 1; // то counter плюс 1
        }
        if (B % 2 == 0) { // если В четное
            counter += 1; // то counter плюс 1
        }
        if (C % 2 == 0) { // если С четное
            counter += 1; // то counter плюс 1
        }
        System.out.println(counter); // Вывод количества четных чисел
    }
}
