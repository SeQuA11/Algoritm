import java.util.ArrayList;

public class Car extends Transport{
    public int mileage;
    public boolean tehInspection;

    public Car(int power, int price, int number, int mileage, String stamp, boolean tehInspection) {
        super(power, price, number, stamp);
        this.mileage = mileage;
        this.tehInspection = tehInspection;
    }

    public void carTax(ArrayList<Car> car) {}
}
