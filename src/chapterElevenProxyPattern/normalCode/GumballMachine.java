package chapterElevenProxyPattern.normalCode;

public class GumballMachine {

  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;
  String location;

  State state = soldOutState;
  int count = 0;

  public GumballMachine(String location, int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);
    this.count = numberGumballs;
    this.location = location;
    if (numberGumballs > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  void setState(State state) {
    this.state = state;
  }

  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public void setSoldOutState(State soldOutState) {
    this.soldOutState = soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public void setNoQuarterState(State noQuarterState) {
    this.noQuarterState = noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public void setHasQuarterState(State hasQuarterState) {
    this.hasQuarterState = hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public void setSoldState(State soldState) {
    this.soldState = soldState;
  }

  public State getState() {
    return state;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public void setWinnerState(State winnerState) {
    this.winnerState = winnerState;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
