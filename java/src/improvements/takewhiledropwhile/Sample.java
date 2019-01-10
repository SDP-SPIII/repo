import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(11, 21, 13, 41, 51, 16, 71, 81, 19, 99);

    //Java 8:
    //filter takes a predicate. limit does not, it takes a number. Likewise skip takes a number

    System.out.println("filter");
    numbers.stream()
            .filter(e -> e > 72)
            .forEach(System.out::println);

    System.out.println("limit");
    numbers.stream()
            .limit(3)
            .forEach(System.out::println);

    System.out.println("skip");
    numbers.stream()
            .skip(8)
            .forEach(System.out::println);

    //filter is a flap, it will open or close for each element that passes through.
    //limit is a gate that closes when count is reached.
    //skip is a gate that open when the count is reached.

    //There is no way to limit or skip based on a predicate/condition. But, that feature is highly useful.

    //Java 9 has those. Instead of limitWhile, we have takeWhile. Instead of skipWhile, we have dropWhile

    System.out.println("takeWhile");
    numbers.stream()
            .takeWhile(e -> e < 40)
            .forEach(System.out::println);

    System.out.println("dropWhile");
    numbers.stream()
            .dropWhile(e -> e < 40)
            .forEach(System.out::println);
  }
}

