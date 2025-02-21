import java.util.Scanner; // Библиотека для скана входящей информации

public class For39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int A = in.nextInt(); // 1 входящее число
        int B = in.nextInt(); // 2 входящее число

        for(int i = A; i <= B; i++) { // Перебор всех целых чисел от A до B включительно
            System.out.println(String.valueOf(i).repeat(i));// Преобразуем число i в строку и повторяем i раз
        }
    }
}
