import  java.util.Scanner;
import java.util.Random;

public class ReleaseProgramm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print(""); int langArrays = in.nextInt();
        int[] prog = new int[langArrays];
        for (int i = 0; i < langArrays; i++) {
            prog[i] = rnd.nextInt(-100, 101);
            System.out.println(prog[i]);
        }
    }
}
