/**
 * Класс, представляющий медикамент.
 * Содержит информацию о названии медикамента, его цене и количестве.
 */
public class Medication {
    public String medName;
    public int price;
    public int quantity;

    /**
     * Конструктор класса Medication.
     * Инициализирует объект медикамента с заданным названием, ценой и количеством.
     */
    public Medication(String medName, int price, int quantity) {
        this.medName = medName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Переопределение метода toString для отображения информации о медикаменте.
     * Возвращает строку с названием, ценой и количеством медикамента.
     */
    public String toString() {
        return medName + ": " + price + "руб. " + quantity + "шт.";
    }
}
