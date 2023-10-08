public class Main {
    public static void main(String[] args) {
        Home home = new Table(new Sofa(new BasicHome()));
        System.out.println(home.exist());
    }
}