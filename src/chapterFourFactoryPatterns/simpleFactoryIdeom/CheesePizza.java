package chapterFourFactoryPatterns.simpleFactoryIdeom;

public class CheesePizza extends Pizza {

  public CheesePizza() {
    name = "Cheese Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";
    toppings.add("Shredded Mozzarella Cheese");
  }
}
