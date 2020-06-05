package chapterTwelveCompoundPatterns;

public interface QuackObservable {
  public void registerObserver(Observer observer);

  public void notifyObservers();
}
