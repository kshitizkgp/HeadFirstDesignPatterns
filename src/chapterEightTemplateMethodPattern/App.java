package chapterEightTemplateMethodPattern;

public class App {
  public static void main(String[] args) {
    Tea myTea = new Tea();
    Coffee myCoffee = new Coffee();

    myTea.prepareRecipe();
    System.out.println("");
    myCoffee.prepareRecipe();
  }
}
