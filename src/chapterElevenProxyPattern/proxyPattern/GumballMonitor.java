package chapterElevenProxyPattern.proxyPattern;

public class GumballMonitor {
  GumballMachineRemote machine;

  public GumballMonitor(GumballMachineRemote gumballMachine) {
    this.machine = gumballMachine;
  }

  public void report() {
    try {
      System.out.println("Gumball Machine: " + machine.getLocation());
      System.out.println("Current inventory: " + machine.getCount() + " gumballs");
      System.out.println("Current state: " + machine.getState());
    }catch (Exception ex){
     ex.printStackTrace();
    }
  }
}
