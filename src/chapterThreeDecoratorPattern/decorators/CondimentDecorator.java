package chapterThreeDecoratorPattern.decorators;
import chapterThreeDecoratorPattern.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}
