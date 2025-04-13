import java.util.ArrayList;

// Класс Car, наследующий от класса Transport
public class Car extends Transport {
    public int mileage; // Пробег автомобиля
    public boolean tehInspection; // Статус техосмотра (пройден/не пройден)

    /**
     * Конструктор, принимающий строковый аргумент
     * @param arg - аргумент для инициализации базового класса Transport
     */
    public Car(String arg) {
        super(arg); // Вызов конструктора базового класса
    }

    /**
     * Конструктор с параметрами для инициализации полей класса Car
     * @param power - мощность автомобиля
     * @param price - цена автомобиля
     * @param number - номер автомобиля
     * @param mileage - пробег автомобиля
     * @param stamp - марка (модель) автомобиля
     * @param tehInspection - статус техосмотра
     */
    public Car(int power, double price, int number, int mileage, String stamp, boolean tehInspection) {
        super(power, price, number, stamp); // Вызов конструктора базового класса
        this.mileage = mileage; // Инициализация пробега
        this.tehInspection = tehInspection; // Инициализация статуса техосмотра
    }

    /**
     * Метод для установки информации о выбранном автомобиле
     * @param car - список автомобилей
     * @param cars - марка автомобиля для поиска
     */
    public void setCar(ArrayList<Car> car, String cars) {
        double carTax = 0; // Переменная для хранения цены автомобиля
        String marka = ""; // Переменная для хранения марки автомобиля
        int mileage1 = 0; // Переменная для хранения пробега автомобиля

        for (Car car1 : car) {
            if (car1.stamp.equals(cars)) { // Сравниваем марки автомобилей
                marka = car1.stamp; // Запоминаем марку
                carTax = car1.price; // Запоминаем цену
                mileage1 = car1.mileage; // Запоминаем пробег
            }
        }

        // Выводим информацию о выбранном автомобиле
        System.out.println("Марка: " + marka);
        System.out.println("Стоимость: " + carTax + " рублей");
        System.out.println("Пробег: " + mileage1);
    }

    /**
     * Метод для расчета налога от регистрации автомобилей
     * @param car - список автомобилей
     */
    public void carTax(ArrayList<Car> car) {
        int carTax = 0; // Переменная для хранения общего налога
        for (Car cars : car) {
            carTax += cars.price; // Суммируем цены автомобилей
        }
        System.out.println(carTax / 100 * 5); // Выводим 5% от общей суммы
    }

    /**
     * Метод для нахождения и вывода самой дорогой машины
     * @param car - список автомобилей
     */
    public void maxPriceCar(ArrayList<Car> car) {
        double carTax = 0; // Переменная для хранения максимальной цены
        boolean trfa = false; // Статус техосмотра самой дорогой машины
        String marka = ""; // Марка самой дорогой машины

        for (Car cars : car) {
            if (cars.price > carTax) { // Если текущая цена больше максимальной
                carTax = cars.price; // Обновляем максимальную цену
                trfa = cars.tehInspection; // Запоминаем статус техосмотра
                marka = cars.stamp; // Запоминаем марку
            }
        }

        // Выводим информацию о самой дорогой машине
        System.out.println("Марка: " + marka);
        System.out.println("Стоимость: " + carTax + " рублей");

        // Выводим статус техосмотра
        if (trfa) {
            System.out.println("Техосмотр пройден");
        } else {
            System.out.println("Техосмотр не пройден");
        }
    }

    /**
     * Метод для отображения информации о текущем автомобиле
     */
    public void displayCarInfo() {
        System.out.println();
        System.out.println("Марка: " + stamp
                + "\nМощность машины: " + power + " л.с"
                + "\nЦена: " + price + " рублей"
                + "\nНомер: " + number
                + "\nПробег: " + mileage + " км"
                + "\nТехосмотр: " + tehInspection);
    }

    /**
     * Метод для отображения информации обо всех автомобилях в списке
     * @param car - список автомобилей
     */
    public void carInfo(ArrayList<Car> car) {
        for (Car cars : car) {
            cars.displayCarInfo(); // Вызываем метод отображения информации для каждого автомобиля
        }
    }
}
