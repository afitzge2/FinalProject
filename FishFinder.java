package FinalProject;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program is designed to get an input from the user with the details about a fish that they had just caught.
 *It will then check the details against a list of identifying features and if one matches, it will return the name of the fish and some information about it.
 * @Austin Fitzgerald
 * @November 11, 2021
 */
public class FishFinder
{
    public static void main(String[] args) {
        //create a array list to hold all fish objects to test against the inputted fish
        ArrayList<Fish> testFish = new ArrayList<Fish>();
        // add all fish with addFishToListMethod
        addFishToList(testFish);
        //create new scanner
        Scanner input = new Scanner(System.in);
        // ask for the primary color of the fish
        System.out.print("What is the main color of the fish: ");
        String pColor = input.next();
        // if primary color entered is gray, change to grey
        if (pColor.equals("Gray")) {
            pColor = "Grey";
        }
        // ask for secondary color
        System.out.print("What is the secondary color of the fish (if one color enter None): ");
        String sColor = input.next();
        // if secondary color is gray, change to grey
        if (sColor.equals("Gray")) {
            sColor = "Grey";
        }
        //get water type for the fish
        System.out.print("Is the fish from fresh or salt water: ");
        String wType = input.next();
        WaterType waterType = null;
        // use the wType to set a new variable waterType to the enum of either FRESHWATER or SALTWATER
        if (wType.equals("Freshwater") || wType.equals("freshwater") || wType.equals("Fresh") || wType.equals("fresh")) {
             waterType = WaterType.FRESHWATER;
        }
        else if (wType.equals("Saltwater") || wType.equals("saltwater") || wType.equals("Salt") || wType.equals("salt")) {
             waterType = WaterType.SALTWATER;
        }
        else {
            waterType = WaterType.NONE;
        }
        // input fish length
        System.out.print("What is the length of the fish in inches: ");
        double length = input.nextDouble();
        
        // try/ catch to find out if the fish is in the list
        try {
            // create Fish object
            Fish f = new Fish(pColor, sColor, waterType, length, length);
            for (int i = 0; i < testFish.size(); i++) {
                Fish c = testFish.get(i);
                if (pColor.equals(c.getPColor())) {
                    if (sColor.equals(c.getSColor())) {
                        if (waterType.equals(c.getWaterType())) {
                            if (f.getLengthMin() >= c.getLengthMin()) {
                                if (f.getLengthMax() <= c.getLengthMax()) {
                                    
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(InvalidFishException e) {
            System.err.println("InvalidFishExcpetion: " + e.getMessage() );
        }
    }
    public static void addFishToList(ArrayList<Fish> list) {
        try {
            Fish bluegill = new Fish("Bluegill", "Blue", "Grey", WaterType.FRESHWATER, 4.0, 6.0);
            list.add(bluegill);
            Fish largeMouthBass = new Fish("Large Mouth Bass", "Green", "White", WaterType.FRESHWATER,12.0, 16.0);
            list.add(largeMouthBass);
            Fish smallMouthBass = new Fish("Small Mouth Bass", "Green", "Brown", WaterType.FRESHWATER, 9.0, 13.0);
            list.add(smallMouthBass);
            Fish stripedBass = new Fish("Striped Bass", "Silver", "Black", WaterType.SALTWATER, 24.0, 32.0);
            list.add(stripedBass);
            Fish sunfish = new Fish("Sunfish", "Yellow", "Green", WaterType.FRESHWATER, 3.0, 5.0);
            list.add(sunfish);
            Fish pike = new Fish("Pike", "Green", "None", WaterType.FRESHWATER, 16.0, 24.0);
            Fish musky = new Fish("Muskellunge", "Brown", "None", WaterType.FRESHWATER, 32.0, 40.0);
            list.add(pike);
            Fish sturgeon = new Fish("Sturgeon", "Silver", "White", WaterType.FRESHWATER, 50.0, 60.0);
            list.add(sturgeon);
            Fish salmon = new Fish("Salmon", "Silver", "None", WaterType.SALTWATER, 12.0, 24.0);
            list.add(salmon);
            Fish trout = new Fish("trout", "Silver", "Yellow", WaterType.FRESHWATER, 10.0, 16.0);
            list.add(trout);
            Fish atlanticSpot = new Fish("Atlantic Spot", "Silver", "None", WaterType.SALTWATER, 6.0, 12.0);
            list.add(atlanticSpot);
            Fish grouper = new Fish("Grouper", "Red", "Brown", WaterType.SALTWATER, 24.0, 40.0);
            list.add(grouper);
            Fish cod = new Fish("Cod", "Brown", "None", WaterType.SALTWATER, 27.0, 34.0);
            list.add(cod);
        }
        catch (InvalidFishException e) {
            System.err.println("InvalidFishExcpetion: " + e.getMessage());
        }
            
        }
        
        public String FishFacts(Fish f) {
            if (f.getName().equals("bluegill")) {
                
            }
            return " ";
        }
    }

