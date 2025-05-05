import java.util.Objects;

class Supplier {
    private int id; // Уникальный идентификатор поставщика
    private String name; // Название поставщика

    public Supplier(int id, String name) {
        this.id = id; // Инициализируем идентификатор поставщика
        this.name = name; // Инициализируем название поставщика
    }

    public int getId() {
        return id; // Возвращаем идентификатор поставщика
    }

    public String getName() {
        return name; // Возвращаем название поставщика
    }

    @Override
    public String toString() {
        return "Supplier{" + // Переопределяем метод toString() для удобного отображения информации о поставщике
                "id=" + id + // Добавляем идентификатор поставщика в строку
                ", name='" + name + '\'' + // Добавляем название поставщика в строку
                '}'; // Закрываем строку
    }

    @Override
    public boolean equals(Object o) { // Переопределяем метод equals() для сравнения объектов Supplier
        if (this == o) return true; // Если объекты идентичны (ссылаются на один и тот же объект), возвращаем true
        if (o == null || getClass() != o.getClass()) return false; // Если объект null или принадлежит другому классу, возвращаем false
        Supplier supplier = (Supplier) o; // Приводим объект o к типу Supplier
        return id == supplier.id; // Сравниваем идентификаторы поставщиков и возвращаем результат
    }

    @Override
    public int hashCode() { // Переопределяем метод hashCode() для корректной работы с коллекциями, использующими hash-функции (например, HashMap, HashSet)
        return Objects.hash(id); // Вычисляем hash-код на основе идентификатора поставщика
    }
}