// Класс Client представляет клиента автосервиса
class Client {
    private String clientName; // Имя клиента

    // Конструктор класса Client
    public Client(String name) {
        this.clientName = name;
    }

    // Метод для запроса услуги клиентом
    public void requestService(Serviceable service) {
        System.out.println(clientName + " выбирает услугу: " + service);
        // Рассчитываем стоимость услуги
        double cost = service.CalculateCost();
        System.out.println("Стоимость услуги: " + cost + " руб.");
        // Клиент подтверждает заказ услуги
        service.confirmService();
    }
}
