
/**
 * Created by dillonenge on 2/20/17.
 */

public class Human {
    int age;
    double weight;
    int appeal;
    int iQ;
    double height;
    double mortalityPercentage = .05;
    String name = "";
    //Human partner;
    static int total;
    boolean isAlive = true;
    boolean isKind = false;
    static int totalDead;

    /**
     * Constructor for a human that randomly generates all of their attributes
     */
    public Human() {
        age = OtherMethods.rdm.nextInt((95 - 18) + 1) + 18;
        if (age > 30) {
            for(int i = 0; i < age-30; i++){
                mortalityPercentage += .0004*i;
            }
        }
        if (!checkIfDies()) {
            weight = OtherMethods.rdm.nextGaussian() * 25 + 150;
            if (age > 60) {
                weight -= (age - 60) * .2;

            }
            if(OtherMethods.rdm.nextInt(1) == 1){
                isKind = true;
            }
            if (height < 5.6) {
                weight -= (5.6 - height) * 3;
            }
            height = OtherMethods.rdm.nextGaussian() * 0.4 + 5.5;
            iQ = (int) (OtherMethods.rdm.nextGaussian() * 15 + 100);
            appeal = OtherMethods.rdm.nextInt(9) + 1;
            name = OtherMethods.createHumanName();

            total++;
        }
    }

    /**
     * Kills a human
     */
    public void die() {
        age = 0;
        weight = 0;
        appeal = 0;
        iQ = 0;
        height = 0;
        name = null;
        isAlive = false;
        totalDead++;
    }

    /**
     * Checks against a persons mortality percentage if they die of natural causes
     * @return boolean
     */
    public boolean checkIfDies() {
        int check = (int) (100 * mortalityPercentage);
        if ((OtherMethods.rdm.nextInt(99) + 1) == check) { //Check for accuracy
            this.die();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        //String partnerName = (partner.name.equals(null)) ? "nobody" : partner.name;
        return name + " is " + age + " years old weighing " + OtherMethods.dF1.format(weight)
                + " measuring " + OtherMethods.dF1.format(height) + " feet with an iQ of " + iQ + " with a mortality rate of " + mortalityPercentage + "%";
    }

    //public static boolean areCompatible(Human human1, Human human2){
    //    int compatibilityPercentage = 0;
    //    if(human1.appeal >= human2.appeal - 2 || human1.appeal <= human2.appeal + 2){
    //        compatibilityPercentage += 25;
    //    }
    //    if(human1.age >= 60 && human2.age >= 60){
    //        compatibilityPercentage += 25;
    //    }
    //    if((human1.isKind && human2.isKind) || (!human1.isKind && !human2.isKind)){
    //        compatibilityPercentage += 25;
    //    }
    //    if(OtherMethods.rdm.nextInt(99) + 1 < compatibilityPercentage){
    //        return true;
    //    } else{
    //        return false;
    //    }
    //}

}
