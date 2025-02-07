import java.util.ArrayList;

/**
 * Класс, представляющий аптеку.
 * Хранит информацию о названии аптеки и списке медикаментов, доступных в ней.
 */
public class Apteca {
    public String name; // Название аптеки
    ArrayList<Medication> medications; // Список медикаментов в аптеке

    /**
     * Конструктор для создания новой аптеки с заданным названием.
     * Инициализирует список медикаментов как пустой.
     */
    public Apteca(String name) {
        this.medications = new ArrayList<>(); // Создаем новый список медикаментов
        this.name = name; // Задаем название аптеки
    }

    /**
     * Создаем и добавляем новый медикамент в список.
     */
    public void addMedication(String medName, int price, int quantity) {
        medications.add(new Medication(medName, price, quantity));
    }

    /**
     * Выводит информацию о медикаментах в аптеке.
     * Если список медикаментов пуст, выводит сообщение о том, что лекарств нет.
     */
    public void infoMedication() {
        System.out.println("Аптека '" + name + "'");
        if (medications.isEmpty()){
            System.out.println("Лекарств нет");
        return;
        }

        // Перебираем и выводим информацию о каждом медикаменте
        for (Medication med : medications) {
            System.out.println(med);
        }
    }

    /**
     * Находит и возвращает максимальную цену среди всех медикаментов в аптеке.
     * Если список медикаментов пуст, возвращает 0.
     */
    public int MaxPrice() {
        if (medications.isEmpty()) return 0;

        int maxPrice = 0; // Переменная для хранения максимальной цены
        // Перебираем все медикаменты и находим максимальную цену
        for (Medication med : medications) {
            if (med.price >= maxPrice) {
                maxPrice = med.price;
            }
        }
        return maxPrice;
    }

    /**
     * Рассчитывает и возвращает общую стоимость всех медикаментов в аптеке.
     * Если список медикаментов пуст, возвращает 0.
     */
    public int SumPrice() {
        if (medications.isEmpty()) return 0;

        int totalPrice = 0; // Переменная для хранения общей стоимости
        // Перебираем медикаменты и суммируем их стоимость
        for (Medication med : medications) {
            totalPrice += med.price * med.quantity; // Увеличиваем общую стоимость на цену медикамента, умноженную на его количество
        }
        return totalPrice;
    }

}
