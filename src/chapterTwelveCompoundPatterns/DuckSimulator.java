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

    Flock flock = new Flock();

    flock.add(gooseAdapter);
    flock.add(redheadDuck);
    flock.add(duckCall);
    flock.add(rubberDuck);

    Flock flockOfMallards = new Flock();

    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();

    flockOfMallards.add(mallardOne);
    flockOfMallards.add(mallardTwo);
    flockOfMallards.add(mallardThree);
    flockOfMallards.add(mallardFour);

    flock.add(flockOfMallards);

    System.out.println("\nDuck Simulator: Whole Flock Simulation");
    simulate(flock);
    System.out.println("\nDuck Simulator: Mallard Flock Simulation");
    simulate(flockOfMallards);
    System.out.println("\nThe ducks quacked " + QuackCountDecorator.getQuackCount() + " times");
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
}
