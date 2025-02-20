import java.util.Random;

public class Score {
    static int numberScore;
    static int sizeContribution;
    Random rnd = new Random();

    public Score() {
        this.numberScore = rnd.nextInt(10000000, 99999999);
        this.sizeContribution = rnd.nextInt(0, 9999999);
    }

    public String toString() {
        return numberScore + " << " + sizeContribution + " >>";
    }

}
