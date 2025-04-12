import java.util.ArrayList;

// Класс Airplane, наследующий от класса Transport
public class Airplane extends Transport {
    public int height; // Максимальная высота полета самолета

    /**
     * Конструктор для создания объекта Airplane с аргументом
     * @param arg - аргумент для инициализации базового класса Transport
     */
    public Airplane(String arg) {
        super(arg); // Вызов конструктора базового класса
    }

    /**
     * Конструктор для создания объекта Airplane с параметрами
     * @param power - мощность самолета
     * @param price - цена самолета
     * @param number - номер самолета
     * @param height - максимальная высота полета
     * @param stamp - марка самолета
     */
    public Airplane(int power, double price, int number, int height, String stamp) {
        super(power, price, number, stamp); // Вызов конструктора базового класса
        this.height = height; // Инициализация максимальной высоты
    }

    /**
     * Метод для расчета налога от регистрации самолетов
     * @param airplanes - список самолетов
     */
    public void airTax(ArrayList<Airplane> airplanes) {
        int airTax = 0; // Переменная для хранения общего налога
        for (Airplane air : airplanes) {
            airTax += air.price; // Суммируем цены самолетов
        }
        System.out.println(airTax / 100 * 3); // Выводим 3% от общей суммы
    }

    /**
     * Метод для установки информации о выбранном самолете
     * @param airplanes - список самолетов
     * @param airs - марка самолета для поиска
     */
    public void setAir(ArrayList<Airplane> airplanes, String airs) {
        double airTax = 0; // Переменная для хранения цены самолета
        int height1 = 0; // Переменная для хранения максимальной высоты
        String marka = ""; // Переменная для хранения марки самолета

        for (Airplane air : airplanes) {
            if (air.stamp.equals(airs)) { // Сравниваем марки самолетов
                marka = air.stamp; // Запоминаем марку
                airTax = air.price; // Запоминаем цену
                height1 = air.height; // Запоминаем максимальную высоту
            }
        }

        // Выводим информацию о выбранном самолете
        System.out.println("Марка: " + marka);
        System.out.println("Стоимость: " + airTax + " рублей");
        System.out.println("Максимальная высота: " + height1 + "м");
    }

    /**
     * Метод для нахождения и вывода самого дорогого самолета
     * @param airplanes - список самолетов
     */
    public void maxPriceAir(ArrayList<Airplane> airplanes) {
        double airTax = 0; // Переменная для хранения максимальной цены
        int power1 = 0; // Переменная для хранения мощности самого дорогого самолета
        String marka = ""; // Марка самого дорогого самолета

        for (Airplane air : airplanes) {
            if (air.price > airTax) { // Если текущая цена больше максимальной
                airTax = air.price; // Обновляем максимальную цену
                power1 = air.power; // Запоминаем мощность
                marka = air.stamp; // Запоминаем марку
            }
        }

        // Выводим информацию о самом дорогом самолете
        System.out.println("Марка: " + marka);
        System.out.println("Мощность: " + power1);
        System.out.println("Стоимость: " + airTax + " рублей");
    }

    /**
     * Метод для отображения информации о текущем самолете
     */
    public void displayAirInfo() {
        System.out.println();
        System.out.println("Марка: " + stamp
                + "\nМощность самолета: " + power + " л.с"
                + "\nЦена: " + price + " долларов"
                + "\nНомер: " + number
                + "\nМаксимальная высота: " + height + "м");
    }

    /**
     * Метод для отображения информации обо всех самолетах в списке
     * @param airplanes - список самолетов
     */
    public void airInfo(ArrayList<Airplane> airplanes) {
        for (Airplane air : airplanes) {
            air.displayAirInfo(); //

        }
    }

    public int getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }



    public int getHeight() {
        return height;
    }

    public String getStamp() {
        return stamp;
    }
}
