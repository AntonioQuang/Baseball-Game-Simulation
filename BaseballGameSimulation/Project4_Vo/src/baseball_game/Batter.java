
package baseball_game;


public class Batter {
    private String name;
    private String position;
    private double average;

    public Batter(String name, String position, double average) {
        this.name = name;
        this.position = position;
        this.average = average;
    }
    /**
     * This method decides if a batter his or misses the ball. This method will
     * either return true or false depending on the average of the batter and what
     * random number is generated.
     * Precondition - The average of the batter is set.
     * Postcondition - True is returned if chance is less than or equal to the average
     * of the batter. If it is not then false is returned.
     * @return either true or false.
     */
    public boolean hit(){
        double chance = Math.random();
        if(chance <= this.average){
            return true;
        }else{
            return false;
        } 
    }
/**
 * Returns the name of the batter.
 * Precondition - The name of the batter is already set.
 * Postcondition - The name of the batter is returned.
 * @return the name of the batter.
 */
    public String getName() {
        return name;
    }
    
}
