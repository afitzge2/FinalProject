package FinalProject;

/**
 * This class creates the object of fish.
 *it contains the constructors of: primary color, secondary color, fresh or salt water, and length
 * @Austin Fitzgerald
 * @November 11, 2021
 */
public class Fish
{
    private String pColor;
    private String sColor;
    private WaterType waterType;
    private double fishLengthMin;
    private double fishLengthMax;
    private String name;
    private double length;
    // create default constructor
    public Fish() {
        this.pColor = " ";
        this.sColor = " ";
        this.waterType = null;
        this.fishLengthMin = 1;
        this.fishLengthMax = 1;
        this.name = " ";
    }
    // create non default constructor
    public Fish(String pColor, String sColor, WaterType w, double l) throws InvalidFishException {
        this.pColor = pColor;
        this.sColor = sColor;
        this.waterType = w;
        this.length = l;
        this.name = " ";
    }

    public Fish(String n, String pColor, String sColor, WaterType w, double lMin, double lMax) throws InvalidFishException {
        this.pColor = pColor;
        this.sColor = sColor;
        this.waterType = w;
        this.fishLengthMin = lMin;
        this.fishLengthMax = lMax;
        this.name = n;
    }

    public Fish(String n, String pColor, String sColor, WaterType w, double l, double lMin, double lMax) throws InvalidFishException {
        this.pColor = pColor;
        this.sColor = sColor;
        this.waterType = w;
        this.length = l;
        this.name = n;
        this.fishLengthMin = lMin;
        this.fishLengthMax = lMax;
    }
    // create get and set methods for all descriptions
    public String getPColor() {
        return this.pColor;
    }

    public void setPColor(String p) {
        this.pColor = p;
    }

    public String getSColor() {
        return this.sColor;
    }

    public void setSColor(String s) {
        this.sColor = s;
    }

    public WaterType getWaterType() {
        return this.waterType;
    }

    public void setWaterType(WaterType w) {
        this.waterType = w;
    }

    public double getLengthMin() {
        return this.fishLengthMin;
    }

    public void setLengthMin(double l) {
        this.fishLengthMin = l;
    }

    public double getLengthMax() {
        return this.fishLengthMax;
    }

    public void setLengthMax(double l) {
        this.fishLengthMax = l;
    }

    public String getName() {
        return this.name;
    }

    public void setName( String n) {
        this.name = n;
    }

    public double getLength() {
        return this.length;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println("The primary color of " + this.name + " is " + this.pColor);
        System.out.println("The secondary color of " + this.name + " is " + this.sColor);
        System.out.println(this.name + " grows between " + this.fishLengthMin + " and " + this.fishLengthMax);
    }

    public String toString() {
        String n = this.name;
        String pColor = this.pColor;
        String sColor = this.sColor;
        WaterType w = this.waterType;
        double l = this.length;
        String fishLength = Double.toString(l);
        String all = "The fish is called " + n + " its primary color is " + pColor + " its seconday color is " + sColor + " and it had a length of " + fishLength;
        return all;
    }
}
