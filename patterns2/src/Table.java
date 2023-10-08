public class Table extends HomeDecorator{
    public Table(Home home){
        super(home);
    }

    public String exist(){
        return super.exist() + addTable();
    }
    public String addTable(){
        return " with table";
    }
}
