package chapterThreeDecoratorPattern.decorators;

import chapterThreeDecoratorPattern.Beverages.Beverage;

public class Whip  extends CondimentDecorator {

  Beverage beverage;
  public Whip(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return 0.18 + beverage.cost();
  }
}
