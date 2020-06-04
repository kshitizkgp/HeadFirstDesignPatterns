package chapterTenStatePattern.statePattern;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(200);
    for(int i=0;i<100;++i) {
      System.out.println(gumballMachine);
      gumballMachine.insertQuarter();
      gumballMachine.turnCrank();
      System.out.println(gumballMachine);
      gumballMachine.insertQuarter();
      gumballMachine.turnCrank();
      gumballMachine.insertQuarter();
      gumballMachine.turnCrank();
      System.out.println(gumballMachine);
    }
  }
}
