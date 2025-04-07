// Добавляем методы для списков и рандом
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var arg = "";
        Random rnd = new Random(); // Выделяем место под метод рандом

        // Создаем список автомобилей
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car(arg); // Создаем объект Car с пустым аргументом

        // Создаем список самолетов
        ArrayList<Airplane> airplanes = new ArrayList<>();
        Airplane airplane = new Airplane(arg); // Создаем объект Airplane с пустым аргументом

        // Добавляем автомобили в список со случайными параметрами
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

        // Выводим информацию о зарегистрированных автомобилях
        System.out.println("Информация о машинах зарегистрированных в ГИБДД:");
        car.carInfo(cars); // Вызываем метод carInfo для вывода информации
        System.out.print("\nНалог от регистрации машин: ");
        car.carTax(cars); // Вызываем метод carTax для расчета налога
        System.out.println("\nВыбранная машина");
        car.setCar(cars, "Митсубиси"); // Устанавливаем выбранный автомобиль
        System.out.println("\nСамая дорогая машина");
        car.maxPriceCar(cars); // Находим и выводим самую дорогую машину

        // Добавляем самолеты в список со случайными параметрами
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

        // Выводим информацию о самолетах частной авиакомпании
        System.out.println("Информация о самолетах частной Авиакомпании:");
        airplane.airInfo(airplanes); // Вызываем метод airInfo для вывода информации
        System.out.println("\nВыбранный самолет");
        airplane.setAir(airplanes, "Хундзяо-Мянг"); // Устанавливаем выбранный самолет
        System.out.print("\nНалог от регистрации самолетов: ");
        airplane.airTax(airplanes); //
        System.out.println("\nСамый дорогой самолет");
        airplane.maxPriceAir(airplanes); //
    }
}
