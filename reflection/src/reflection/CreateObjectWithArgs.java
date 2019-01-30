package reflection;

import java.lang.reflect.Constructor;

public class CreateObjectWithArgs {
  public static void main(String[] args) {
    Class c;
    try {
      // Hard wired class name and arguments
      String aclass = "reflection.Simple";
      String arg = "a b c d";
      // Split the string into individual strings
      String[] splitArgs = arg.split(" ");

      // check the length of the split to make sure it worked okay
      System.out.println(splitArgs.length);

      // Create array of types
      Class[] argTypes = new Class[splitArgs.length];
      for (int x = 0; x < splitArgs.length; x++) {
        argTypes[x] = splitArgs[x].getClass();
      }

      // we should now have an array of classes
      // java.lang.String java.lang.String java.lang.String java.lang.String
      for (Class cl : argTypes) {
        System.out.println(cl);
      }

      // load the class file
      c = Class.forName(aclass);

      // get the required constructor with the appropriate signature
      Constructor cons = c.getDeclaredConstructor(argTypes);

      // now create the instance
      Object o = cons.newInstance(splitArgs);
      // print out the object to make sure it was created
      System.out.println(o);

      // should be more specific about the exceptions but this is just an example
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/*
 * Simple class is just take - a class with some fields and an appropriate constructor
 * with a toString to print out the variables
 */
class Simple {
  private String first;
  private String second;
  private String third;
  private String fourth;

  public Simple(String first, String second, String third, String fourth) {
    this.first = first;
    this.second = second;
    this.third = third;
    this.fourth = fourth;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("First: ").append(first)
            .append(", Second: ").append(second)
            .append(", Third: ").append(third)
            .append(", Fourth: ").append(fourth);
    return sb.toString();
  }
}