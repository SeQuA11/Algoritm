public class main {
    public static void main(String[] args) {
        Football football = new Football("Футбол", 11, "105x68 метров");
        System.out.println(football.infoSport() + "\n" + football.play() + "\n" + football.get_rules() + "\n");

        Basketball basketball  = new Basketball("Баскетбол", 5, "3.05 метра");
        System.out.println(basketball.infoSport() + "\n" + basketball.play() + "\n" + basketball.get_rules() + "\n");

        Tennis tennis  = new Tennis("Теннис", 2, "Трава");
        System.out.println(tennis.infoSport() + "\n" + tennis.play() + "\n" + tennis.get_rules() + "\n");
    }
}
