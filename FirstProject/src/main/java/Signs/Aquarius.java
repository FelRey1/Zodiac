package Signs;

public class Aquarius implements Sign{

    String name = "Aquarius";
    String element = "Water";
    String rep = "water carrier";

    char symbol = '\u2652';

    public Aquarius(){
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
