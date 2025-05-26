// Основной класс для демонстрации работы системы
public class SystemAll {
    public static void main(String[] args) {
        // Создаем объект бетона с определённым типом и количеством
        Concrete concrete = new Concrete("Стандартный", 5);

        // Создаем рабочего
        Worker worker = new Worker("Алексей");

        // Рабочий проверяет и использует материал
        worker.workWithMaterial(concrete);
        worker.workWithMaterial(concrete);
        worker.workWithMaterial(concrete);
        worker.workWithMaterial(concrete);
        worker.workWithMaterial(concrete);
        worker.workWithMaterial(concrete); // Здесь уже недостаточно материала
    }
}