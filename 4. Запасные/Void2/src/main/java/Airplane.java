import java.util.ArrayList;

public class Airplane extends Transport{
    public int height;

    public Airplane(int power, int price, int number,int height, String stamp) {
        super(power, price, number, stamp);
        this.height = height;
    }

    public void airTax(ArrayList<Airplane> airplanes) {}
}
