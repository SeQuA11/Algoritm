public class Tennis extends Sport {
    protected String court_type;

    public Tennis(String name, int team_size, String court_type) {
        super(name, team_size);
        this.court_type = court_type;
    }

    @Override
    String play() {
        return "Игроки перекидывают мяч через сетку с помощью ракеток";
    }

    @Override
    String get_rules() {
        return "Игра ведется до выйгрыша двух сетов, каждый сет до 6 геймов";
    }

    @Override
    String infoSport() {
        return "Название: " + name + ", количество игроков: " + team_size + ", тип корта: " + court_type;
    }
}
