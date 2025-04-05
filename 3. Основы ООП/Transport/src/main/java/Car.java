import java.util.ArrayList;

public class Car extends Transport{
    public int mileage;
    public boolean tehInspection;

    public Car(String arg) { super(arg);}

    public Car(int power, int price, int number, int mileage, String stamp, boolean tehInspection) {
        super(power, price, number, stamp);
        this.mileage = mileage;
        this.tehInspection = tehInspection;
    }

    public void maxPrice(ArrayList<Car> car) {
        int carTax = 0;
        boolean trfa = false;
        String marka = "";
        int mileage1 = 0;
        for (Car cars:car) {
            if (cars.price > carTax) {
                carTax = cars.price;
                trfa = cars.tehInspection;
                marka = cars.stamp;
                mileage1 = cars.mileage;
            }
        }
        System.out.println("Марка: " + marka);
        System.out.println("Стоимость: " + carTax + " рублей");
        System.out.println("Пробег: " + mileage1);

        if (trfa) {
            System.out.println("Техосмотр пройден");
        } else {
            System.out.println("Техосмотр не пройден");
        }
    }

    public void displayCarInfo() {
        System.out.println();
        System.out.println("Мощьность машины: " + power + " л.с"
                + "\nЦена: " + price + " рублей"
                + "\nНомер: " + number
                + "\nПробег: " + mileage + " км"
                + "\nМарка: " + stamp
                + "\nТехосмотр: " + tehInspection);
    }

    public void carInfo(ArrayList<Car> car) {
        for (Car cars:car) {
            cars.displayCarInfo();
        }
    }

    public void carTax(ArrayList<Car> car) {
        int carTax = 0;
        for (Car cars:car) {
            carTax += cars.price;
        }
        System.out.println(carTax / 100 * 5);
    }
}
