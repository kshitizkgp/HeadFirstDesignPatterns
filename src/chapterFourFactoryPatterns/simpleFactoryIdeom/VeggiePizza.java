package chapterFourFactoryPatterns.simpleFactoryIdeom;

public class VeggiePizza extends Pizza {

  public VeggiePizza() {
    name = "Veggie Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";
    toppings.add("Shredded Mozzarella Cheese");
  }
}
