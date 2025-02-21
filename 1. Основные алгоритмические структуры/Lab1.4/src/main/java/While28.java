import java.util.Scanner; // импортируем класс

public class While28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        System.out.print("Введите значение ε: ");
        double epsilon = in.nextDouble();

        double aPrev = 2;
        double aCurr = 2 + 1 / aPrev;
        int k = 2;

        // Цикл while выполняется до тех пор, пока разница между aCurr и aPrev (|AK - AK-1|) больше или равна ε.
        // aPrev обновляется значением aCurr (т. е. AK-1 становится равным AK).
        // aCurr вычисляется по формуле AK = 2 + 1/AK-1.
        // k увеличивается на 1.
        while (Math.abs(aCurr - aPrev) >= epsilon) {
            aPrev = aCurr;
            aCurr = 2 + 1 / aPrev;
            k++;
        }

        System.out.println("Номер K: " + k);
        System.out.println("AK-1: " + aPrev);
        System.out.println("AK: " + aCurr);
    }
}
