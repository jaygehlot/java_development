package timbuchalka_interfaces.interfaces_challenge1;

public class ByTwos implements Series {

  int val;

  ByTwos() {
    val = 0;
  }

  @Override
  public int getNext() {
    if (val >= MAX) {
      System.out.println(ERRORMSG);
    } else {
      val += 2;
    }
    return val;
  }

  public int getPrev() {
    return val -= 2;
  }

  public void printStuff() {
    System.out.println("--Printing from byTwos");
  }
}
