import java.util.*; // Импортируем необходимые классы из библиотеки java.util: List, Set, Map, ArrayList, HashSet, HashMap, Comparator

class SupplyChain {
    private List<Product> products; // Список всех доступных продуктов
    private List<Supplier> suppliers; // Список всех доступных поставщиков
    private List<Supply> supplies; // Список всех осуществленных поставок

    public SupplyChain() {
        this.products = new ArrayList<>(); // Инициализируем список продуктов
        this.suppliers = new ArrayList<>(); // Инициализируем список поставщиков
        this.supplies = new ArrayList<>(); // Инициализируем список поставок
    }

    public void addProduct(Product product) {
        this.products.add(product); // Добавляем продукт в список продуктов
    }

    public void addSupplier(Supplier supplier) {
        this.suppliers.add(supplier); // Добавляем поставщика в список поставщиков
    }

    public void addSupply(Supply supply) {
        this.supplies.add(supply); // Добавляем поставку в список поставок
    }

    // 1. Оформить поставку заданного товара
    public void makeSupply(Supplier supplier, Product product, int quantity) {
        if (!suppliers.contains(supplier)) { // Проверяем, существует ли указанный поставщик в списке поставщиков
            System.out.println("Supplier not found!"); // Выводим сообщение об ошибке, если поставщик не найден
            return; // Завершаем выполнение метода
        }
        if (!products.contains(product)) { // Проверяем, существует ли указанный продукт в списке продуктов
            System.out.println("Product not found!"); // Выводим сообщение об ошибке, если продукт не найден
            return; // Завершаем выполнение метода
        }
        Supply newSupply = new Supply(supplier, product, quantity); // Создаем новый объект поставки
        supplies.add(newSupply); // Добавляем новую поставку в список поставок
        System.out.println("Supply registered: " + newSupply); // Выводим информацию о зарегистрированной поставке
    }

    // 2. Выяснить, какой товар не поставляется ни одним поставщиком
    public List<Product> getProductsNotSupplied() {
        Set<Product> suppliedProducts = new HashSet<>(); // Создаем множество для хранения продуктов, которые поставляются
        for (Supply supply : supplies) { // Перебираем все поставки
            suppliedProducts.add(supply.getProduct()); // Добавляем продукт из текущей поставки в множество
        }

        List<Product> notSupplied = new ArrayList<>(); // Создаем список для хранения продуктов, которые не поставляются
        for (Product product : products) { // Перебираем все продукты
            if (!suppliedProducts.contains(product)) { // Проверяем, содержится ли текущий продукт в множестве поставляемых продуктов
                notSupplied.add(product); // Добавляем продукт в список не поставляемых продуктов
            }
        }
        return notSupplied; // Возвращаем список продуктов, которые не поставляются
    }

    // 3. Определить, какой товар поставляется в наибольшем количестве
    public Product getMostSuppliedProduct() {
        Map<Product, Integer> productQuantities = new HashMap<>(); // Создаем карту для хранения количества поставок каждого продукта
        for (Supply supply : supplies) { // Перебираем все поставки
            Product product = supply.getProduct(); // Получаем продукт из текущей поставки
            productQuantities.put(product, productQuantities.getOrDefault(product, 0) + supply.getQuantity()); // Увеличиваем количество поставок для текущего продукта на количество из текущей поставки. Если продукт еще не добавлен в карту, добавляем его с количеством 0.
        }

        Product mostSupplied = null; // Инициализируем продукт, поставляемый в наибольшем количестве
        int maxQuantity = 0; // Инициализируем максимальное количество поставок
        for (Map.Entry<Product, Integer> entry : productQuantities.entrySet()) { // Перебираем все записи в карте
            if (entry.getValue() > maxQuantity) { // Проверяем, больше ли количество поставок текущего продукта, чем текущее максимальное количество
                mostSupplied = entry.getKey(); // Обновляем продукт, поставляемый в наибольшем количестве
                maxQuantity = entry.getValue(); // Обновляем максимальное количество поставок
            }
        }
        return mostSupplied; // Возвращаем продукт, поставляемый в наибольшем количестве
    }

    // 4. Определить, кто из поставщиков поставляет товар с заданным номером и в каком количестве
    public Map<Supplier, Integer> getSuppliersForProduct(int productId) {
        Product targetProduct = null; // Инициализируем целевой продукт
        for (Product product : products) { // Перебираем все продукты
            if (product.getId() == productId) { // Проверяем, совпадает ли идентификатор текущего продукта с заданным идентификатором
                targetProduct = product; // Обновляем целевой продукт
                break; // Завершаем цикл
            }
        }

        if (targetProduct == null) { // Проверяем, был ли найден продукт с заданным идентификатором
            System.out.println("Product with ID " + productId + " not found."); // Выводим сообщение об ошибке, если продукт не найден
            return Collections.emptyMap(); // Возвращаем пустую карту
        }

        Map<Supplier, Integer> supplierQuantities = new HashMap<>(); // Создаем карту для хранения количества поставок продукта для каждого поставщика
        for (Supply supply : supplies) { // Перебираем все поставки
            if (supply.getProduct().equals(targetProduct)) { // Проверяем, является ли продукт в текущей поставке целевым продуктом
                supplierQuantities.put(supply.getSupplier(), supplierQuantities.getOrDefault(supply.getSupplier(), 0) + supply.getQuantity()); // Увеличиваем количество поставок целевого продукта для текущего поставщика на количество из текущей поставки. Если поставщик еще не добавлен в карту, добавляем его с количеством 0.
            }
        }
        return supplierQuantities; // Возвращаем карту, содержащую количество поставок целевого продукта для каждого поставщика
    }

    // 5. Каков объем поставок заданного товара у различных поставщиков
    public Map<Supplier, Integer> getSupplyVolumeBySupplier(Product product) {
        Map<Supplier, Integer> supplyVolume = new HashMap<>(); // Создаем карту для хранения объема поставок продукта для каждого поставщика
        for (Supply supply : supplies) { // Перебираем все поставки
            if (supply.getProduct().equals(product)) { // Проверяем, является ли продукт в текущей поставке заданным продуктом
                Supplier supplier = supply.getSupplier(); // Получаем поставщика из текущей поставки
                int quantity = supply.getQuantity(); // Получаем количество из текущей поставки
                supplyVolume.put(supplier, supplyVolume.getOrDefault(supplier, 0) + quantity); // Увеличиваем объем поставок заданного продукта для текущего поставщика на количество из текущей поставки. Если поставщик еще не добавлен в карту, добавляем его с количеством 0.
            }
        }
        return supplyVolume; // Возвращаем карту, содержащую объем поставок заданного продукта для каждого поставщика
    }

    // 6. Перечислить имена поставщиков, которые могут поставить товар с указанным названием
    public List<String> getSuppliersForProductName(String productName) {
        List<String> supplierNames = new ArrayList<>(); // Создаем список для хранения имен поставщиков
        for (Supply supply : supplies) { // Перебираем все поставки
            if (supply.getProduct().getName().equals(productName)) { // Проверяем, совпадает ли название продукта в текущей поставке с заданным названием продукта
                supplierNames.add(supply.getSupplier().getName()); // Добавляем имя поставщика в список
            }
        }
        return supplierNames; // Возвращаем список имен поставщиков
    }

    // 7. Сформировать список товаров, упорядоченный по объему поставок
    public List<Product> getProductsSortedBySupplyVolume() {
        Map<Product, Integer> productQuantities = new HashMap<>(); // Создаем карту для хранения количества поставок каждого продукта
        for (Supply supply : supplies) { // Перебираем все поставки
            Product product = supply.getProduct(); // Получаем продукт из текущей поставки
            productQuantities.put(product, productQuantities.getOrDefault(product, 0) + supply.getQuantity()); // Увеличиваем количество поставок для текущего продукта на количество из текущей поставки. Если продукт еще не добавлен в карту, добавляем его с количеством 0.
        }

        List<Product> sortedProducts = new ArrayList<>(productQuantities.keySet()); // Создаем список продуктов из ключей карты
        sortedProducts.sort(Comparator.comparingInt(product -> -productQuantities.get(product))); // Сортируем список продуктов в порядке убывания объема поставок. Используем компаратор для сравнения количества поставок продуктов.

        return sortedProducts; // Возвращаем отсортированный список продуктов
    }

    public static void main(String[] args) {
        SupplyChain chain = new SupplyChain(); // Создаем объект класса SupplyChain

        // Create products
        Product product1 = new Product(1, "Laptop"); // Создаем объект продукта с идентификатором 1 и названием "Laptop"
        Product product2 = new Product(2, "Mouse"); // Создаем объект продукта с идентификатором 2 и названием "Mouse"
        Product product3 = new Product(3, "Keyboard"); // Создаем объект продукта с идентификатором 3 и названием "Keyboard"
        Product product4 = new Product(4, "Monitor"); // Создаем объект продукта с идентификатором 4 и названием "Monitor"

        // Create suppliers
        Supplier supplier1 = new Supplier(101, "MegaCorp"); // Создаем объект поставщика с идентификатором 101 и названием "MegaCorp"
        Supplier supplier2 = new Supplier(102, "TechDeals"); // Создаем объект поставщика с идентификатором 102 и названием "TechDeals"
        Supplier supplier3 = new Supplier(103, "GlobalSupply"); // Создаем объект поставщика с идентификатором 103 и названием "GlobalSupply"

        // Add to the chain
        chain.addProduct(product1); // Добавляем продукт 1 в цепочку поставок
        chain.addProduct(product2); // Добавляем продукт 2 в цепочку поставок
        chain.addProduct(product3); // Добавляем продукт 3 в цепочку поставок
        chain.addProduct(product4); // Добавляем продукт 4 в цепочку поставок

        chain.addSupplier(supplier1); // Добавляем поставщика 1 в цепочку поставок
        chain.addSupplier(supplier2); // Добавляем поставщика 2 в цепочку поставок
        chain.addSupplier(supplier3); // Добавляем поставщика 3 в цепочку поставок

        // Add supplies
        chain.addSupply(new Supply(supplier1, product1, 50)); // Добавляем поставку продукта 1 поставщиком 1 в количестве 50
        chain.addSupply(new Supply(supplier1, product2, 100)); // Добавляем поставку продукта 2 поставщиком 1 в количестве 100
        chain.addSupply(new Supply(supplier2, product1, 30)); // Добавляем поставку продукта 1 поставщиком 2 в количестве 30
        chain.addSupply(new Supply(supplier2, product3, 75)); // Добавляем поставку продукта 3 поставщиком 2 в количестве 75
        chain.addSupply(new Supply(supplier3, product2, 60)); // Добавляем поставку продукта 2 поставщиком 3 в количестве 60
        chain.addSupply(new Supply(supplier3, product4, 40)); // Добавляем поставку продукта 4 поставщиком 3 в количестве 40


        // Example Usage:

        // 1. Оформить поставку заданного товара
        chain.makeSupply(supplier1, product3, 25); // Оформляем поставку продукта 3 поставщиком 1 в количестве 25

        // 2. Выяснить, какой товар не поставляется ни одним поставщиком
        System.out.println("\nProducts not supplied: " + chain.getProductsNotSupplied()); // Выводим список продуктов, которые не поставляются ни одним поставщиком

        // 3. Определить, какой товар поставляется в наибольшем количестве
        System.out.println("\nMost supplied product: " + chain.getMostSuppliedProduct()); // Выводим продукт, который поставляется в наибольшем количестве

        // 4. Определить, кто из поставщиков поставляет товар с заданным номером и в каком количестве
        int productId = 1; // Задаем идентификатор продукта
        System.out.println("\nSuppliers for product with ID " + productId + ": " + chain.getSuppliersForProduct(productId)); // Выводим поставщиков, которые поставляют продукт с заданным идентификатором, и количество поставок каждого поставщика

        // 5. Каков объем поставок заданного товара у различных поставщиков
        System.out.println("\nSupply volume of Laptop by supplier: " + chain.getSupplyVolumeBySupplier(product1)); // Выводим объем поставок продукта "Laptop" для каждого поставщика

        // 6. Перечислить имена поставщиков, которые могут поставить товар с указанным названием
        String productName = "Mouse"; // Задаем название продукта
        System.out.println("\nSuppliers for product name " + productName + ": " + chain.getSuppliersForProductName(productName)); // Выводим список поставщиков, которые могут поставить продукт с заданным названием

        // 7. Сформировать список товаров, упорядоченный по объему поставок
        System.out.println("\nProducts sorted by supply volume: " + chain.getProductsSortedBySupplyVolume()); // Выводим список продуктов, упорядоченный по объему поставок


    }
}
