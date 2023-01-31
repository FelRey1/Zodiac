package Signs;

public class Scorpio implements Sign{

    String name = "Scorpio";
    String element = "Water";
    String rep = "Scorpion";

    char symbol = '\u264F';

    public Scorpio(){
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
