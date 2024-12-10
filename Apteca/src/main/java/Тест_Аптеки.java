import static org.junit.jupiter.api.Assertions.*;

class AptekTest {

    // Проверяем "Аптека_1": правильно ли добавили лекарства с соответствующей им ценой

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_1() { // Проверяем, правильное ли добавлено лекарство с его ценой
        Apteka ap = new Apteka("Аптека_1");
        ap.addMedicine("Аспирин", 5); // Добавляем в список название: Аспирин и цену: 5
        assertEquals(1, ap.medicines.size()); // Проверяем, равен ли список размера 1, т.к. внесли туда только 1 лекарство с ценой
        assertEquals("Аспирин", ap.medicines.get(0).name); // Проверяем, является ли название элемента в списке с заданным названием
        assertEquals(5, ap.medicines.get(0).price); // Проверяем, является ли цена лекарства равна 5, т.к. верная цена должа быть 5
    }

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_1_2() { // Проверяем, правильное ли добавлено лекарство с его ценой
        // Этот вариант лучше, поскольку он изолирует тест и дает понять, что работает только одно добавление

        Apteka ap = new Apteka("Аптека_1");
        ap.addMedicine("Аспирин", 5);
        ap.addMedicine("Буферон", 7); // Добавляем в список название: Буферон и цену: 7
        assertEquals(2, ap.medicines.size()); // Проверяем, равен ли список размера 2
        assertEquals("Буферон", ap.medicines.get(1).name); // Проверяем, является ли название элемента в списке с заданным названием
        assertEquals(7, ap.medicines.get(1).price); // Проверяем, является ли цена лекарства равна 7, т.к. верная цена должа быть 7

        /*или можно сделать так (указыавем, что в списке уже был добавлен элемент и мы добавляем в него второй элемент,
        НО он не проверяет, что добавление двух лекарств работает правильно. Он проверяет только добавление одного лекарства.

        * @Test
        * void testAddMedicine_2() {
        * Aptek ap = new Aptek("Аптека_1");
        * ap.addMedicine("Буферон", 7);
        * assertEquals(1, ap.medicines.size()); //Now correct
        * assertEquals("Буферон", ap.medicines.get(0).name); // Correct typo and index
        * assertEquals(7, ap.medicines.get(0).price);
        * }
        * */
    }

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_1_3() {  // Проверяем, правильное ли добавлено лекарство с его ценой
        Apteka ap = new Apteka("Аптека_1");
        ap.addMedicine("Аспирин", 5);
        ap.addMedicine("Буферон", 7);
        ap.addMedicine("Циклоферон", 9); // Добавляем в список 3-ий элемент: название - Циклоферон и цену - 9
        assertEquals(3, ap.medicines.size()); // Проверяем, равен ли список размера 2
        assertEquals("Циклоферон", ap.medicines.get(2).name); // Проверяем, является ли название элемента в списке с заданным названием
        assertEquals(9, ap.medicines.get(2).price); // Проверяем, является ли цена лекарства равна 7, т.к. верная цена должа быть 7
    }

    // Проверяем "Аптека_2": правильно ли добавили лекарства с соответствующей им ценой

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_2_1() {  // Проверяем, правильное ли добавлено лекарство с его ценой

        Apteka ap2 = new Apteka("Аптека_2");
        ap2.addMedicine("Ибуклин", 12);
        assertEquals(1, ap2.medicines.size());
        assertEquals("Ибуклин", ap2.medicines.get(0).name);
        assertEquals(12, ap2.medicines.get(0).price);
    }

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_2_2() {  // Проверяем, правильное ли добавлено лекарство с его ценой

        Apteka ap2 = new Apteka("Аптека_2");
        ap2.addMedicine("Ибуклин", 12);
        ap2.addMedicine("Мышьяк", 6);
        assertEquals(2, ap2.medicines.size());
        assertEquals("Мышьяк", ap2.medicines.get(1).name);
        assertEquals(6, ap2.medicines.get(1).price);
    }

    // Проверяем "Аптека_3": правильно ли добавили лекарства с соответствующей им ценой

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_3_1() {  // Проверяем, правильное ли добавлено лекарство с его ценой

        Apteka ap3 = new Apteka("Аптека_3");
        ap3.addMedicine("Энергоферон", 15);
        assertEquals(1, ap3.medicines.size());
        assertEquals("Энергоферон", ap3.medicines.get(0).name);
        assertEquals(15, ap3.medicines.get(0).price);
    }

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_3_2() {  // Проверяем, правильное ли добавлено лекарство с его ценой

        Apteka ap3 = new Apteka("Аптека_3");
        ap3.addMedicine("Энергоферон", 15);
        ap3.addMedicine("Метроксидин", 11);
        assertEquals(2, ap3.medicines.size());
        assertEquals("Метроксидин", ap3.medicines.get(1).name);
        assertEquals(11, ap3.medicines.get(1).price);
    }

    @org.junit.jupiter.api.Test
    void TestAddMedicine_Apteka_3_3() {  // Проверяем, правильное ли добавлено лекарство с его ценой

        Apteka ap3 = new Apteka("Аптека_3");
        ap3.addMedicine("Энергоферон", 15);
        ap3.addMedicine("Метроксидин", 11);
        ap3.addMedicine("Валерьянка", 2);
        assertEquals(3, ap3.medicines.size());
        assertEquals("Валерьянка", ap3.medicines.get(2).name);
        assertEquals(2, ap3.medicines.get(2).price);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Тут вышел затуп с выводом полной информации на экран, кажется, что полный AlLes Kaput

    @org.junit.jupiter.api.Test
    void getFullInfo_Apteka_1() { // Здесь нужно проверить, выводит ли код верную информацию об аптеке
        Apteka ap = new Apteka("Аптека_1");
        ap.addMedicine("Аспирин", 5);
        ap.addMedicine("Буферон", 7);
        ap.addMedicine("Циклоферон", 9);

        // assertEquals("Аптека: Аптека_1 \nАспирин: 5 \nБуферон: 7\n Циклоферон: 9", ); // Так ли нужно проверять ?????
    }


    @org.junit.jupiter.api.Test
    void getFullInfo_Apteka_4_witchNullMedicine() {
        Apteka ap = new Apteka("Аптека_4");
        assertEquals("Аптека_4", ap.name); // Проверяем, указано ли заявленное название аптеки с тем, что выводит метод
        assertEquals(0, ap.medicines.size()); // Проверяем, равен ли список лекарств нулю, если в аптеке нету никаких лекарств
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @org.junit.jupiter.api.Test
    void getMostExpensiveMedicinePrice() { // Проверяем, равна ли максимальная цена лекарства из списка всех лекарств той цене, которой она должна быть
        // т.е. сравниваем значение метода со значением, верным для цены самого дорогого лекарства

        Apteka ap = new Apteka("Аптека_1");
        ap.addMedicine("Аспирин", 5);
        ap.addMedicine("Буферон", 7);
        ap.addMedicine("Циклоферон", 12);
        assertEquals(12, ap.getMostExpensiveMedicinePrice());

        Apteka apteka_2_total_cost = new Apteka("Аптека_1");
        apteka_2_total_cost.addMedicine("Ибуклин", 12);
        apteka_2_total_cost.addMedicine("Мышьяк", 6);
        assertEquals(12, apteka_2_total_cost.getMostExpensiveMedicinePrice());

        Apteka apteka_3_total_cost = new Apteka("Аптека_1");
        apteka_3_total_cost.addMedicine("Энергоферон", 15);
        apteka_3_total_cost.addMedicine("Метроксидин", 11);
        apteka_3_total_cost.addMedicine("Валерьянка", 2);
        assertEquals(15, apteka_3_total_cost.getMostExpensiveMedicinePrice());

        Apteka apteka_4_no_medicines = new Apteka("Аптека_4");
        assertEquals(0, apteka_4_no_medicines.getMostExpensiveMedicinePrice());
    }

    // (P.S. оказывается можно писать в одном блоке теста для метода несколько тестов для разных объектов класса "Аптека")

    /*@org.junit.jupiter.api.Test
    void getMostExpensiveMedicinePrice_4() { // Проверяем,
        Aptek apteka_4_no_medicines = new Aptek("Аптека_4");
        assertEquals(0, apteka_4_no_medicines.getMostExpensiveMedicinePrice());
    }*/

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @org.junit.jupiter.api.Test
    void getTotalCost() { // Проверяем, равна ли общая сумма всех лекарств с той суммой, которая должна быть верной

        Apteka apteka_1_total_cost = new Apteka("Аптека_1");
        apteka_1_total_cost.addMedicine("Аспирин", 5);
        apteka_1_total_cost.addMedicine("Буферон", 7);
        apteka_1_total_cost.addMedicine("Циклоферон", 9);
        assertEquals(21, apteka_1_total_cost.getTotalCost());

        Apteka apteka_2_total_cost = new Apteka("Аптека_1");
        apteka_2_total_cost.addMedicine("Ибуклин", 12);
        apteka_2_total_cost.addMedicine("Мышьяк", 6);
        assertEquals(18, apteka_2_total_cost.getTotalCost());

        Apteka apteka_3_total_cost = new Apteka("Аптека_1");
        apteka_3_total_cost.addMedicine("Энергоферон", 15);
        apteka_3_total_cost.addMedicine("Метроксидин", 11);
        apteka_3_total_cost.addMedicine("Валерьянка", 2);
        assertEquals(28, apteka_3_total_cost.getTotalCost());

        Apteka apteka_4_no_medicines = new Apteka("Аптека_4");
        assertEquals(0, apteka_4_no_medicines.getTotalCost());
    }
}
