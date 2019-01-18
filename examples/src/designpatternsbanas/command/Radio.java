package designpatternsbanas.command;

public class Radio implements ElectronicDevice {
  private int volume = 0;

  @Override
  public void on() {
    System.out.println("Radio is on");
  }

  @Override
  public void off() {
    System.out.println("Radio is off");
  }

  @Override
  public void volumeUp() {
    volume++;
    System.out.println("Radio Volume is at: " + volume);
  }

  @Override
  public void volumenDown() {
    volume--;
    System.out.println("Radio Volume is at: " + volume);
  }
}