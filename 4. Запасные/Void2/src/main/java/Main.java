import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var arg = "";
        Random rnd = new Random();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Airplane> airplanes = new ArrayList<>();
        Transport trans = new Transport(arg);

        cars.add(new Car(rnd.nextInt(250, 650), rnd.nextInt(10000, 999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(100, 500000),
                "Хуньсянь", true));
    }
}
