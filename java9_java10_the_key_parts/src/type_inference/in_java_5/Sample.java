package type_inference.in_java_5;

import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    
    int first = numbers.<Integer>get(0);
    int second = numbers.get(1); //Type inference at work, this is so common we don't realize often
    
    System.out.println(first);
    System.out.println(second);
  }
}