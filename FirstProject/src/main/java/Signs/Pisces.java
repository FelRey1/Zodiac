package Signs;

public class Pisces implements Sign{

    String name = "Pisces";
    String element = "Water";
    String rep = "Fish";

    char symbol = '\u2653';

    public Pisces(){
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
