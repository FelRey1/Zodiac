/**
 * @author Felix Reyes Jr.
 * @date 1/24/23
 */

import Zodiac.*;
import Signs.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) throws IOException {
        System.out.println("<------welcome to the Zodiac project!------>");
        System.out.println("<------loading file Zodiac.txt------->");
        File infile = new File("Zodiac.txt");
        System.out.println(infile + "\n");

        System.out.println("<------Creating editor------>");
        zodiacFileEditor editor = new zodiacFileEditor(infile);
        System.out.println("<------Creating printer------>");
        zodiacFilePrinter printer = new zodiacFilePrinter();
        System.out.println("<------Done!------>" + "\n");

        System.out.print("<------Reading File------>" + "\n");
        System.out.println("<------Printing input file------>");
        printer.printFile(infile);
        System.out.println("\n");

        System.out.print("<------converting to LinkedList------>" + "\n");
        System.out.println(editor.readFile() + "\n");

        System.out.println("<------converting to HashMap------>");
        System.out.println(editor.mapList() + "\n");

        System.out.println("<------Writing to temp file------>");
        File outFile = editor.writeFile(infile);
        System.out.println(outFile.getName());
        System.out.println("<------Done!------>" + "\n");

        System.out.println("<------Printing temp file----->");
        printer.printFile(outFile);

        System.out.println("<------Deleting temp file------>");
        outFile.deleteOnExit();
        System.out.println("<------Done!------>");
        zodiacInfo();


    }
    public static void zodiacInfo() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to know more about your zodiac? \n [y]yes \n [n]no \n");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("y")){
            SignInfo info = new SignInfo();
            Sign sign = info.getSign();
            info.getSignInfo(sign);
        }
        else if(ans.equalsIgnoreCase("n")){
            System.out.println("GoodBye!");
        }
        else{
            System.out.println("Please enter y or n");
            zodiacInfo();
        }
    }
}
