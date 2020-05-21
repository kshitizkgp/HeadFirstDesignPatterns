package chapterOneStrategyPattern;

public class MuteQuake implements QuackBehavior {

  @Override
  public void quake() {
    System.out.println("I am MuteQuake!!");
  }
}
