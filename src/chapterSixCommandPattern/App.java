package chapterSixCommandPattern;

public class App {
  public static void main(String[] args) {
    SimpleRemoteControl remoteControl = new SimpleRemoteControl();
    Light diningRoomLight = new Light("Dining room");
    LightCommand lightCommand = new LightCommand(diningRoomLight);
    GarageDoor garageDoor = new GarageDoor();
    GarageDoorCommand garageDoorCommand = new GarageDoorCommand(garageDoor);
    remoteControl.setCommand(lightCommand);
    remoteControl.buttonPress();
    remoteControl.setCommand(garageDoorCommand);
    remoteControl.buttonPress();
  }
}
