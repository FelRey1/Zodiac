package Signs;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class Aries implements Sign{

    String name = "Aries";
    String element = "Fire";
    String rep = "Ram";

    char symbol = '\u2648';

    public Aries(){
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
