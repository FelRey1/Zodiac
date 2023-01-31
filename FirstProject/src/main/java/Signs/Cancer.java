package Signs;

public class Cancer implements Sign{

    String name = "Cancer";
    String element = "Water";
    String rep = "Crab";

    char symbol = '\u264B';

    public Cancer(){
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getElement() {
        return element;
    }

    @Override
    public String getRep() {
        return rep;
    }

    @Override
    public char displaySymbol() {
        return symbol;
    }
}
