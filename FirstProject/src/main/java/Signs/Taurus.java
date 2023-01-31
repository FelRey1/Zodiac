package Signs;

import java.io.IOException;

public class Taurus implements Sign{

    String name = "Taurus";
    String element = "Earth";
    String rep = "Bull";

    char symbol = '\u2649';

    public Taurus() {
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
