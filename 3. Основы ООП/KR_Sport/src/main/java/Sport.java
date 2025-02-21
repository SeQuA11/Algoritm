public abstract class Sport {
    protected String name;
    protected int team_size;

    public Sport(String name, int team_size) {
        this.name = name;
        this.team_size = team_size;
    }

    abstract String play();
    abstract String get_rules();
    abstract String infoSport();

}


