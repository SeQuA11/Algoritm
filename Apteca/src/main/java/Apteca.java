import java.util.ArrayList;

public class Apteca {
    public String name;
    ArrayList<Medication> medications;


    public Apteca(String name) {
        this.name = name;
    }

    public void addMedication(String medName, int price, int quantity) {
        medications.add(new Medication(medName, price,quantity));
    }

    public void infoMedication() {
        System.out.println("Аптека '" + name + "'");
        if (medications.isEmpty()) System.out.println("Лекарств нет");

        for (Medication med : medications) {
            System.out.println(med);
        }
    }

}
