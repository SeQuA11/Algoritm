import java.util.Scanner; // импортируем класс

public class If13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.println("Введите числа: ");
        int A = in.nextInt(); // первое число
        int B = in.nextInt(); // второе число
        int C = in.nextInt(); // третье число
        if ((A <= B && B <= C) || (A >= B && B >= C)) { // если В больше равно А и В меньше равно С или если В больше равно С и В меньше равно А
            System.out.println(B); // то выводим В
        }
        else if ((B <= A && A <= C) || (B >= A && A >= C)) { // если A больше равно B и A меньше равно С или если A больше равно С и A меньше равно B
            System.out.println(A); // то выводим A
        }
        else if ((B <= C && C <= A) || (B >= C && C >= A)) { // если C больше равно B и C меньше равно A или если C больше равно A и C меньше равно B
            System.out.println(C); // то выводим C
        }
    }
}
