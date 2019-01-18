package javaten;

import java.util.Date;

public class TernaryOperatorFive {
  public static void main(String[] args) {
    var x = args.length > 0 ? args.length : "no args";
    x = new Date();//ok because Date implements both Serializable and Comparable
    //x = Currency.getInstance("USD"); // implements Serializable but not Comparable
  }
}
