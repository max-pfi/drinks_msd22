package at.fhj.msd;

import at.fhj.msd.Drink;
import at.fhj.msd.Liquid;

import java.util.List;

public class Cocktail extends Drink {
    List<at.fhj.msd.Liquid> ingredients;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     * @param ingredients all liquids in the drink
     */
    public Cocktail(String name, List<at.fhj.msd.Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    public List<Liquid> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}
