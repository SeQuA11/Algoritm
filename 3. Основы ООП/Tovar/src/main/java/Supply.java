class Supply {
    private Supplier supplier; // Поставщик, осуществивший поставку
    private Product product; // Продукт, поставленный поставщиком
    private int quantity; // Количество поставленного продукта

    public Supply(Supplier supplier, Product product, int quantity) {
        this.supplier = supplier; // Инициализируем поставщика
        this.product = product; // Инициализируем продукт
        this.quantity = quantity; // Инициализируем количество
    }

    public Supplier getSupplier() {
        return supplier; // Возвращаем поставщика
    }

    public Product getProduct() {
        return product; // Возвращаем продукт
    }

    public int getQuantity() {
        return quantity; // Возвращаем количество
    }

    @Override
    public String toString() {
        return "Supply{" + // Переопределяем метод toString() для удобного отображения информации о поставке
                "supplier=" + supplier + // Добавляем информацию о поставщике в строку
                ", product=" + product + // Добавляем информацию о продукте в строку
                ", quantity=" + quantity + // Добавляем информацию о количестве в строку
                '}'; // Закрываем строку
    }
}

