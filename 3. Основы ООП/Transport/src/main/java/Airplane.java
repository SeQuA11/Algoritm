import java.util.ArrayList;

//
public class Airplane extends Transport{
    public int height; //

    /**
     *
     */
    public Airplane(String arg) {super(arg);}

    /**
     *
     */
    public Airplane(int power, double price, int number,int height, String stamp) {
        super(power, price, number, stamp);
        this.height = height;
    }

    /**
     *
     */
    public void airTax(ArrayList<Airplane> airplanes) {
        int airTax = 0;
        for (Airplane air:airplanes) {
            airTax += air.price;
        }
        System.out.println(airTax / 100 * 3);
    }

    /**
     *
     */
    public void setAir(ArrayList<Airplane> airplanes, String airs) {
        double airTax = 0;
        int height1 = 0;
        String marka = "";
        for (Airplane air:airplanes) {
            if (air.stamp == airs) {
                marka = air.stamp;
                airTax = air.price;
                height1 = air.height;
            }
        }

        System.out.println("Марка: " + marka);
        System.out.println("Стоимость: " + airTax + " рублей");
        System.out.println("Максимальная высота: " + height1 + "м");
    }

    /**
     *
     */
    public void maxPriceAir(ArrayList<Airplane> airplanes) {
        double airTax = 0;
        int power1 = 0;
        String marka = "";
        for (Airplane air:airplanes) {
            if (air.price > airTax) {
                airTax = air.price;
                power1 = air.power;
                marka = air.stamp;
            }
        }

        System.out.println("Марка: " + marka);
        System.out.println("Мощность: " + power1);
        System.out.println("Стоимость: " + airTax + " рублей");
    }

    /**
     *
     */
    public void displayAirInfo() {
        System.out.println();
        System.out.println("\nМарка: " + stamp
                + "\nМощьность самолета: " + power + " л.с"
                + "\nЦена: " + price + " долларов"
                + "\nНомер: " + number
                + "\nМаксимальная высота: " + height + "м");
    }

    /**
     *
     */
    public void airInfo(ArrayList<Airplane> airplanes) {
        for (Airplane air:airplanes) {
            air.displayAirInfo();
        }
    }
}
