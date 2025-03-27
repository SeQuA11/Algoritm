import java.util.ArrayList;

public class Airplane extends Transport{
    public int height;

    public Airplane(int power, int price, int number,int height, String stamp) {
        super(power, price, number, stamp);
        this.height = height;
    }

    public Airplane(String arg) {super(arg);}

    public void airTax(ArrayList<Airplane> airplanes) {
        int carTax = 0;
        for (Airplane air:airplanes) {
            carTax += air.price;
        }
        System.out.println(carTax / 100 * 3);
    }

    public void maxPrice(ArrayList<Car> car) {
        int airTax = 0;
        boolean trfa = false;
        String marka = "";
        for (Car cars:car) {
            if (cars.price > airTax) {
                airTax = cars.price;
                trfa = cars.tehInspection;
                marka = cars.stamp;
            }
        }
        System.out.println("Марка: " + marka);
        System.out.println("Стоимость: " + airTax + " рублей");

        if (trfa) {
            System.out.println("Техосмотр пройден");
        } else {
            System.out.println("Техосмотр не пройден");
        }
    }
}
