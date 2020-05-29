package chapterSixCommandPattern;

public class NoCommand implements Command {

  @Override
  public void execute() {
    System.out.println("Nothing to execute");
  }
}
