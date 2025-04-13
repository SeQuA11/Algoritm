// Добавляем методы для списков
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        var arg = "";
        String filename = "transport.csv";

        // Создаем список автомобилей
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car(arg); // Создаем объект Car с пустым аргументом

        // Создаем список самолетов
        ArrayList<Airplane> airplanes = new ArrayList<>();
        Airplane airplane = new Airplane(arg); // Создаем объект Airplane с пустым аргументом

//        // Запись в CSV файл
//        try (FileWriter writer = new FileWriter(filename)) {
//
//            // Данные
//            for (Car carData : cars) {
//                writer.write(carData.getPower() + "," +
//                        carData.getPrice() + "," +
//                        carData.getNumber() + "," +
//                        carData.getMileage() + "," +
//                        carData.getStamp() + "," +
//                        carData.getTehInspection() + "\n");
//            }
//
//            writer.write("Airplanes\n");
//            for (Airplane airplane1 : airplanes) {
//                writer.write(airplane1.getPower() + "," +
//                        airplane1.getPrice() + "," +
//                        airplane1.getNumber() + "," +
//                        airplane1.getHeight() + "," +
//                        airplane1.getStamp() + "\n");
//            }
//
//            writer.write("Машины не прошедшие техосмотр\n");
//            for (Car car1 : cars) {
//                if (car1.tehInspection == false) {
//                    writer.write(car1.getPower() + "," +
//                            car1.getPrice() + "," +
//                            car1.getNumber() + "," +
//                            car1.getMileage() + "," +
//                            car1.getStamp() + "," +
//                            car1.getTehInspection() + "\n");
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка при записи в файл: " + e.getMessage());
//            e.printStackTrace(); // Выводим StackTrace для отладки
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;
            System.out.println("\nДанные из CSV файла:");
            while ((line = reader.readLine()) != null && !line.startsWith("Airplanes")) {
                String[] data = line.split(",");
                cars.add(new Car(parseInt(data[0]), parseDouble(data[1]), parseInt(data[2]), parseInt(data[3]), data[4], parseBoolean(data[5])));
            }

            // Выводим информацию о зарегистрированных автомобилях
            System.out.println("Информация о машинах зарегистрированных в ГИБДД:");
            car.carInfo(cars); // Вызываем метод carInfo для вывода информации
            System.out.print("\nНалог от регистрации машин: ");
            car.carTax(cars); // Вызываем метод carTax для расчета налога
            System.out.println("\nВыбранная машина");
            car.setCar(cars, "Митсубиси"); // Устанавливаем выбранный автомобиль
            System.out.println("\nСамая дорогая машина");
            car.maxPriceCar(cars); // Находим и выводим самую дорогую машину


            while ((line = reader.readLine()) != null && !line.startsWith("Машины не прошедшие техосмотр")) {
                String[] data = line.split(",");
                airplanes.add(new Airplane(parseInt(data[0]), parseDouble(data[1]), parseInt(data[2]), parseInt(data[3]), data[4]));
            }

            // Выводим информацию о самолетах частной авиакомпании
            System.out.println("Информация о самолетах частной Авиакомпании:");
            airplane.airInfo(airplanes); // Вызываем метод airInfo для вывода информации
            System.out.println("\nВыбранный самолет");
            airplane.setAir(airplanes, "Хундзяо-Мянг"); // Устанавливаем выбранный самолет
            System.out.print("\nНалог от регистрации самолетов: ");
            airplane.airTax(airplanes); //
            System.out.println("\nСамый дорогой самолет");
            airplane.maxPriceAir(airplanes); //

        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
