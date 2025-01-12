import java.util.ArrayList;

public class Aptecas {
    public static void main(String[] args) {

        // Создаём объект ap1 класса Aptekas
        Apteca ap1 = new Apteca("Аптека_1");
        // Добавляем лекарства в каждый из объектов класса
        ap1.addMedicine("Аспирин", 5);
        ap1.addMedicine("Буферон", 7);
        ap1.addMedicine("Циклоферон", 9);

        // Создаём объект ap2 класса Aptekas
        Apteca ap2 = new Apteca("Аптека_2");
        // Добавляем лекарства в каждый из объектов класса
        ap2.addMedicine("Ибуклин", 12); // Исправлено: Добавлены лекарства в ap2.
        ap2.addMedicine("Мышьяк", 6);

        // Создаём объект ap3 класса Aptekas
        Apteca ap3 = new Apteca("Аптека_3");
        // Добавляем лекарства в каждый из объектов класса
        ap3.addMedicine("Энергоферон", 15);
        ap3.addMedicine("Метроксидин", 11);
        ap3.addMedicine("Валерьянка", 2);

        // Создаём объект ap4 класса Aptekas
        Apteca ap4 = new Apteca("Аптека_4");

        // Выводим информацию на экран
        ap1.getFullInfo(); // Выводит информацию об аптеке
        System.out.println("Самое дорогое лекарство: " + ap1.getMostExpensiveMedicinePrice());
        System.out.println("Общая сумма: " + ap1.getTotalCost());
        System.out.println();

        ap2.getFullInfo(); // Выводит информацию об аптеке
        System.out.println("Самое дорогое лекарство: " + ap2.getMostExpensiveMedicinePrice());
        System.out.println("Общая сумма: " + ap2.getTotalCost());
        System.out.println();

        ap3.getFullInfo(); // Выводит информацию об аптеке
        System.out.println("Самое дорогое лекарство: " + ap3.getMostExpensiveMedicinePrice());
        System.out.println("Общая сумма: " + ap3.getTotalCost());
        System.out.println();

        ap4.getFullInfo(); // Выводит информацию об аптеке
        System.out.println("Самое дорогое лекарство: " + ap4.getMostExpensiveMedicinePrice());
        System.out.println("Общая сумма: " + ap4.getTotalCost());
    }
}
