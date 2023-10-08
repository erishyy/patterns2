public class Sofa extends HomeDecorator{
    public Sofa(Home home){
        super(home);
    }

    public String exist(){
        return super.exist() + addSofa();
    }
    public String addSofa(){
        return " with sofa";
    }
}
