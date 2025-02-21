import java.util.Scanner; // импортируем класс

public class While29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Метод вызывающий сканер
        System.out.print("Введите значение ε: ");
        double epsilon = in.nextDouble();

        double aPrev1 = 1;
        double aPrev2 = 2;
        double aCurr = (aPrev2 + 2 * aPrev1) / 3;
        int k = 3;

        // Цикл while выполняется, пока разность между aCurr и aPrev2 (|AK - AK-1|) больше или равна ε.
        // aPrev1 обновляется значением aPrev2 (т.е. AK-2 становится равным AK-1).
        // aPrev2 обновляется значением aCurr (т.е. AK-1 становится равным AK).
        // aCurr вычисляется по формуле AK = (AK-2 + 2*AK-1)/3.
        // k увеличивается на 1.
        while (Math.abs(aCurr - aPrev2) >= epsilon) {
            aPrev1 = aPrev2;
            aPrev2 = aCurr;
            aCurr = (aPrev2 + 2 * aPrev1) / 3;
            k++;
        }

        System.out.println("Номер K: " + k);
        System.out.println("AK-1: " + aPrev2);
        System.out.println("AK: " + aCurr);
    }
}
