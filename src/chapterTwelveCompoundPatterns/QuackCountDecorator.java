package chapterTwelveCompoundPatterns;

public class QuackCountDecorator implements Quackable {

  Quackable duck;
  static int quackCount;

  public QuackCountDecorator(Quackable duck) {
    this.duck = duck;
  }

  @Override
  public void quack() {
    duck.quack();
    quackCount++;
  }

  public static int getQuackCount() {
    return quackCount;
  }
}
