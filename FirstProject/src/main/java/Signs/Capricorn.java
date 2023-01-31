package Signs;

public class Capricorn implements Sign{

    String name = "Capricorn";
    String element = "Earth";
    String rep = "Horned Goat";

    char symbol = '\u2651';

    public Capricorn(){
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
