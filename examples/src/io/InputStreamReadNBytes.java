package io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamReadNBytes {
  public static void main(String[] args) throws IOException {
    try (InputStream inputStream = getInputStream()) {
      byte[] bytesToRead = new byte[4];
      inputStream.readNBytes(bytesToRead, 0, bytesToRead.length);
      System.out.println(new String(bytesToRead));
    }
  }

  public static InputStream getInputStream() {
    return new ByteArrayInputStream("test string".getBytes());
  }
}
