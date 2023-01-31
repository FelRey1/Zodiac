package Signs;

public class Virgo implements Sign{

    String name = "Virgo";
    String element = "Earth";
    String rep = "Maiden";

    char symbol = '\u264D';

    public Virgo(){
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
