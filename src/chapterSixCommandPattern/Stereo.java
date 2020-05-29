package chapterSixCommandPattern;

public class Stereo {

  public void on(){
    System.out.println("Turning on the stereo");
  }

  public void setCD(String cd){
    System.out.println("Inserting the CD: " + cd);
  }

  public void setVolume(int volume){
    System.out.println("Setting the volume: " + volume);
  }
}
