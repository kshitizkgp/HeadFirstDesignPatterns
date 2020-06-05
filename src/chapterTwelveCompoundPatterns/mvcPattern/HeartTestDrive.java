package chapterTwelveCompoundPatterns.mvcPattern;

import chapterTwelveCompoundPatterns.mvcPattern.controller.ControllerInterface;
import chapterTwelveCompoundPatterns.mvcPattern.controller.HeartController;
import chapterTwelveCompoundPatterns.mvcPattern.model.HeartModel;

public class HeartTestDrive {
  public static void main(String[] args) {
    HeartModel heartModel = new HeartModel();
    ControllerInterface model = new HeartController(heartModel);
  }
}
