// Класс Worker для представления рабочего
class Worker {
    private String name; // Имя рабочего

    // Конструктор класса Worker
    public Worker(String name) {
        this.name = name;
    }

    // Метод для начала работы с материалом
    public void workWithMaterial(Material material) {
        System.out.println(name + " проверяет материал.");
        if (material.checkMaterial()) {
            material.useMaterial();
        } else {
            System.out.println("Материал недоступен для работы.");
        }
    }
}