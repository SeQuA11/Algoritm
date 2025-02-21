import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Количество вагонов: ");
        int N = in.nextInt();
        System.out.print("Количество мест в вагоне: ");
        int n1 = in.nextInt();
        int[][] mesto = new int[N][n1];
        int freemesto = 0;


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < mesto[i].length; j++) {
                mesto[i][j] = rnd.nextInt(0, 2);
            }
        }

        System.out.print("Введите номер вагона (1-" + N + "): ");
        int wagon = in.nextInt();

        for (int j = 0; j < mesto[wagon - 1].length; j++) {
            if (mesto[wagon - 1][j] == 0) {
                freemesto++;
            }
        }

        System.out.println("В вагоне " + wagon + "," + freemesto + " свободных мест(а).");
    }
}
