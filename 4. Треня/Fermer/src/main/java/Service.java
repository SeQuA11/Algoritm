class Service implements Serviceable {
    private String serviceName;  // Название услуги
    private double serviceCost;  // Стоимость услуги

    // Конструктор класса Service
    public Service(String name, double cost) {
        this.serviceName = name;
        this.serviceCost = cost;
    }

    // Реализация метода calculateCost интерфейса Serviceable
    // Возвращает стоимость услуги
    @Override
    public double CalculateCost() {
        return serviceCost;
    }

    // Реализация метода confirmService интерфейса Serviceable
    // Выводит сообщение о подтверждении услуги
    @Override
    public void confirmService() {
        System.out.println("Услуга \"" + serviceName + "\" подтверждена.");
    }

    // Переопределение метода toString для удобного вывода информации об услуге
    @Override
    public String toString() {
        return serviceName + " (стоимость: " + serviceCost + " руб.)";
    }
}
