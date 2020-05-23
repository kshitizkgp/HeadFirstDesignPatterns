package chapterFourFactoryPatterns.simpleFactoryIdeom;

public class ClamPizza extends Pizza {
  public ClamPizza() {
    name = "Clam Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";
    toppings.add("Shredded Mozzarella Cheese");
  }
}
