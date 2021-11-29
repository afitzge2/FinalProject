package FinalProject;
import java.util.Scanner;

/**
 * This program is designed to get an input from the user with the details about a fish that they had just caught.
 *It will then check the details against a list of identifying features and if one matches, it will return the name of the fish and some information about it.
 * @Austin Fitzgerald
 * @November 11, 2021
 */
public class FishFinder
{
    public static void main(String[] args) {
        //create new scanner
        Scanner input = new Scanner(System.in);
        // ask for the primary color of the fish
        System.out.print("What is the main color of the fish: ");
        String pColor = input.next();
        // ask for secondary color
        System.out.print("What is the secondary color of the fish (if one color enter None): ");
        String sColor = input.next();
        //get water type for the fish
        System.out.print("Is the fish from fresh or salt water: ");
        String wType = input.next();
        WaterType waterType = null;
        // use the wType to set a new variable waterType to the enum of either FRESHWATER or SALTWATER
        if (wType.equals("Freshwater") || wType.equals("freshwater") || wType.equals("Fresh") || wType.equals("fresh")) {
             waterType = WaterType.FRESHWATER;
        }
        else {
             waterType = WaterType.SALTWATER;
        }
        // input fish length
        System.out.print("What is the length of the fish in inches: ");
        double length = input.nextDouble();
        
        // create Fish object
        Fish f = new Fish(pColor, sColor, waterType, length);
        
    }
}
