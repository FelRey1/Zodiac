/**
 * @author Felix Reyes Jr.
 * @date 1/30/23
 * An Interface for zodiac sign classes
 */

package Signs;
import java.awt.*;

public interface Sign {

    String signName = null;  //name of the zodiac sign
    String signElement = null;  //element type of the zodiac sign
    String signAnimal = null;   // Animal representation of the zodiac sign

    Image symbol = null;

    /**
     *
     * @return the name of the zodiac sign
     */
    String getName();

    /**
     *
     * @return the element type of the zodiac sign
     */
    String getElement();

    /**
     *
     * @return therepresentation of the zodiac sign
     */
    String getRep();

    /**
     *displays the symbol of the zodiac sign
     */
    char displaySymbol();




}
