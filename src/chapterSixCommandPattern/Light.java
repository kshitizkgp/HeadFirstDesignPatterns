package chapterSixCommandPattern;

public class Light {

  String name;

  public Light(String name) {
    this.name = name;
  }

  public void on(){
    System.out.println("Light of " + name +" is on.");
  }

  public void off(){
    System.out.println("Light of " + name +" is off");
  }
}
