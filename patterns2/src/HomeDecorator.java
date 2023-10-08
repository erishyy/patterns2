public class HomeDecorator implements Home{
    Home home;
    public HomeDecorator(Home home) {
        this.home = home;
    }

    @Override
    public String exist() {
        return home.exist();
    }
}
