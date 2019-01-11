package javaten;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ListExampleTwo {
  public static void main(String[] args) {
    //list not equivalent to List<Object> but List<Object&Serializable&Comparable>
    var list = new ArrayList<>(Arrays.asList(10, "two"));
    System.out.println(list);
    Serializable s = list.get(0);
    System.out.println(s);
    Comparable c = list.get(0);
    System.out.println(c);
    Object o = list.get(0);//still ok
    System.out.println(o);
    //Integer i = list.get(0); not ok
    //String s = list.get(1); not ok
    list.add(BigDecimal.valueOf(3.3));//ok BigDecimal implements both Serializable & Comparable
    list.add(new Date());//ok Date implements both Serializable & Comparable
    System.out.println(list);
  }
}
