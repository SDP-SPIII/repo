package capture;

public class Main {
  public static void main(String[] args) {
    MyFactory myFactory = (chars) -> {
      return new String(chars);
    };

    String myString = "Test";

    myFactory = (chars) -> {
      return myString + ":" + new String(chars);
    };
  }
}
