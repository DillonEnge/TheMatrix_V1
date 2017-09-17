import java.io.File;
import java.io.FileNotFoundException;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by dillonenge on 2/21/17.
 */
public class OtherMethods {
    static Random rdm = new Random();
    static DecimalFormat dF1 = new DecimalFormat("0.0");
    static DecimalFormat dF3 = new DecimalFormat("0.000");

    /**
     * Generates a random human name first and last from a list of names
     * @return Full name
     */
    public static String createHumanName(){
        File names = new File("Names.txt");
        String firstName = parseRandom(names);
        String lastName = parseRandom(names);
        return firstName + " " + lastName;
    }

    /**
     * Generates a random city name from a list of nouns
     * @return City name
     */
    public static String createCityName(){
        File nouns = new File("Nouns.txt");
        String cityName = parseRandom(nouns);
        return cityName;
    }

    /**
     * Parses the passed in file to find a random word
     * @param f File to parse
     * @return Random word
     */
    private static String parseRandom(File f){
        try {
            Scanner s = new Scanner(f);
            int lineNumber = 0;
            int target;
            int counter = 0;
            String namePart = null;
            while (s.hasNextLine()) {
                s.nextLine();
                lineNumber++;
            }
            Scanner sNew = new Scanner(f);
            target = rdm.nextInt(lineNumber) + 1;
            while (sNew.hasNextLine() && counter != target) {
                namePart = sNew.nextLine();
                counter++;
            }
            return namePart;
        }catch(FileNotFoundException e){
            return null;
        }

    }

}
