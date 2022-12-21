package product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class Recipe {
    private final Map<Product, Integer> products = new HashMap<>();
    private final String recipeName;
    //private int costProducts;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public double getTotalCostAllProducts() {
        double totalCostAllProducts = 0.0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            totalCostAllProducts += product.getKey().getPrice() * product.getValue();
        }
        return totalCostAllProducts;
    }

    public void checkProduct(String name) {
        boolean isBought = false;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            if (product.getKey().getName().equals(name)) {
                System.out.println(name + " куплен ");
                isBought = true;
                break;
            }
        }
        if (!isBought) {
            System.out.println(name + " не куплен");
        }
    }

    public void addProductToFoodBasket(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.containsKey(product)) {
            Integer productCount = this.products.get(product);
            this.products.put(product, ++productCount);
        } else {
            this.products.put(product, 1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, recipeName);
    }

    public void addRecipe(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException(this.recipeName + " рецепт уже есть.");
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "products=" + products +
                ", recipeName='" + recipeName + '\'' +
                '}';
    }
}
