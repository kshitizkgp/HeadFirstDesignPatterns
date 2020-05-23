package chapterFourFactoryPatterns.abstractFactoryPattern;

import chapterFourFactoryPatterns.abstractFactoryPattern.ingredients.Cheese;
import chapterFourFactoryPatterns.abstractFactoryPattern.ingredients.Clams;
import chapterFourFactoryPatterns.abstractFactoryPattern.ingredients.Dough;
import chapterFourFactoryPatterns.abstractFactoryPattern.ingredients.Pepperoni;
import chapterFourFactoryPatterns.abstractFactoryPattern.ingredients.Sauce;
import chapterFourFactoryPatterns.abstractFactoryPattern.ingredients.Veggies;

public abstract class Pizza {

  String name;
  Dough dough;
  Sauce sauce;
  Veggies veggies[];
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clam;

  abstract void prepare();

  void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }
}
