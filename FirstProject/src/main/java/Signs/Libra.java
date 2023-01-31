package Signs;

public class Libra implements Sign{

    String name = "Libra";
    String element = "Air";
    String rep = "Scales";

    char symbol = '\u264D';

    public Libra(){
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
