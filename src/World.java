import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dillonenge on 2/20/17.
 */
public class World {
    int population;
    double waterToLandRatio;
    static ArrayList<City> cities;

    /**
     * Initializes a world with the passed in number of city's, the max population across the world,
     * and the min population across the world
     * @param numberOfCities Number of cities
     * @param populationMax Maximum population
     * @param populationMin Minimum Population
     */
    public static void initialize(int numberOfCities, int populationMax, int populationMin){
        cities = new ArrayList<>(numberOfCities);
        int upperBound = populationMax/numberOfCities;
        int lowerBound = populationMin/numberOfCities;
        for(int i = 0; i < numberOfCities; i++){
            cities.add(new City(upperBound));
            cities.get(i).populate(OtherMethods.rdm.nextInt(upperBound - lowerBound) + lowerBound);
        }

    }
}
