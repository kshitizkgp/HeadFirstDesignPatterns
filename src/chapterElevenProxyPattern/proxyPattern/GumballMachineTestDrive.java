package chapterElevenProxyPattern.proxyPattern;

import java.rmi.Naming;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("GumballMachine invalid");
      System.exit(1);
    }

    int count = Integer.parseInt(args[1]);
    GumballMachine gumballMachine = null;
    try {
      gumballMachine = new GumballMachine(args[0], count);
      Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
    } catch (Exception e) {
      e.printStackTrace();
    }
    GumballMonitor monitor = new GumballMonitor(gumballMachine);
    for (int i = 0; i < 6770; ++i) {
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

    monitor.report();
  }
}
