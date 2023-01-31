package Signs;

public class Gemini implements Sign{

    String name = "Gemini";
    String element = "Air";
    String rep = "Twins";

    char symbol = '\u264A';

    public Gemini(){
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
