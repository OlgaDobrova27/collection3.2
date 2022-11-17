package recipeBook;

import java.util.HashSet;
import java.util.Set;


public class RecipeBook {

    private final Set<Recipe> recipes;

    public RecipeBook() {
        recipes = new HashSet<>();
    }

    public void addRecipe(Recipe r) {
        if (recipes.contains(r)) {
            throw new IllegalArgumentException("This recipe is already exists!");
        }
        recipes.add(r);
    }

    public Recipe getRecipeByName(String name) {
        return recipes.stream().filter(p -> p.getName().equals(name)).findAny().orElse(null);
    }
}
