import java.util.Scanner; // Библиотека для скана входящей информации

public class For1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число
        int K = in.nextInt(); // 2 входящее число

        for(int i = 0; i < N; i++) { // От i до N раз повторяется число K
            System.out.println(K); // Вывод числа K
        }
    }
}
