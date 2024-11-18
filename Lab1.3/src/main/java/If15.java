import java.util.Scanner; // импортируем класс

public class If15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int A = in.nextInt(); // 1 входящее число
        int B = in.nextInt(); // 2 входящее число
        int C = in.nextInt(); // 3 входящее число
        int counter = A + B + C; // сумма всех чисел
        // находим наименьшее и просто вычитаем из сумм чисел
        if (A >= B) { // если B меньше равно A, то к следующему условию
            if (B >= C) { // если С меньше равно B
                System.out.println(counter - C); // то выводим сумма - С
            } else { // если нет
                System.out.println(counter - B); // то выводим сумма - В
            }
        } else { // если нет
            if (A >= C) { // то если С меньше равно A
                System.out.println(counter - C); // то выводим сумма - С
            } else { // если нет
                System.out.println(counter - A); // то выводим сумма - A
            }
        }
    }
}
