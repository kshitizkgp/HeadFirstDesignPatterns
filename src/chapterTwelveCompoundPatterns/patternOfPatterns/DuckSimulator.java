package chapterTwelveCompoundPatterns.patternOfPatterns;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    simulator.simulate(duckFactory);
  }

  void simulate(AbstractDuckFactory duckFactory) {
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Goose goose = new Goose();
    Quackable gooseAdapter = new GooseAdapter(goose);

    CompositeFlock compositeFlock = new CompositeFlock();

    compositeFlock.add(gooseAdapter);
    compositeFlock.add(redheadDuck);
    compositeFlock.add(duckCall);
    compositeFlock.add(rubberDuck);

    CompositeFlock compositeFlockOfMallards = new CompositeFlock();

    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();

    compositeFlockOfMallards.add(mallardOne);
    compositeFlockOfMallards.add(mallardTwo);
    compositeFlockOfMallards.add(mallardThree);
    compositeFlockOfMallards.add(mallardFour);

    compositeFlock.add(compositeFlockOfMallards);

//    System.out.println("\nDuck Simulator: Whole Flock Simulation");
//    simulate(compositeFlock);
//    System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//    simulate(compositeFlockOfMallards);
//    System.out.println("\nThe ducks quacked " + QuackCountDecorator.getQuackCount() + " times");

    System.out.println("\nDuck Simulator: With Observer");
    Quackologist quackologist = new Quackologist();
    compositeFlock.registerObserver(quackologist);
    simulate(compositeFlock);
    System.out.println("\nThe ducks quacked " + QuackCountDecorator.getQuackCount() + " times");
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
}
