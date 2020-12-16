package timbuchalka_interfaces.interfaces_challenge1;

public class Main {
  public static void main(String[] args) {

    ByTwos byTwos = new ByTwos();
    ByThrees byThrees = new ByThrees();

    Series series;

    Series.staticPrint();

    for (int i=0; i<6; i++) {
//      System.out.println("Increment by Twos: "  + byTwos.getNext());
//      System.out.println("Increment by Threes: "  + byThrees.getNext());
//      System.out.println("---------------------");

      System.out.println("TWOS============================");

      series = byTwos;
      System.out.println("--From interface twos: " + series.getNext());
      series.printStuff();

      System.out.println("THREES============================");

      series = byThrees;
      System.out.println("---From interface threes: " + series.getNext());
      series.printStuff();
    }
  }
}
