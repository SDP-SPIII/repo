package ch06.sec05;

import java.util.ArrayList;
import java.util.List;

public class WordList extends ArrayList<String> {
  public static boolean isBadWord(String s) {
    return List.of("sex", "drugs", "c++").contains(s.toLowerCase());
  }

  public boolean add(String e) {
    return !isBadWord(e) && super.add(e);
  }

  public String get(int i) {
    return super.get(i).toLowerCase();
  }
}