import java.util.ArrayList;

class Apteka { // Класс для представления аптеки
    String name; // Переменная будет хранить название аптеки
    ArrayList<Medicine> medicines;
    // Объявляет переменную экземпляра с именем "medicines",
    // Которая является "ArrayList" объектом типа "Medicine". Этот список будет хранить лекарства, доступные в аптеке

    public Apteka(String name) { // Конструктор класса "Aptekas"
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

        /* Это расширенный for цикл (также известный как цикл for-each) в Java
        Он предназначен для итерации по коллекциям (например ArrayList*/

        /* Medicine med - Это объявляет переменную с именем medтипа "Medicine". В каждой итерации цикла medбудет содержать следующий "Medicine" объект из "medicines" коллекции
        *
        * ": medicines" - указывает коллекцию для итерации. "medicines" предполагается, что это коллекция ArrayList <Medicine>
        (или аналогичный тип коллекции), содержащая "Medicine" объекты */
    }
}

class Programm {
    public static void main(String[] args) {

        // Создаём объект ap1 класса Aptekas
        Apteka ap1 = new Apteka("Аптека_1");
        // Добавляем лекарства в каждый из объектов класса
        ap1.addMedicine("Аспирин", 5);
        ap1.addMedicine("Буферон", 7);
        ap1.addMedicine("Циклоферон", 9);

        // Создаём объект ap2 класса Aptekas
        Apteka ap2 = new Apteka("Аптека_2");
        // Добавляем лекарства в каждый из объектов класса
        ap2.addMedicine("Ибуклин", 12); // Исправлено: Добавлены лекарства в ap2.
        ap2.addMedicine("Мышьяк", 6);

        // Создаём объект ap3 класса Aptekas
        Apteka ap3 = new Apteka("Аптека_3");
        // Добавляем лекарства в каждый из объектов класса
        ap3.addMedicine("Энергоферон", 15);
        ap3.addMedicine("Метроксидин", 11);
        ap3.addMedicine("Валерьянка", 2);

        // Создаём объект ap4 класса Aptekas
        Apteka ap4 = new Apteka("Аптека_4");

        // Выводим информацию на экран
        ap1.getFullInfo(); // Выводит информацию об аптеке

        System.out.println();

        ap2.getFullInfo(); // Выводит информацию об аптеке

        System.out.println();

        ap3.getFullInfo(); // Выводит информацию об аптеке

        System.out.println();

        ap4.getFullInfo(); // Выводит информацию об аптеке
        
    }
}
