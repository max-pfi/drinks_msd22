
package at.fhj.msd;
import java.util.List;


public class Cocktail extends Drink {
    List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid : ingredients){
            volume += liquid.getVolume();
        }
        return volume/ingredients.size();
    }
    @Override
    public double getAlcoholPercent() {
        double alcohol = 0;
        for (Liquid liquid : ingredients){
            alcohol += liquid.getAlcoholPercent();
        }
        return alcohol/ingredients.size();
    }
    @Override
    public boolean isAlcoholic() {
        if (getAlcoholPercent() > 0){
            return true;
        }
        else return false;
    }
    public List<Liquid> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}