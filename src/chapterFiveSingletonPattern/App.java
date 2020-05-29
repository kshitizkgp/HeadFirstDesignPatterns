package chapterFiveSingletonPattern;

public class App {

  public static void main(String[] args) {
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i=0;i<100;++i) {
          ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance();
//          boiler.boil();
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i=0;i<100;++i) {
          ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance();
//          boiler.boil();
        }
      }
    });

    t1.start();
    t2.start();
  }
}
