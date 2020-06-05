package chapterTwelveCompoundPatterns.mvcPattern;

import chapterTwelveCompoundPatterns.mvcPattern.controller.BeatController;
import chapterTwelveCompoundPatterns.mvcPattern.controller.ControllerInterface;
import chapterTwelveCompoundPatterns.mvcPattern.model.BeatModel;
import chapterTwelveCompoundPatterns.mvcPattern.model.BeatModelInterface;

public class DJTestDrive {
  public static void main(String[] args) {
    BeatModelInterface model = new BeatModel();
    ControllerInterface controller = new BeatController(model);
  }
}
