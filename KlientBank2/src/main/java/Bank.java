import java.util.ArrayList;
import java.util.Random;

public class Bank {
    Random rnd = new Random();
    static String FIO;
    static int passport;
    ArrayList<Score> score;

    public Bank(String appeal) {}

    public Bank(String FIO, int passport) {
        this.FIO = FIO;
        this.passport = passport;
        this.score = new ArrayList<>();
    }

    public void addScore() {
        score.add(new Score());
    }

    public void infoMedication() {
        System.out.println("Клиент '" + FIO + "'" + "\nПаспорт" + passport);
        if (score.isEmpty()){
            System.out.println("");
            return;
        }

        // Перебираем и выводим информацию о каждом медикаменте
        for (Score sc : score) {
            for (int i = 1; i < score.size(); i++) {
                System.out.println(i + ": "+ sc);
            }
        }
    }

//    public void displayCompanyInfo() {
//        System.out.println();
//        System.out.println("Название компании: " + name
//                + "\nОтрасль: " + work
//                + "\nКоличество сотрудников: " + persons
//                + "\nЗароботная плата: " + money);
//    }
}
