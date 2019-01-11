package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputStreamTransferTo {
  public static void main(String[] args) throws IOException {
    InputStream inputStream = getInputStream();
    Path path = Files.createTempFile("test-file", ".txt");
    OutputStream outputStream = new FileOutputStream(path.toFile());
    try (inputStream; outputStream) {
      inputStream.transferTo(outputStream);
    }
    Files.lines(path)
            .forEach(System.out::println);
  }

  public static InputStream getInputStream() {
    return new ByteArrayInputStream("test string".getBytes());
  }
}
