public class Football extends Sport {
    protected String field_size;

    public Football(String name, int team_size, String field_size) {
        super(name, team_size);
        this.field_size = field_size;
        //System.out.println(name, team_size, field_size);
    }

    @Override
    String play() {
        return "Игроки передают мяч ногами и стараются забить гол в ворота соперника";
    }

    @Override
    String get_rules() {
        return "Две команды по 11 игроков играют два тайма по 45 минут";
    }

    @Override
    String infoSport() {
        return "Название: " + name + ", количество игроков: " + team_size + ", размеры поля: " + field_size;
    }
}
