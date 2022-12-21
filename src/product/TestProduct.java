package product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestProduct {
    public static void main(String[] args) {

        HashMap<String, Integer> foodBasket = new HashMap();

        Product banan = new Product("бананы", 88.0, 1);
        Product apple = new Product("яблоки", 150.99, 1);
        Product tomat = new Product("томаты", 122.0, 2);
        Product egg = new Product("яйца", 70.0, 10);
        Product bred = new Product("хлеб", 30.0, 1);
        Product milk = new Product("молоко", 40.0, 1);
        Product oil = new Product("масло", 100.0, 1);
        Product onion = new Product("лук", 20.0, 5);

        foodBasket.put("бананы", 2);
        foodBasket.put("яблоки", 2);
        foodBasket.put("томаты", 3);
        foodBasket.put("лук", 5);
        foodBasket.put("масло", 1);


        System.out.println(foodBasket);

        Set<Recipe> recipeBook = new HashSet<>();
        Recipe fruitSalad = new Recipe("фруктовый салат");
        Recipe eggInTomat = new Recipe("Яйцо в томате");
        Recipe bananInEgg = new Recipe("Банан в яйце");
        Recipe omlet = new Recipe("омлет");
        Recipe sandwich = new Recipe("хлеб с маслом");
        omlet.addRecipe(recipeBook);
        sandwich.addRecipe(recipeBook);
        System.out.println(recipeBook);
        System.out.println(omlet.getTotalCostAllProducts());

    }
}
