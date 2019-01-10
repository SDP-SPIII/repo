package improvements.optionalimprovements;

import java.util.*;
import java.util.stream.*;

public class Sample {
  public static void iterate(Stream<Integer> values) {
    System.out.print("Iterating...");
    values.forEach(System.out::println);
  }

  public static void use(List<Integer> numbers, int pivot) {

    numbers.stream()
            .filter(e -> e > pivot)
            .findFirst()
            .ifPresentOrElse(e -> System.out.println("The value is:" + e), () -> System.out.println("no value found"));

    System.out.println(
            numbers.stream()
                    .filter(e -> e > pivot)
                    .findFirst()
                    .or(() -> Optional.of(-2)));

    iterate(
            numbers.stream()
                    .filter(e -> e > pivot)
                    .findFirst()
                    .stream());
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    use(numbers, 5);
    System.out.println("---------");
    use(numbers, 50);
  }
}
