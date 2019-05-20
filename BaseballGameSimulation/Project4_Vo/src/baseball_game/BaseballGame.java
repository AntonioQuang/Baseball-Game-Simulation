/**
 * Baseball Game simulation 
 * The goal for this project is a simulation of a batter
 * facing a pitcher in baseball. First a two instances of an object is made with
 * with the Pitcher and the Batter class. Each object is filled with the parameters
 * of a name, a position, and a batter average or pitcher average. In the simulation
 * the pitch method will run and  will either throw a ball or a strike depending on the pitcher average.
 * If the pitcher throws a ball then the ball count will go up one. If the count reaches four
 * then the batter walks. If the pitcher throws a strike then the hit method will run.
 * The batter will either hit or miss the ball. If the batter misses, the strike count
 * will go up. If the strike reaches three then the batter strikes out. If the batter gets a
 * hit, a walk, or a struck out the program will end.
 */
package baseball_game;

public class BaseballGame {


    public static void main(String[] args) {
        //An instance of the Pitcher class is made, containing the name, position,
        //and average of the pitcher.
        Pitcher pitcher1 = new Pitcher("Phil Hughes", "pitcher", 0.80);
        //An instance of the Batter class is made, containing the name, position,
        //and average of the batter.
        Batter batter1 = new Batter("Chase Headley", "batter", 0.25);
        //The balls variable keeps track of the amount of balls is thrown by the pitcher.
        //The strikes variable keeps track of the amount of strikes.
        int balls = 0;
        int strikes = 0;
        //Prints out who is pitching to who.
        System.out.println(pitcher1.getName() + " is ptiching to " + batter1.getName());
        //This while loop will keep on repeating until 4 balls were thrown, 3 strikes happened,
        //or the batter gets a hit.
        while(balls != 4 && strikes != 3){
            //This first if statement will run if the pitch method returns true.
            //This means that the pitcher has thrown a strike.
            if(pitcher1.pitch()){
                //If the pitcher throws a strike then the hit method is run. If the 
                //hit method returns true then the batter got a hit and exits the
                //program.
                if(batter1.hit()){
                    System.out.println(batter1.getName() + " got a hit!");
                    System.exit(0);
                //If the batter misses the ball and the hit method returns false 
                //then the system will print out that the batter missed, 1 strike 
                // is added and the amount of balls and strikes is printed out.
                }else{
                    System.out.println(batter1.getName() + " swung and missed");
                    strikes++;
                    System.out.println("The count is " + balls + " balls and " + strikes + " strikes");
                }
            //If the pitch method returns false then this is statement is run. This
            //means that the pitcher threw a ball. The system prints that the 
            //pitcher threw a ball and prints out the amount of balls and strikes.
            }else{
                System.out.println(pitcher1.getName() + " threw a ball");
                balls++;
                System.out.println("The count is " + balls + " balls and " + strikes + " strikes");
            }
        }
        
        //Once the while loop has ended, if there are 3 strikes the progran will
        //print out that the batter struck out and the program ends.
        if(strikes == 3){
            System.out.println(batter1.getName() + " struck out.");
        }
        //If the amount of balls is 4, then the program prints out that the batter
        //walked and the program ends.
        if(balls == 4){
            System.out.println(batter1.getName() + " walked.");
        }
    }
    
}
