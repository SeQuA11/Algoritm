// Класс Concrete реализует интерфейс Material
class Concrete implements Material {
    private String type; // Тип бетона
    private int quantity; // Количество в наличии

    // Конструктор класса Concrete
    public Concrete(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    // Проверка наличия материала
    @Override
    public boolean checkMaterial() {
        return quantity > 0; // Возвращает true, если имеется хотя бы одно количество
    }

    // Использование материала
    @Override
    public void useMaterial() {
        if (checkMaterial()) {
            quantity--; // Уменьшаем количество при использовании
            System.out.println("Используется бетон типа: " + type);
        } else {
            System.out.println("Недостаточно бетона типа: " + type);
        }
    }
}