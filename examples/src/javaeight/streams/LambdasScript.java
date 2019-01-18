package javaeight.streams;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdasScript {
  public static void main(String[] args) {
    // takes a Long, returns a String
    Function<Long, String> f = (l) -> l.toString();

    // takes nothing gives you Threads
    Supplier<Thread> s = Thread::currentThread;

    // takes a string as the parameter
    Consumer<String> c = System.out::println;

    // use them in with streams
    new ArrayList<String>().stream().
            // peek: debug streams without changes
                    peek(e -> System.out.println(e)).
            // map: convert every element into something
                    map(e -> e.hashCode()).
            // filter: pass some elements through
                    filter(e -> ((e.hashCode() % 2) == 0)).
            // collect the stream into a collection
                    collect(Collectors.toCollection(TreeSet::new));
  }
}
