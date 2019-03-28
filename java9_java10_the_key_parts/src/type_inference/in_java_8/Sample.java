package type_inference.in_java_8;

import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    
    numbers.forEach((Integer e) -> System.out.println(e * 2));
    
    numbers.forEach(e -> System.out.println(e * 2)); //Type inference in lambdas
  }
}