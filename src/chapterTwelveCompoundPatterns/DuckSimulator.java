package chapterTwelveCompoundPatterns;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    simulator.simulate(duckFactory);
  }

  void simulate(AbstractDuckFactory duckFactory) {
    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Goose goose = new Goose();
    Quackable gooseAdapter = new GooseAdapter(goose);

    System.out.println("\nDuck Simulator");
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
    simulate(gooseAdapter);

    System.out.println("No. of quacks is: " + QuackCountDecorator.getQuackCount());
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
}
