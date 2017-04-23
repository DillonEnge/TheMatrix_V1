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
    public static String createHumanName(){
        File names = new File("Names.txt");
        String firstName = parseRandom(names);
        String lastName = parseRandom(names);
        return firstName + " " + lastName;
    }

    public static String createCityName(){
        File nouns = new File("Nouns.txt");
        String cityName = parseRandom(nouns);
        return cityName;
    }

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
