package designpatterns.factorymethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileLogger implements Logger {
  private PrintStream out;

  private FileLogger(String file) throws IOException {
    this.out = new PrintStream(new FileOutputStream(file), true);
  }

  @Override
  public void error(String msg) {
    out.println("ERROR: " + msg);
  }

  @Override
  public void debug(String msg) {
    out.println("DEBUG: " + msg);
  }
}
