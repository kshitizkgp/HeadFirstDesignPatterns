package chapterOneStrategyPattern;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm not flying!!");
  }
}
