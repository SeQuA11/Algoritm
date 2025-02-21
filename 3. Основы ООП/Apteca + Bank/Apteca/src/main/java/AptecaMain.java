import java.util.Random;

/**
 * Главный класс для запуска приложения, представляющего аптеку.
 * Создает несколько аптек, добавляет медикаменты со случайными ценами и количеством,
 * а затем выводит информацию о каждой аптеке, включая самое дорогое лекарство и общую стоимость.
 */
public class AptecaMain {
    public static void main(String[] args) {
        Random rnd = new Random();

        Apteca ap1 = new Apteca("Мир здоровья");
        ap1.addMedication("Парацитамол", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap1.addMedication("Ибупрофен", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap1.addMedication("Вазилин", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap1.addMedication("Энергоферон", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap1.addMedication("Боярышник", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap1.addMedication("Йод", rnd.nextInt(0, 500), rnd.nextInt(0, 500));

        Apteca ap2 = new Apteca("Будь здоров");
        ap2.addMedication("Парацитамол", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap2.addMedication("Ибупрофен", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap2.addMedication("Энергоферон", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap2.addMedication("Боярышник", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap2.addMedication("Йод", rnd.nextInt(0, 500), rnd.nextInt(0, 500));

        Apteca ap3 = new Apteca("Инвитро");
        ap3.addMedication("Парацитамол", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap3.addMedication("Ибупрофен", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap3.addMedication("Вазилин", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap3.addMedication("Энергоферон", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap3.addMedication("Йод", rnd.nextInt(0, 500), rnd.nextInt(0, 500));

        Apteca ap4 = new Apteca("ХренСтобой");
        ap4.addMedication("Ибупрофен", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap4.addMedication("Вазилин", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap4.addMedication("Энергоферон", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap4.addMedication("Боярышник", rnd.nextInt(0, 500), rnd.nextInt(0, 500));
        ap4.addMedication("Йод", rnd.nextInt(0, 500), rnd.nextInt(0, 500));

        Apteca ap5 = new Apteca("Надежда");

        ap1.infoMedication();
        System.out.println("\nСамое дорогое лекарство: " + ap1.MaxPrice() + " руб.");
        System.out.println("Стоимость всех лекарств: " + ap1.SumPrice() + " руб.");
        System.out.println("*************************************");
        System.out.println("");

        ap2.infoMedication();
        System.out.println("\nСамое дорогое лекарство: " + ap2.MaxPrice() + " руб.");
        System.out.println("Стоимость всех лекарств: " + ap2.SumPrice() + " руб.");
        System.out.println("*************************************");
        System.out.println("");

        ap3.infoMedication();
        System.out.println("\nСамое дорогое лекарство: " + ap3.MaxPrice() + " руб.");
        System.out.println("Стоимость всех лекарств: " + ap3.SumPrice() + " руб.");
        System.out.println("*************************************");
        System.out.println("");

        ap4.infoMedication();
        System.out.println("\nСамое дорогое лекарство: " + ap4.MaxPrice() + " руб.");
        System.out.println("Стоимость всех лекарств: " + ap4.SumPrice() + " руб.");
        System.out.println("*************************************");
        System.out.println("");

        ap5.infoMedication();
        System.out.println("\nСамое дорогое лекарство: " + ap5.MaxPrice() + " руб.");
        System.out.println("Стоимость всех лекарств: " + ap5.SumPrice() + " руб.");
        System.out.println("*************************************");
        System.out.println("");
    }
}
