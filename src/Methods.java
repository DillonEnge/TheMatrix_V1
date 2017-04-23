

/**
 * Created by dillonenge on 2/22/17.
 */
public class Methods {
    static World mainWorld;

    public static void createWorld(int numberOfCities, int populationMax, int populationMin){
        mainWorld = new World();
        mainWorld.initialize(numberOfCities, populationMax, populationMin);
        for(City city: mainWorld.cities){
            System.out.println(city.population);
        }
    }
}
