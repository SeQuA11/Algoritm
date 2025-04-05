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

    public void maxPrice(ArrayList<Airplane> airplanes) {
        int airTax = 0;
        int power1 = 0;
        String marka = "";
        for (Airplane air:airplanes) {
            if (air.price > airTax) {
                airTax = air.price;
                power1 = air.power;
                marka = air.stamp;
            }
        }

        System.out.println("Мощность: " + power1);
        System.out.println("Марка: " + marka);
        System.out.println("Стоимость: " + airTax + " рублей");
    }
}
