import java.util.ArrayList;

/**
 * Created by dillonenge on 2/20/17.
 */
public class City {

    static int total;
    int population;
    int populationLimit;
    String name;
    ArrayList<Human> humans;
    public void populate(double numberOfHumans){
        humans = new ArrayList<>((int)numberOfHumans);
        long initialTime = System.nanoTime();
        double percentagePerHuman = 100.0/numberOfHumans;
        double percentageComplete = 0;
        for(int i = 0; i < numberOfHumans; i++){
            Human human = new Human();
            if(human.isAlive) {
                humans.add(new Human());
                if(i % 2 == 0) {
                    System.out.println("Progress: " + OtherMethods.dF1.format(percentageComplete) + "%");
                }
                percentageComplete += percentagePerHuman;
            }else{
                i--;
            }
        }
        population = humans.size();
        long finalTime = System.nanoTime();
        int timeElapsed = (int)((finalTime - initialTime)/1000000000);
        System.out.println("Process took " + timeElapsed + " seconds to complete.");
    }
    public City(int populationLimit){
        this.populationLimit = populationLimit;
        name = OtherMethods.createCityName();
        total++;
    }

    @Override
    public String toString(){
        return "City " + name + " has population " + population + " people and has capacity for " + populationLimit + " people.";
    }

}
