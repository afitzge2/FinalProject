package FinalProject;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileInputStream;
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
        WaterType waterType = WaterType.NONE;
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
            // testing individual parts of the fish object against a list of classes to see if they match
            for (int i = 0; i < testFish.size(); i++) {
                Fish c = testFish.get(i);
                // testing if the primary colors are the same
                if (pColor.equals(c.getPColor())) {
                    //testing if the secondary colors are the same
                    if (sColor.equals(c.getSColor())) {
                        //testing if the water types are the same
                        if (waterType.equals(c.getWaterType())) {
                            // testing if the length of the fish is greater than the minimum length
                            if (f.getLengthMin() >= c.getLengthMin()) {
                                //testing if the length of the fish is shorter than the maximum length
                                if (f.getLengthMax() <= c.getLengthMax()) {
                                    //setting the caught fish to include the name so it can be returned
                                    f = c;
                                }
                            }
                        }
                    }
                }
            }
            String fact = fishFacts(f);
            f.printInfo();
            System.out.print(fact);
            System.out.println("------------------------");
            System.out.println("Would you like to add this fish to a list of fish you have caught: Y/N ");
            String YN = input.next();
            // if (YN == "Y" || YN == "y") {
                // addFishToList(f);

            // }
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
            list.add(pike);
            Fish musky = new Fish("Muskellunge", "Brown", "None", WaterType.FRESHWATER, 32.0, 40.0);
            list.add(musky);
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
            Fish perch = new Fish("Perch", "Yellow", "Brown", WaterType.FRESHWATER, 7.0, 12.0);
            list.add(perch);
            Fish koi = new Fish("koi", "Yellow", "White", WaterType.FRESHWATER, 24.0, 36.0);
            list.add(koi);
            Fish cobia = new Fish("Cobia", "Grey", "White", WaterType.SALTWATER, 36.0, 60.0);
            list.add(cobia);
            Fish marlin = new Fish("Blue Marlin", "Blue", "Grey", WaterType.SALTWATER, 120.0,144.0 );
            list.add(marlin);
            Fish tuna = new Fish("Tuna", "Blue", "White", WaterType.SALTWATER, 60.0 , 96.0 );
            list.add(tuna);
            Fish tarpon = new Fish("Tarpon", "Silver", "Blue", WaterType.SALTWATER, 48.0 , 96.0 );
            list.add(tarpon);
            Fish giantTrevally = new Fish("Giant Trevally", "Silver", "None", WaterType.SALTWATER, 33.0 , 67.0);
            list.add(giantTrevally);
        }
        catch (InvalidFishException e) {
            System.err.println("InvalidFishExcpetion: " + e.getMessage());
        }

    }

    public static String fishFacts(Fish f) {
        if (f.getName().equals("bluegill")) {
            return "This is a small pan fish that is located throughout North American. It is known for its colors as well as being relatively common";
        }
        else if (f.getName().equals("Large Mouth Bass")) {
            return "This fish is the most commonly targeted freshwater sport fish in North America. The largest one ever caught was over 22 pounds!";
        }
        else if (f.getName().equals("Small Mouth Bass")) {
            return "This is a cousin of the Large Mouth Bass but stays smaller. They are native to the northern United States and Canada";
        }
        else if (f.getName().equals("Striped Bass")) {
            return "One of the largest memebers in the bass family, Striped Bass are known to reach over 20 pounds commonly. They also have the ability to live in both fresh and saltwater";
        }
        else if (f.getName().equals("Sunfish")) {
            return "A cousin of the Bluegill, these pan fish stay smaller but have much more vibrant colors. There are many types such as the green sunfish and the pumpkinseed";
        }
        else if (f.getName().equals("Pike")) {
            return "The pike is a long predatory fish native to the great lakes area. They are ambush hunters and will hide on the bottom until the food comes to them";
        }
        else if (f.getName().equals("Muskellunge")) {
            return "The Muskellunge or Musky for short is a larger cousin of the pike. The fish is so hard to catch it is often referred to as the fish of ten thousand casts!";
        }
        else if (f.getName().equals("Sturgeon")) {
            return "This is the largest freshwater fish in North America. Their scales are known to damage boat propellers due to their strength!";
        }
        else if (f.getName().equals("Salmon")) {
            return "This fish is the state fish of Alaska due to its importance to the state as a source of food. They spend most of their time in saltwater but come into streams at the end of their life.";
        }
        else if (f.getName().equals("Trout")) {
            return "The trout is similar in appearance to Salmon but remain in freshwater mountain streams their entire life.";
        }
        else if (f.getName().equals("Atlantic Spot")) {
            return "The Atlantic spot is a small fish that inhabits the American east coast and is namned after the spot located behind their gills. It is also commonly found throughout the Cheasapeake Bay!";
        }
        else if (f.getName().equals("Grouper")) {
            return "The Grouper is a large fish that is often known for their taste when eating. Some types can grow as large as a small car!";
        }
        else if (f.getName().equals("Cod")) {
            return "Cod are a common species of fish when it comes to fish in markets. they are also the most common fish in fish sticks!";
        }
        else if( f.getName().equals("Perch")) {
            return "Perch are a common freshwater fish in the north east of America. They have brown vertical bars with a yellow body";
        }
        else if (f.getName().equals("Koi")) {
            return "often known for their bueaty and stunnning colors, koi are a popular home pet. The most expensive Koi ever sold was 1.8 Million Dollars!";
        }
        else if (f.getName().equals("Cobia")) {
            return "The cobia is one of the largest fish to inhabit the Cheasapeake Bay. Its large size and strength make it a common fish for anglers to target";
        }
        else if (f.getName().equals("Blue Marlin")) {
            return "The Blue Marlin is a world known fish for its long 'sword' that it uses to catch fish. The largest Blue Marlin ever recorded was almost two thousand pounds!";
        }
        else if (f.getName().equals("Tuna")) {
            return "The Tuna is a large fish that is well known as a great tasting fish often used in sushi. they come in many different species like the bluefin and yellowfin";
        }
        else if (f.getName().equals("Tarpon")) {
            return "The Tarpon is a large aggressive fish native to the carribean sea and Gulf of Mexico. They are well known for their acrobatic displays of jumping out of the water";
        }
        else {
            return "The Giant Trevally is a highly sought after fish for sport fishers. Their strength and size make the idea fish to fight.";
        }
    }

    public static void addToFishList(Fish f) throws IOException {
        //open fishList to get current lines to save
        FileInputStream FileIn = new FileInputStream("FishList.txt");
        Scanner Scan = new Scanner(FileIn);
        //make array list to save current and additional line to
        ArrayList<String> fishList = new ArrayList<String>();
        // get all lines from text file and save to an array list
        while(Scan.hasNextLine()) {
            fishList.add(Scan.nextLine());
        }
        //close FishList.txt
        FileIn.close();
        // get info about the fish and save to a string
        String fInfo = f.getName() + ", " + f.getPColor() + ", " + f.getSColor() + ", " + f.getWaterType() + ", " + f.getLengthMin(); 
        fishList.add(fInfo);
        // open FishList.txt and create PrintWriter to print arraylist back to the text file
        FileOutputStream FileOut = new FileOutputStream("FishList.txt");
        PrintWriter out = new PrintWriter(FileOut);
        // print line by line to text file
        for (int i = 0; i < fishList.size(); i++) {
            String a = fishList.get(i);
            out.println(a);
        }
        FileOut.close();
    }
}

