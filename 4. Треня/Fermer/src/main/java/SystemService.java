// Главный класс для демонстрации работы системы управления автосервисом
public class SystemService {
    public static void main(String[] args) {
        // Создаем объекты услуг с названием и стоимостью
        Service oilChange = new Service("Замена масла", 1500);
        Service tireChange = new Service("Замена шин", 3000);

        // Создаем клиента
        Client client = new Client("Иван Иванов");

        // Клиент выбирает и подтверждает услуги
        client.requestService(oilChange);
        client.requestService(tireChange);
    }
}
