
package baseball_game;


public class Pitcher {
    private String name;
    private String position;
    private double strikeAverage;

    public Pitcher(String name, String position, double strikeAverage) {
        this.name = name;
        this.position = position;
        this.strikeAverage = strikeAverage;
    }
        /**
     * This method decides if a pitcher throws a strike or a ball. This method will
     * either return true or false depending on the average of the pitcher and what
     * random number is generated.
     * Precondition - The average of the pitcher is set.
     * Postcondition - True is returned if chance is less than or equal to the average
     * of the pitcher. If it is not then false is returned.
     * @return either true or false.
     */
    public boolean pitch(){
        double chance = Math.random();
        if(chance <= strikeAverage){
            return true;
        }else{
            return false;
        }
    }
/**
 * Returns the name of the pitcher.
 * Precondition - The name of the pitcher is already set.
 * Postcondition - The name of the pitcher is returned.
 * @return the name of the pitcher.
 */
    public String getName() {
        return name;
    }
    
}
