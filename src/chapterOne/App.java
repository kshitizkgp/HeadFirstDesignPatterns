package chapterOne;

public class App {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuake();

    Duck model = new ModelDuck();
    FlyBehavior rocket = new FlyRocketPowered();

    model.performFly();
    model.setFlyBehavior(rocket);
    model.performFly();
  }
}
