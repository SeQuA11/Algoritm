import java.util.Scanner; // импортируем класс

public class While15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер

        System.out.print("Введите процент для увеличения длины пробежки: ");
        float S = in.nextFloat(); // переменная для числа S
        float conBut = 10.0F; // пробежка в первый день
        int K = 0; // счетчик дней

        while (conBut <= 200) {
            conBut += conBut * (S / 100); // подсчет километрожа
            K += 1; // счетчик дней
        }
        System.out.println("Через " + K + " дня(ей) суммарный пробег превысит 200 км");
        System.out.println("Суммарный пробег: " + conBut + " км");
    }
}
