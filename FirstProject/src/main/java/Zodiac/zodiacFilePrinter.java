/**
 * @author Felix Reyes Jr.
 * @date 1/24/23
 * A class for a File printer
 */

package Zodiac;
import java.io.*;

public class zodiacFilePrinter {

    File file;//the file to be printed

    public zodiacFilePrinter(){
    }

    /**
     * Will print out specified file to the console
     * @param file the file to be printed
     * @throws IOException
     */
    public void printFile(File file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line = in.readLine();
        while(line != null)
        {
            System.out.println(line);
            line = in.readLine();
        }
        in.close();
    }
}