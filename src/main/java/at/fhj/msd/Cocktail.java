/**

 The at.fhj.msd package contains classes related to drinks and liquids.
 */
package at.fhj.msd;
import java.util.List;

/**

 The Cocktail class represents a type of drink that can be created by combining multiple liquids.

 It extends the Drink class and provides additional functionality for managing cocktail ingredients.
 */
public class Cocktail extends Drink {
    List<Liquid> ingredients;

    /**

     Creates a Cocktail object with the specified name and ingredients.
     @param name the name of the cocktail
     @param ingredients a list of Liquid objects representing the liquids in the cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }
    /**

     Retrieves the volume of the cocktail.
     @return the volume of the cocktail
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid : ingredients){
            volume += liquid.getVolume();
        }
        return volume/ingredients.size();
    }
    /**

     Retrieves the alcohol percentage of the cocktail.
     @return the alcohol percentage of the cocktail
     */
    @Override
    public double getAlcoholPercent() {
        double alcohol = 0;
        for (Liquid liquid : ingredients){
            alcohol += liquid.getAlcoholPercent();
        }
        return alcohol/ingredients.size();
    }
    /**

     Checks if the cocktail is alcoholic.
     @return true if the cocktail contains alcohol
     */
    @Override
    public boolean isAlcoholic() {
        if (getAlcoholPercent() > 0){
            return true;
        }
        else return false;
    }
    /**

     Retrieves the list of ingredients in the cocktail.
     @return a list of Liquid objects representing the ingredients in the cocktail
     */
    public List<Liquid> getIngredients() {
        return ingredients;
    }
    /**

     Sets the list of ingredients for the cocktail.
     @param ingredients a list of Liquid objects representing the new ingredients for the cocktail
     */
    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}