import java.util.Objects;

class Product {
    private int id; // Уникальный идентификатор продукта
    private String name; // Название продукта

    public Product(int id, String name) {
        this.id = id; // Инициализируем идентификатор продукта
        this.name = name; // Инициализируем название продукта
    }

    public int getId() {
        return id; // Возвращаем идентификатор продукта
    }

    public String getName() {
        return name; // Возвращаем название продукта
    }

    @Override
    public String toString() {
        return "Product{" + // Переопределяем метод toString() для удобного отображения информации о продукте
                "id=" + id + // Добавляем идентификатор продукта в строку
                ", name='" + name + '\'' + // Добавляем название продукта в строку
                '}'; // Закрываем строку
    }

    @Override
    public boolean equals(Object o) { // Переопределяем метод equals() для сравнения объектов Product
        if (this == o) return true; // Если объекты идентичны (ссылаются на один и тот же объект), возвращаем true
        if (o == null || getClass() != o.getClass()) return false; // Если объект null или принадлежит другому классу, возвращаем false
        Product product = (Product) o; // Приводим объект o к типу Product
        return id == product.id; // Сравниваем идентификаторы продуктов и возвращаем результат
    }

    @Override
    public int hashCode() { // Переопределяем метод hashCode() для корректной работы с коллекциями, использующими hash-функции (например, HashMap, HashSet)
        return Objects.hash(id); // Вычисляем hash-код на основе идентификатора продукта
    }
}