public class Basketball extends Sport {
    protected String hoop_height;

    public Basketball(String name, int team_size, String hoop_height) {
        super(name, team_size);
        this.hoop_height = hoop_height;
    }

    @Override
    String play() {
        return "Игроки передают мя руками и пытаются забросить его в кольцо соперника";
    }

    @Override
    String get_rules() {
        return "Две команды по 5 игроков играют четыре перида по 12 минут";
    }

    @Override
    String infoSport() {
        return "Название: " + name + ", количество игроков: " + team_size + ", высота кольца: " + hoop_height;
    }
}
