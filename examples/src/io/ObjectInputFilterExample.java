package io;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ObjectInputFilterExample {
  public static void main(String[] args) throws Exception {
    objectOutputInputTest(new TestClass());
    objectOutputInputTest(new TestClass2());
  }

  private static void objectOutputInputTest(Object objectToSerialize) throws Exception {
    //serializing object
    Path path = Files.createTempFile("test-class-file", "");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream(path.toFile()));
    try (objectOutputStream) {
      objectOutputStream.writeObject(objectToSerialize);
    }

    //deserializing object
    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()));
    objectInputStream.setObjectInputFilter(createObjectFilter());//setting filter
    try (objectInputStream) {
      Object o = objectInputStream.readObject();
      System.out.println("Object deserialized: " + o);
    }
  }

  private static ObjectInputFilter createObjectFilter() {
    return filterInfo -> {
      Class<?> theClass = filterInfo.serialClass();
      if (JComponent.class.isAssignableFrom(theClass)) {
        System.err.println("JComponent class is not allowed for serialization: " +
                theClass.getSimpleName());
        return ObjectInputFilter.Status.REJECTED;
      }
      System.out.println("Allowed: " + theClass.getSimpleName());
      return ObjectInputFilter.Status.ALLOWED;
    };
  }

  public static class TestClass implements Serializable {
  }

  public static class TestClass2 extends JComponent implements Serializable {
  }
}
