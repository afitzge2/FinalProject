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
    // create default constructor
    public Fish() {
        this.pColor = " ";
        this.sColor = " ";
        this.waterType = null;
        this.fishLengthMin = 0;
        this.fishLengthMax = 0;
        this.name = " ";
    }
    // create non default constructor
    public Fish(String pColor, String sColor, WaterType w, double lMin, double lMax) throws InvalidFishException {
        this.pColor = pColor;
        this.sColor = sColor;
        if (w.equals(WaterType.FRESHWATER) || w.equals(WaterType.SALTWATER)) {
            this.waterType = w;
        }
        else {
            InvalidFishException e = new InvalidFishException("Fish can only be from Freshwater or Saltwater");
            throw e;
        }
        if (fishLengthMin > 0) {
            this.fishLengthMin = lMin;
        }
        else {
            InvalidFishException e = new InvalidFishException("A fish cannot have a negative length");
            throw e;
        }
        if (fishLengthMax > 0) {
            this.fishLengthMax = lMax;
        }
        else {
            InvalidFishException e = new InvalidFishException("A fish cannot have a negative length");
            throw e;
        }
        this.name = " ";
    }

    public Fish(String n, String pColor, String sColor, WaterType w, double lMin, double lMax) throws InvalidFishException {
        this.pColor = pColor;
        this.sColor = sColor;
        if (w.equals(WaterType.FRESHWATER) || w.equals(WaterType.SALTWATER)) {
            this.waterType = w;
        }
        else {
            InvalidFishException e = new InvalidFishException("Fish can only be from Freshwater or Saltwater");
            throw e;
        }
        if (fishLengthMin > 0) {
            this.fishLengthMin = lMin;
        }
        else {
            InvalidFishException e = new InvalidFishException("A fish cannot have a negative length");
            throw e;
        }
        if (fishLengthMax > 0) {
            this.fishLengthMax = lMax;
        }
        else {
            InvalidFishException e = new InvalidFishException("A fish cannot have a negative length");
            throw e;
        }
        this.name = n;
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
}
