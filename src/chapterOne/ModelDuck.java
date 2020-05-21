package chapterOne;

public class ModelDuck extends Duck {

  public ModelDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }

  @Override
  public void display() {

  }
}
