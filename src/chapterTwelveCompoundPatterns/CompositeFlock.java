package chapterTwelveCompoundPatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositeFlock implements Quackable {
  ArrayList quackers = new ArrayList();
  Observable observable;

  public CompositeFlock() {
    this.observable = new Observable(this);
  }

  public void add(Quackable quacker) {
    quackers.add(quacker);
  }

  @Override
  public void quack() {
    Iterator iterator = quackers.iterator();
    while (iterator.hasNext()) {
      Quackable quacker = (Quackable) iterator.next();
      quacker.quack();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    Iterator iterator = quackers.iterator();
    while (iterator.hasNext()) {
      Quackable quacker = (Quackable) iterator.next();
      quacker.registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers() {}
}
