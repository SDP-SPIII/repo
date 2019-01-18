package javaeight.debug;

public class Main implements Debuggable {
  int a = 100;
  String b = "Home";

  public static void main(String[] args) {
    Main m = new Main();
    System.out.println(m.debug());
  }
}