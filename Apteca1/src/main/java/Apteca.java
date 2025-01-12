import java.util.ArrayList;

class Apteca {
    String name; // Переменная будет хранить название аптеки
    ArrayList<Medicine> medicines;
    // Объявляет переменную экземпляра с именем "medicines",
    // Которая является "ArrayList" объектом типа "Medicine". Этот список будет хранить лекарства, доступные в аптеке

    public Apteca(String name) { // Конструктор класса "Aptekas"
        // Принимает аргумент типа "строка" и инициализирует переменную экземпляра с заданным значением
        this.name = name;
        this.medicines = new ArrayList<>();
    }

    static class Medicine { // Внутренний класс для представления лекарств в аптеке
        String name; // Переменная для хранения названия лекарств
        int price; // Переменная для хранения цены лекарства

        public Medicine(String name, int price) {
            // конструктор класса "Medicine". Инициализирует имя и цену объекта "Medicine"
            this.name = name;
            this.price = price;
        }

        // Этот метод переопределяет "toString()" метод класса по умолчанию в Object.
        // Он предоставляет способ представления "Medicine" объекта в виде строки
        // (например, «Аспирин: 5»). Это необходимо для печати информации о лекарствах

        // Форматируем вывод элемента списка (например, «Аспирин: 5»)
        public String toString() {
            return name + ": " + price;
        }
    }

    // Метод добавляет новый "Medicine" объект в "medicines" список. Он принимает название
    // и цену лекарства в качестве входных данных и создает новый "Medicine" объект
    // перед добавлением его в список.
    public void addMedicine(String medicineName, int price) {
        medicines.add(new Medicine(medicineName, price));
    }


    // Этот метод выводит название аптеки и сведения обо всех содержащихся в ней лекарствах.
    // Он также обрабатывает случай, когда список "medicines" пуст
    public void getFullInfo() {
        System.out.println("Аптека: " + name);
        if (medicines.isEmpty()) { // Если в списке лекарств нет, то возвращаем строку с надписью: "Нет лекарств"
            System.out.println("Нет лекарств");
            return;
        }

        // Выводим список всех лекарств на экран
        for (Medicine med : medicines) {
            System.out.println(med);
        }
    }


    // Этот метод перебирает "medicines" список, чтобы найти и вернуть цену самого дорогого лекарства.
    // Он также обрабатывает случай, когда список "medicines" пуст
    public int getMostExpensiveMedicinePrice() { // Улучшенное название метода
        if (medicines.isEmpty()) { // Если список лекарств пустой, то возвращаем ноль
            return 0;
        }
        int maxPrice = medicines.get(0).price; // Инициализация первого лекарства с ценой
        for (Medicine med : medicines) {
            if (med.price > maxPrice) {
                maxPrice = med.price;
            }
        }
        return maxPrice;
    }

    // Этот метод рассчитывает и возвращает общую стоимость всех лекарств в аптеке
    public int getTotalCost() { // Улучшенное название метода
        int total = 0; // Создаём счётчик
        for (Medicine med : medicines) {
            total += med.price;
        }
        return total;
    }
}
