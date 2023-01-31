package Signs;

public class Leo implements Sign{

    String name = "Leo";
    String element = "Fire";
    String rep = "Lion";

    char symbol = '\u264C';

    public Leo(){
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
