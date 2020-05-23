package chapterFourFactoryPatterns.simpleFactoryIdeom;

public class PepperoniPizza extends Pizza {

  public PepperoniPizza() {
    name = "Pepperoni Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";
    toppings.add("Shredded Mozzarella Cheese");
  }
}
