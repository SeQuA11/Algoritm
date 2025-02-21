import java.util.Scanner; // Библиотека для скана входящей информации

public class For33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число от какого числа будет отсчет
        int K = in.nextInt(); // 2 входящее число и до какого
        int n0 = 1; //первое ичисло фибоначи
        int n1 = 1; // второе число фибоначи
        int n2 = 0; // переменная для суммы

        System.out.print(n0 + "  " + n1 + "  "); // Вывод первых двух чисел
        for(int i = N; i <= K; i++) { // перебор всех чисел от N до K включительно
            n2 = n0 + n1; // Считаем сумму двух ближайших
            System.out.print(n2 + "  "); // выводим
            n0 = n1; //
            n1 = n2; //
        }
        System.out.println(); // Вывод степень числа
    }
}
