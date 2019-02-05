package helpsession;

import java.util.ArrayList;
import java.util.List;

class Clazz {
  Clazz makeClazz() {
    return new SubClazz();
  }

  static Clazz acceptClazz(Clazz cls) {
    return cls;
  }
}

class SubClazz extends Clazz {
}

public class Example {
  public static void main(String[] args) {
    Clazz cl = new SubClazz();
    cl = new SubClazz();
    //SubClazz scl = (SubClazz) new Clazz(); // oops!!!

    Clazz.acceptClazz(new SubClazz());

    Clazz[] array = new Clazz[10];
    array[0] = new SubClazz();
    array = new SubClazz[10];
    //array[0] = new Clazz(); // compiles but runtime error

    //List<Clazz> lc = new ArrayList<SubClazz>(); //; won't work invariant

    List<?> lc = new ArrayList<Clazz>();
    //System.out.println(lc.getClass().getTypeName());
    List<? extends Clazz> lst = new ArrayList<SubClazz>();
    List<? super Clazz> lst2 = new ArrayList<Object>();

    List<? super Clazz> superClazz = null;
    List<? super SubClazz> superSubClazz = null;

    superSubClazz = superClazz;
    // superClazz = superSubClazz; = NO!


  }
}

// Overloading or overriding
// Covariant return types

interface Parent {
  Clazz meth(Clazz arg);
}

interface Child extends Parent {
  SubClazz meth(Clazz arg);
}
