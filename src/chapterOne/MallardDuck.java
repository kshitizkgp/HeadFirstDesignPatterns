package chapterOne;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quake();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I’m a real Mallard duck");
  }
}
