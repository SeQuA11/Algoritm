import java.util.Scanner; // Библиотека для скана входящей информации

public class For15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        int N = in.nextInt(); // 1 входящее число (Степень в которую возводим)
        int K = in.nextInt(); // 2 входящее число (Возводимое число)
        int proz = 1; //переменная для умножения

        for(int i = 1; i <= N; i++) { // перебор всех чисел от 1 до N включительно
            proz *= K; // Считаем степень числа
        }
        System.out.println("Степень: " + proz); // Вывод степень числа
    }
}
