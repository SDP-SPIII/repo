package io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamReadAllBytes {
  public static void main(String[] args) throws IOException {
    try (InputStream inputStream = getInputStream()) {
      byte[] bytes = inputStream.readAllBytes();
      System.out.println(new String(bytes));
    }
  }

  public static InputStream getInputStream() {
    return new ByteArrayInputStream("test string".getBytes());
  }
}
