package timbuchalka_interfaces.interfaces_challenge1;

public interface Series {
  // all variable are public static and final by default
  int MAX = 10;

  String ERRORMSG = "Cannot go above value " + MAX;

  int getNext();

  default void printStuff() {
    System.out.println("Default method in Series interface.");
    printFromPrivate();
  }

  static void staticPrint() {
    System.out.println("Hey from static method!");
  }

  private void printFromPrivate() {
    System.out.println("Private method here :-)");
  }
}
