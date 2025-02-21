import java.util.Scanner; // импортируем класс

public class If20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int A = in.nextInt(); // 1 входящее число
        int B = in.nextInt(); // 2 входящее число
        int C = in.nextInt(); // 3 входящее число

        if (Math.abs(A - B) > Math.abs(A - C)) { // Если длина отрезка от А до В длиннее чем от А до С
            System.out.println(Math.abs(A - C) + " - C"); // то выводим длину от А до С и печатаем С
        }
        else if (Math.abs(A - B) == Math.abs(A - C)) { // Если длина отрезка от А до В равна длинне от А до С
            System.out.println(Math.abs(A - B) + " - А и В равны"); // то выводим длинну и А В равны
        } else {
            System.out.println(Math.abs(A - B) + " - B"); // В противном случае выводим длину от А до В и печатаем В
        }
    }
}
