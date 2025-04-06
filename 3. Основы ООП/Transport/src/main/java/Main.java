// Добавляем методы для списков и рандом
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var arg = "";
        Random rnd = new Random();//

        //
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car(arg);

        //
        ArrayList<Airplane> airplanes = new ArrayList<>();
        Airplane airplane = new Airplane(arg);

        //
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
        car.carInfo(cars); //
        System.out.print("\nНалог от регистрации машин: ");
        car.carTax(cars); //
        System.out.println("\nВыбранная машина");
        car.setCar(cars, "Митсубиси"); //
        System.out.println("\nСамая дорогая машина");
        car.maxPriceCar(cars); //

        //
        airplanes.add(new Airplane(rnd.nextInt(25000, 65000), rnd.nextInt(1000000, 9999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(2000, 12000),
                "Boing-777"));

        airplanes.add(new Airplane(rnd.nextInt(25000, 65000), rnd.nextInt(1000000, 9999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(2000, 12000),
                "Boing-657"));

        airplanes.add(new Airplane(rnd.nextInt(25000, 65000), rnd.nextInt(1000000, 9999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(2000, 12000),
                "Победа-12"));

        airplanes.add(new Airplane(rnd.nextInt(25000, 65000), rnd.nextInt(1000000, 9999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(2000, 12000),
                "Стопроцполетит-1"));

        airplanes.add(new Airplane(rnd.nextInt(25000, 65000), rnd.nextInt(1000000, 9999999),
                rnd.nextInt(100000, 999999), rnd.nextInt(2000, 12000),
                "Хундзяо-Мянг"));

        System.out.println("Информация о самолетах частной Авиакомпании:");
        airplane.airInfo(airplanes); //
        System.out.println("\nВыбранный самолет");
        airplane.setAir(airplanes, "Хундзяо-Мянг"); //
        System.out.print("\nНалог от регистрации самолетов: ");
        airplane.airTax(airplanes); //
        System.out.println("\nСамый дорогой самолет");
        airplane.maxPriceAir(airplanes); //
    }
}
