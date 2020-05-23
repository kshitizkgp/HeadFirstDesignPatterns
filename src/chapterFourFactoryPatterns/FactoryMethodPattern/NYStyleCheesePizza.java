package chapterFourFactoryPatterns.FactoryMethodPattern;

public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza() {
    name = "NY Style Deep Dish Cheese Pizza";
    dough = "Extra Thin Crust Dough";
    sauce = "Zero Plum Tomato Sauce";
    toppings.add("Shredded Mozzarella Cheese less");
  }
}
