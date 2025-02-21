import java.util.Scanner; // импортируем класс

public class If14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.println("Введите числа: ");
        int A = in.nextInt(); // первое число
        int B = in.nextInt(); // второе число
        int C = in.nextInt(); // третье число
        if (A >= B) { // если B меньше равно A, то к следующему условию
            if (B >= C) { // если С меньше равно B
                System.out.println(C); // то выводим С
            } else { // если нет
                System.out.println(B); // то выводим B
            }
        } else { // если нет
            if (A >= C) { // то если С меньше равно A
                System.out.println(C); // то выводим C
            } else { // если нет
                System.out.println(A); // то выводим A
            }
        }
        if (A >= B) { // если B меньше равно A, то к следующему условию
            if (A >= C) { // если C меньше равно A
                System.out.println(A); // то выводим A
            } else { // если нет
                System.out.println(C); // то выводим C
            }
        } else { // если нет
            if (B >= C) { // то если С меньше равно B
                System.out.println(B); // то выводим B
            } else { // если нет
                System.out.println(C); // то выводим C
            }
        }
    }
}
