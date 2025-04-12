//
public class Transport {
    public int power; // Мощность транспортного средства
    public double price; // Цена транспортного средства
    public int number; // Номер транспортного средства
    public String stamp; // Марка (модель) транспортного средства

    /**
     * Конструктор по умолчанию с аргументом типа String
     * @param arg - аргумент для инициализации (пока не используется)
     */
    public Transport(String arg) {}

    /**
     * Конструктор с параметрами для инициализации полей класса
     * @param power - мощность транспортного средства
     * @param price - цена транспортного средства
     * @param number - номер транспортного средства
     * @param stamp - марка (модель) транспортного средства
     */
    public Transport(int power, double price, int number, String stamp) {
        this.power = power; // Инициализация мощности
        this.price = price; // Инициализация цены
        this.number = number; // Инициализация номера
        this.stamp = stamp; // Инициализация марки
    }
}

