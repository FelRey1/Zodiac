/**
 * @author Felix Reyes Jr.
 * @date 1/24/23
 * A class for an editor for the Zodiac.txt file
 */
package Zodiac;
import java.io.*;
import java.util.*;


public class zodiacFileEditor {
    File zodiacFile; //the file of zodiac signs names to be read
    List<String> signList = new LinkedList<String>(); // a list of the text of the file
    Map<String,String> signMap = new HashMap<String, String>(); // a map of the signs as values and their birthdates as keys

    public zodiacFileEditor(File file){
        zodiacFile = file;
    }

    /**
     *  reads the given txt of zodiac names and add the names to a linkedlist
     * @return a list of the sign names
     * @throws FileNotFoundException
     */
    public List<String> readFile() throws FileNotFoundException {
        String sign;
        Scanner scanner = new Scanner(zodiacFile);
        while(scanner.hasNextLine()){
            sign = scanner.nextLine().toLowerCase();
            signList.add(sign);
        }
        return signList;
    }

    /**
     * grabs every zodiac sign's date range
     * @param sign
     * @return the date range of the given sign
     */
    public String getDateRange(String sign){
        sign = sign.toLowerCase();
        String signDateRange = "";
        if(signList.contains(sign)){
            switch(sign){
                case "aries":
                    signDateRange = "March 21st - April 19th";
                    break;
                case "taurus":
                    signDateRange = " April 20th - May 20th";
                    break;
                case "gemini":
                    signDateRange = "May 21st - June 20th";
                    break;
                case "cancer":
                    signDateRange= "June 21st - July 22th";
                    break;
                case "leo":
                    signDateRange= "July 23rd - August 22nd";
                    break;
                case "virgo":
                    signDateRange = "August 23rd - September 22nd";
                    break;
                case "libra":
                    signDateRange = "September 23rd - October 22nd";
                    break;
                case "scorpio":
                    signDateRange = "October 23rd - November 21st";
                    break;
                case "sagittarius":
                    signDateRange = "November 22nd - December 21st";
                    break;
                case "capricorn":
                    signDateRange = "December 22nd - January 19th";
                    break;
                case "aquarius":
                    signDateRange = "January 20th - Febuary 18th";
                    break;
                case "pisces":
                    signDateRange = "Febuary 19th - March 20th";
                    break;
            }
        }
        return signDateRange;
    }

    /**
     * maps the linked list of sign names
     * @return a hashMap of the sign names as values and date ranges as keys
     */
    public Map<String,String> mapList(){
        String sign;
        Iterator it = signList.listIterator();
        while(it.hasNext()){
            sign = (String) it.next();
            signMap.put(getDateRange(sign),sign);
        }
        return signMap;
    }

    /**
     * writes the given file to include the date ranges of each sign
     * @param file
     * @return the edited file
     * @throws IOException
     */
    public File writeFile(File file) throws IOException {
        File newFile = File.createTempFile("ZodiacTemp", null);
        String[] words=null;  //Intialize the word Array
        FileReader fr = new FileReader(file);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        int count=0;   //Intialize the word to zero
        while((s=br.readLine())!=null)   //Reading Content from the file
        {
            words = s.split(" ");  //Split the word using space
            PrintWriter writer = new PrintWriter
                    (new BufferedWriter
                            (new FileWriter(newFile, true))); //make writer for the file
            for (String word : words) //go through the array of words
            {
                switch (word.toLowerCase()) {
                    case "aries":
                        writer.println("Aries: March 21st - April 19th");
                        break;
                    case "taurus":
                        writer.println("taurus: April 20th - May 20th");
                        break;
                    case "gemini":
                        writer.println("Gemini: May 21st - June 20th");
                        break;
                    case "cancer":
                        writer.println("Cancer: June 21st - July 22th");
                        break;
                    case "leo":
                        writer.println("Leo: July 23rd - August 22nd");
                        break;
                    case "virgo":
                        writer.println("Virgo: August 23rd - September 22nd");
                        break;
                    case "libra":
                        writer.println("Libra: September 23rd - October 22nd");
                        break;
                    case "scorpio":
                        writer.println("Scorpio: October 23rd - November 21st");
                        break;
                    case "sagittarius":
                        writer.println("Sagittarius: November 22nd - December 21st");
                        break;
                    case "capricorn":
                        writer.println("Capricorn: December 22nd - January 19th");
                        break;
                    case "aquarius":
                        writer.println("Aquarius: January 20th - Febuary 18th");
                        break;
                    case "pisces":
                        writer.println("Picies: Febuary 19th - March 20th");
                        break;
                }
            }
            writer.close();

        }
        return newFile;
    }
}
