package chapterTenStatePattern.statePattern;

public class SoldOutState implements State {

  GumballMachine gumballMachine;
  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Sorry!! We are sold out.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You haven't inserted any quarter!! fool");
  }

  @Override
  public void turnCrank() {
    System.out.println("Keep on turning you fool...we are out!!");
  }

  @Override
  public void dispense() {
    System.out.println("Can't dispense, sold out!!");
  }
}
