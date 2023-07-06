/**

 The Liquid class represents a liquid used in drinks.
 It contains information about the name, volume, and alcohol percentage of the liquid.
 */
package at.fhj.msd;
/**

 The Liquid class represents a liquid used in drinks.

 It contains information about the name, volume, and alcohol percentage of the liquid.
 */
public class Liquid {
    private String name; // Name of the liquid
    private double volume; // Volume of the liquid in liters
    private double alcoholPercent; // Alcohol percentage of the liquid

    /**

     Creates a Liquid object with the specified name, volume, and alcohol percentage.
     @param name the name of the liquid
     @param volume the volume of the liquid in liters
     @param alcoholPercent the alcohol percentage of the liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }
    /**

     Retrieves the name of the liquid.
     @return the name of the liquid
     */
    public String getName() {
        return name;
    }
    /**

     Sets the name of the liquid.
     @param name the new name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }
    /**

     Retrieves the volume of the liquid.
     @return the volume of the liquid in liters
     */
    public double getVolume() {
        return volume;
    }
    /**

     Sets the volume of the liquid.
     @param volume the new volume of the liquid in liters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    /**

     Retrieves the alcohol percentage of the liquid.
     @return the alcohol percentage of the liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
    /**

     Sets the alcohol percentage of the liquid.
     @param alcoholPercent the new alcohol percentage of the liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}