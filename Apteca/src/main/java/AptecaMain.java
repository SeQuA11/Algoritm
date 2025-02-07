import java.util.ArrayList;
import java.util.Random;

public class AptecaMain {
    public static void main(String[] args) {
        ArrayList<Medication> medications = new ArrayList<>();
        Random rnd = new Random();

        int price = rnd.nextInt(0, 500);
        int quantity = rnd.nextInt(0, 50);

        if (quantity == 0) price = 0;


        Apteca ap1 = new Apteca("Мир здоровья");
        ap1.addMedication("Парацитамол", price, quantity);
        ap1.addMedication("Ибупрофен", price, quantity);
        ap1.addMedication("Вазилин", price, quantity);
        ap1.addMedication("Энергоферон", price, quantity);
        ap1.addMedication("Боярышник", price, quantity);
        ap1.addMedication("Йод", price, 0);

        Apteca ap2 = new Apteca("Мир здоровья");
        ap2.addMedication("Парацитамол", price, quantity);
        ap2.addMedication("Ибупрофен", price, quantity);
        ap2.addMedication("Энергоферон", price, quantity);
        ap2.addMedication("Боярышник", price, quantity);
        ap2.addMedication("Йод", price, quantity);

        Apteca ap3 = new Apteca("Мир здоровья");
        ap3.addMedication("Парацитамол", price, 0);
        ap3.addMedication("Ибупрофен", price, quantity);
        ap3.addMedication("Вазилин", price, quantity);
        ap3.addMedication("Энергоферон", price, quantity);
        ap3.addMedication("Йод", price, quantity);

        Apteca ap4 = new Apteca("Мир здоровья");
        ap4.addMedication("Ибупрофен", price, quantity);
        ap4.addMedication("Вазилин", price, quantity);
        ap4.addMedication("Энергоферон", price, 0);
        ap4.addMedication("Боярышник", price, quantity);
        ap4.addMedication("Йод", price, quantity);

        Apteca ap5 = new Apteca("Мир здоровья");

        ap1.infoMedication();
    }
}
