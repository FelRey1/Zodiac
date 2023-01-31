package Signs;

public class Sagittarius implements Sign{

    String name = "Sagittarius";
    String element = "Fire";
    String rep = "Archer";

    char symbol = '\u2650';

    public Sagittarius(){
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
