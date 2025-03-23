import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var arg = "";
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Airplane> airplanes = new ArrayList<>();
        Car car = new Car(arg);

        cars.add(new Car(rnd.nextInt(250, 650), rnd.nextInt(10000, 999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(100, 500000),
                "Хуньсянь", false));

        cars.add(new Car(rnd.nextInt(250, 650), rnd.nextInt(10000, 999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(100, 500000),
                "Шивроле", true));

        cars.add(new Car(rnd.nextInt(250, 650), rnd.nextInt(10000, 999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(100, 500000),
                "Митсубиси", true));

        cars.add(new Car(rnd.nextInt(250, 650), rnd.nextInt(10000, 999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(100, 500000),
                "Мустангич", true));

        cars.add(new Car(rnd.nextInt(250, 650), rnd.nextInt(10000, 999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(100, 500000),
                "Лада", false));


        System.out.println("Информация о машинах зарегистрированных в ГИБДД:");
        car.carInfo(cars);
        System.out.print("\nНалог от регистрации машин: ");
        car.carTax(cars);
        System.out.println("\nСамая дорогая машина");
        car.maxPrice(cars);
    }
}
