package chapterSixCommandPattern;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Living Room");
    Light kitchen = new Light("Kitchen");

    LightCommand livingRoomLightOn = new LightCommand(livingRoomLight);
    LightsOffCommand livingRoomLightOff = new LightsOffCommand(livingRoomLight);

    LightCommand kitchenLightOn = new LightCommand(kitchen);
    LightsOffCommand kitchenLightOff = new LightsOffCommand(kitchen);

    Stereo stereo = new Stereo();
    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    remoteControl.onButtonPush(0);
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, stereoOnWithCDCommand, kitchenLightOff);

    remoteControl.onButtonPush(0);
    remoteControl.onButtonPush(1);
    remoteControl.offButtonPush(1);
    remoteControl.offButtonPush(0);
    remoteControl.offButtonPush(0);
    remoteControl.onButtonPush(2);
  }
}
