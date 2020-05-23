package chapterFourFactoryPatterns.FactoryMethodPattern;

//note that we are subclassing this class using inheritance but this class is abstract.
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  protected abstract Pizza createPizza(String type);
}
