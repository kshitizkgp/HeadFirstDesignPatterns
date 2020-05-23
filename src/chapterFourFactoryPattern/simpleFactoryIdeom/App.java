package chapterFourFactoryPattern.simpleFactoryIdeom;

public class App {

  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    store.orderPizza("cheese");
    store.orderPizza("clam");
    store.orderPizza("veggie");
  }
}
