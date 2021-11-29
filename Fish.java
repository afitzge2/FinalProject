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
    private double fishLength;
    
    // create default constructor
    public Fish() {
        this.pColor = " ";
        this.sColor = " ";
        this.waterType = null;
        this.fishLength = 0;
    }
    // create non default constructor
    public Fish(String pColor, String sColor, WaterType w, double l) {
        this.pColor = pColor;
        this.sColor = sColor;
        this.waterType = w;
        this.fishLength = l;
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
    public double getLength() {
        return this.fishLength;
    }
    public void setLength(double l) {
        this.fishLength = l;
    }
}
