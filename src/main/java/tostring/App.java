package tostring;

class Frog{

    /**
     * Overrides toString in Object class
     * @return
     */
  public String toString(){
      return "Hello";
  }
}

public class App {
    public static void main(String[] args) {
        Frog f = new Frog();
        System.out.println(f);
    }
}
