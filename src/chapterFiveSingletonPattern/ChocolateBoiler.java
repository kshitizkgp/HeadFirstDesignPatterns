package chapterFiveSingletonPattern;

public class ChocolateBoiler {
  private static int cnt;
  private static ChocolateBoiler uniqueInstance;
  private static Object lock = new Object();

  private ChocolateBoiler() {
  }

  public static ChocolateBoiler getUniqueInstance() {

    if (uniqueInstance == null) {
      synchronized (lock) {
        if (uniqueInstance == null) {
          cnt++;
          System.out.println("Instance created, Instance count: " + cnt);
          uniqueInstance = new ChocolateBoiler();
        }
      }
    }
    return uniqueInstance;
  }

  public void boil() {
    System.out.println("Boiling chocolates...");
  }

}
